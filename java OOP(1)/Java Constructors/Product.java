public class Product {
    String productName;
    double price;

    Product(String name, double cost) {
        productName = name;
        price = cost;
    }

    void showProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 799.99);
        p1.showProduct();
    }
}
