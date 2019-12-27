package snackbarApp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Customer jane = new Customer("Jane", 45.25f);
        Customer bob = new Customer("Bob", 33.14f);
        // food machine snacks
        Snack chips = new Snack("Chips", 36, 1.75f, "Food");
        Snack chocolate_bar = new Snack("Chocolate-Bar", 36, 1.00f, "Food");
        Snack pretzel = new Snack("Pretzel", 30, 2.00f, "Food");
        // drink machine snacks
        Snack soda = new Snack("Pepsi", 24, 2.50f, "Drink");
        Snack water = new Snack("Dasani", 20, 2.75f, "Drink");
        
        ArrayList<Snack> food_inventory = new ArrayList<Snack>();
        
        food_inventory.add(chips);
        food_inventory.add(chocolate_bar);
        food_inventory.add(pretzel);
        
        ArrayList<Snack> drink_inventory = new ArrayList<Snack>();
        
        drink_inventory.add(soda);
        drink_inventory.add(water);
        
        ArrayList<Snack> office_inventory = new ArrayList<Snack>();
        
        office_inventory.add(chips);
        office_inventory.add(chocolate_bar);
        office_inventory.add(pretzel);
        office_inventory.add(soda);
        office_inventory.add(water);
        
        // food machine
        VendingMachine food = new VendingMachine("Food", food_inventory);
        // drink machine
        VendingMachine drink = new VendingMachine("Drink", drink_inventory);
        // office machine
        VendingMachine office = new VendingMachine("Office", office_inventory);
        // jane buys three sodas
        jane.buySnack("Soda", 3, drink);
        // check jane's balance
        System.out.println(jane.getCash());
        // check drink quantity
        System.out.println(drink.snack_inventory.get(0).getQuantity());

        // jane buys one pretzel
        jane.buySnack("Pretzel", 1, office);
        // check janes balance
        System.out.println(jane.getCash());
        // check pretzel quantity
        System.out.println(office.snack_inventory.get(2).getQuantity());

        // bob buys two sodas
        bob.buySnack("Pepsi", 2, drink);
        // check bobs balance
        System.out.println(bob.getCash());
        // check drink quantity
        System.out.println(drink.snack_inventory.get(0).getQuantity());
        jane.addCash(10.00f);
        jane.buySnack("Chocolate-Bar", 1, office);
        System.out.println(jane.getCash());
        System.out.println(office.snack_inventory.get(1).getQuantity());



    }

}