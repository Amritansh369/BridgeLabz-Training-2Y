class Product {
    private static double discount = 10.0;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void displayDetails() {
        if (this instanceof Product) {
            double totalPrice = price * quantity;
            double discountedPrice = totalPrice - (totalPrice * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: ₹" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price after Discount: ₹" + discountedPrice);
            System.out.println("-------------------------");
        } else {
            System.out.println("Not a valid Product object!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000, 1, 201);
        Product p2 = new Product("Headphones", 2000, 2, 202);
        p1.displayDetails();
        p2.displayDetails();
        Product.updateDiscount(20.0);
        System.out.println("After updating discount:");
        p1.displayDetails();
        p2.displayDetails();
    }
}
