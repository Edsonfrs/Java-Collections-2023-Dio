package list.basicOperations.ordering;

import java.util.*;

public class OrderingPerson  {
    private List<Person> personList;

    public OrderingPerson() {
        this.personList = new ArrayList<>();
    }

    public void addPersonToList(String name, int age, double height) {
        personList.add(new Person(name, age, height));
    }

    public List<Person> orderingPerAge() {
        List<Person> personsPerAge = new ArrayList<>(personList);
        Collections.sort(personsPerAge);
        return personsPerAge;
    }

    public List<Person> orderingPerHeight() {
        List<Person> personsPerHeight = new ArrayList<>(personList);
        Collections.sort(personsPerHeight, new ComparatorPerHeight());
        return personsPerHeight;
    }

    public static void main(String[] args) {
        OrderingPerson orderingPerson = new OrderingPerson();

        orderingPerson.addPersonToList("Allan", 20, 1.78);
        orderingPerson.addPersonToList("João", 30, 1.80);
        orderingPerson.addPersonToList("Maria", 19, 1.72);
        orderingPerson.addPersonToList("Lucas", 17, 1.75);
        orderingPerson.addPersonToList("Solange", 18, 1.71);
        orderingPerson.addPersonToList("Frodo", 35, 1.40);

        //System.out.println(orderingPerson.orderingPerHeight());
        System.out.println(orderingPerson.orderingPerAge());

    }
}


