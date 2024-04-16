package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem item1 = new MenuItem("Caesar Salad", 7.99, "Fresh romaine lettuce with Caesar dressing", "Appetizer", true);
        MenuItem item2 = new MenuItem("Margherita Pizza", 12.99, "Classic pizza with tomato sauce, mozzarella, and basil", "Main Course", false);
        MenuItem item3 = new MenuItem("Tiramisu", 8.99, "Italian dessert made with layers of coffee-soaked ladyfingers and mascarpone cheese", "Dessert", true);

        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        System.out.println("Menu:");
        menu.displayMenu();

        System.out.println("\nDetails of Margherita Pizza:");
        menu.displayMenuItem("Margherita Pizza");

        System.out.println("\nRemoving Caesar Salad from the menu...");
        menu.removeItem("Caesar Salad");

        System.out.println("\nUpdated Menu:");
        menu.displayMenu();

        System.out.println("\nLast updated: " + menu.getLastUpdate());
    }
}