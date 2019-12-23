package snackbarApp;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Customer jane = new Customer("Jane", 45.25f);
        Customer bob = new Customer("Bob", 33.14f);
        // food machine snacks
        Snack chips = new Snack("Chips", 36, 1.75f, "Food");
        Snack chocolate_bar = new Snack("Chocolate Bar", 36, 1.00f, "Food");
        Snack pretzel = new Snack("Pretzel", 30, 2.00f, "Food");
        // drink machine snacks
        Snack soda = new Snack("Pepsi", 24, 2.50f, "Drink");
        Snack water = new Snack("Dasani", 20, 2.75f, "Drink");
        
        // food machine
        ArrayList<Snack> food_inventory = new ArrayList<>();
        food_inventory.add(chips);
        food_inventory.add(chocolate_bar);
        food_inventory.add(pretzel);
        VendingMachine food = new VendingMachine("Food", food_inventory);
        // drink machine
        VendingMachine drink = new VendingMachine("Drink");
        // office machine
        VendingMachine office = new VendingMachine("Office");
        // food.setInventory({"Chips",});
        System.out.println("Almost there");
    }

}