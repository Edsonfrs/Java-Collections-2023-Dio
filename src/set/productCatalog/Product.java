package set.productCatalog;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product>{

    private long id;
    private String name;
    private double price;
    private int quantity;

    public Product(long id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Product p) {
        return name.compareToIgnoreCase(p.getName());
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getId() == product.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return
                "Id: " + id +
                " Name: " + name + '\'' +
                " Price: " + price +
                " Quantity: " + quantity +
                "\n";
    }

    static class ComparatorByPrice implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }

    }




}
