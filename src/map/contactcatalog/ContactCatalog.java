package map.contactcatalog;

import java.util.HashMap;
import java.util.Map;

public class ContactCatalog {
    private Map<String, Integer> contactCatalogMap;

    public ContactCatalog() {
        this.contactCatalogMap = new HashMap<>() ;
    }

    public void addContactToCatalog(String name, Integer phoneNumber) {
        contactCatalogMap.put(name, phoneNumber);
    }

    public void removeContactFromCatalog(String name) {
        if (!contactCatalogMap.isEmpty()) {
            contactCatalogMap.remove(name);
        }
    }

    public void showCatalog() {
        System.out.println(contactCatalogMap);
    }

    public Integer searchByPhoneNumber(String name) {
        Integer phoneNumberByName = null;
        if (!contactCatalogMap.isEmpty()) {
            phoneNumberByName = contactCatalogMap.get(name);
        }
        return phoneNumberByName;
    }

    public static void main(String[] args) {

        ContactCatalog contactCatalog = new ContactCatalog();

        contactCatalog.addContactToCatalog("Mary", 123456);
        contactCatalog.addContactToCatalog("Bram", 122345);
        contactCatalog.addContactToCatalog("Bram", 333333);
        contactCatalog.addContactToCatalog("Bram Stoker", 333444);
        contactCatalog.addContactToCatalog("Phillip", 123345);
        contactCatalog.addContactToCatalog("Algernon", 123445);
        contactCatalog.addContactToCatalog("Lovercraft", 555666);
        contactCatalog.addContactToCatalog("Howard", 123455);
        contactCatalog.addContactToCatalog("Agatha", 112345);
        contactCatalog.addContactToCatalog("Edgar", 654321);
        contactCatalog.addContactToCatalog("Fulano", 111111);

        contactCatalog.showCatalog();

        //contactCatalog.removeContactFromCatalog("Fulano");

        contactCatalog.showCatalog();

        System.out.println("The number is " + contactCatalog.searchByPhoneNumber("Algernon"));



    }
}
