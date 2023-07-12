/**
 * @author Simon Chung
 * @version 12/01/2022
 * @purpose This program uses insertion, selection, and merge sort to sort products based on
 * their name, number, price, and quantity.
 * (Implementation Class)
 */
public class M10_07Product {
    public String name;
    public int number, quantity;
    public double price;

    public M10_07Product(String name, int number, double price, int quantity) {
        this.name = name;
        this.number = number;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%-14s%-14d%-14.2f%d%n", name, number, price, quantity);
    }
}