package list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemList;

    public Cart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        Item item = new Item(name, price, quantity);
        this.itemList.add(item);
    }

    public void removeItem(String name) {
        List<Item> itemsToRemove = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getName().equalsIgnoreCase(name)) {
                itemsToRemove.add(i);
            }
        }
        itemList.removeAll(itemsToRemove);
    }

    public int getTotalNumberOfItens(){
        return  itemList.size();
    }


    public double calculateTotalValue() {
        double totalAmount = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList){
                double itemValue = item.getPrice() * item.getQuantity();
                totalAmount += itemValue;
            }
            return totalAmount;
        } else {
            throw new RuntimeException("The list is empty");
        }
    }

    public void showItens() {
        if (!itemList.isEmpty()){
            System.out.println(this.itemList);
        } else {
            System.out.println("The list is empty");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addItem("Pencil", 1.50, 5);
        cart.addItem("Book", 13.05, 2);
        cart.addItem("Notebook", 5.85, 4);
        cart.addItem("Pen", 1.80, 3);
        cart.addItem("Penx", 1.80, 3);

        System.out.println("Total of itens: " + cart.getTotalNumberOfItens());
        cart.showItens();

        cart.removeItem("Penx");
        System.out.println("Total of itens: " + cart.getTotalNumberOfItens());
        cart.showItens();

        System.out.println("Total purchase price: " + cart.calculateTotalValue());
    }
}
