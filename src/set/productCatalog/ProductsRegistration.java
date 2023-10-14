package set.productCatalog;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductsRegistration {

    private Set<Product> productsSet;

    public ProductsRegistration() {
        this.productsSet = new HashSet<>();
    }

    public void addProductToSet(long id, String name, double price, int quantity){
        productsSet.add(new Product(id, name, price, quantity));
    }

    public Set<Product> displayProductsByName() {
        Set<Product> productsByName =  new TreeSet<>(productsSet);
        return productsByName;

    }

    public Set<Product> displayProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new Product.ComparatorByPrice());
        productsByPrice.addAll(productsSet);
        return productsByPrice;
    }

    public static void main(String[] args) {

        ProductsRegistration productsRegistration = new ProductsRegistration();

        productsRegistration.addProductToSet(1L, "Smartphone", 1000d, 10);
        productsRegistration.addProductToSet(2L, "Notebook", 1500d, 5);
        productsRegistration.addProductToSet(3L, "Mouse", 30d, 20);
        productsRegistration.addProductToSet(4L, "Teclado", 50d, 15);
        productsRegistration.addProductToSet(5L, "MotherBoard", 1200d, 5);

        System.out.println(productsRegistration.productsSet);

        System.out.println(productsRegistration.displayProductsByName());

        System.out.println(productsRegistration.displayProductsByPrice());
    }










}
