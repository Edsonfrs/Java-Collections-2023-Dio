package map.productstock;

import java.util.HashMap;
import java.util.Map;

public class ProductStock {

    private Map<Long, Product> productStockMap;

    public ProductStock() {
        this.productStockMap = new HashMap<>();
    }

    public void addProductToStock(long id, String name, int quantity, double price) {
        productStockMap.put(id, new Product(name, price, quantity));
    }

    public void displayStock(){
        System.out.println(productStockMap);
    }

    public double totalStockValue() {
        double totalStockValueCalculated = 0;
        if (!productStockMap.isEmpty()) {
            for (Product p : productStockMap.values() ) {
                totalStockValueCalculated += p.getQuantity() * p.getPrice();
            }
        }
        return totalStockValueCalculated;
    }

    public Product getMoreExpensiveProduct() {
        Product moreExpensiveProduct = null;
        double biggerPrice = Double.MIN_VALUE;

        if (!productStockMap.isEmpty()) {
            for (Product p : productStockMap.values()) {
                if (p.getPrice() > biggerPrice) {
                    moreExpensiveProduct = p;
                }
            }
        }
        return moreExpensiveProduct;
    }

    public static void main(String[] args) {
        ProductStock stock = new ProductStock();

        stock.displayStock();

        stock.addProductToStock(1L, "The Call Of Cthulhu", 10, 75.73);
        stock.addProductToStock(2L, "The Keep", 5, 17.88);
        stock.addProductToStock(4L, "Salem", 2, 51.09);
        stock.addProductToStock(5L, "Dracula", 2, 58.99);
        stock.addProductToStock(3L, "Paradise Lost", 3, 189.98);

        stock.displayStock();

        System.out.println("Total stock value: $ " + stock.totalStockValue());
        System.out.println("Product more expensive: $ " + stock.getMoreExpensiveProduct());

    }

}
