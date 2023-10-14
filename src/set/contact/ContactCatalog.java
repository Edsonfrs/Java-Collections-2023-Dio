package set.contact;

import java.util.HashSet;
import java.util.Set;

public class ContactCatalog {
    private Set<Contact> setContact;

    public ContactCatalog() {
        this.setContact = new HashSet<>();
    }

    public void addContactToCatalog(String name, int phoneNumber) {
        setContact.add(new Contact(name, phoneNumber));
    }

    public void showContactCatalog(){
        System.out.println(setContact);
    }

    public Set<Contact> searchByName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        for (Contact c : setContact) {

            if (c.getName().startsWith(name)) {
                contactsByName.add(c);
            }
        }
        return contactsByName;
    }

    public Contact updatePhoneNumber(String name, int newPhoneNumber) {
        Contact updatedContact = null;
        for (Contact c : setContact) {
            if(c.getName().equalsIgnoreCase(name)){
                c.setPhoneNumber(newPhoneNumber);
                updatedContact = c;
                break;
            }
        }
        return updatedContact;
    }

    public static void main(String[] args) {
        ContactCatalog contactCatalog = new ContactCatalog();

        contactCatalog.showContactCatalog();

        contactCatalog.addContactToCatalog("Bram", 933333333);
        contactCatalog.addContactToCatalog("Mary", 922222222);
        contactCatalog.addContactToCatalog("Mary Shelley", 929292929);
        contactCatalog.addContactToCatalog("Edgar", 944444444);
        contactCatalog.addContactToCatalog("Fernando", 987524136);
        contactCatalog.addContactToCatalog("Fernando Pessoa", 95555555);
        contactCatalog.addContactToCatalog("Nathaniel", 995845236);
        contactCatalog.addContactToCatalog("Miguel", 987523895);
        contactCatalog.addContactToCatalog("Mary Frank's Mom", 939393939);
        contactCatalog.addContactToCatalog("Mary Monsters Mom", 959595959);
        //contactCatalog.addContactToCatalog("Miguel", 98888888);

        //contactCatalog.showContactCatalog();


        System.out.println(contactCatalog.searchByName("Mary"));

        //System.out.println(contactCatalog.searchByName("Fernando"));

        System.out.println("Contact updated: " + contactCatalog.updatePhoneNumber("Mary Monsters Mom", 966666666));

        contactCatalog.showContactCatalog();

    }



}
