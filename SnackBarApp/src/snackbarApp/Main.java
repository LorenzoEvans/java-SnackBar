package snackbarApp;

public class Main {
    
    public static void main(String[] args) {
        Customer jane = new Customer("Jane", 45.25f);
        Customer bob = new Customer("Bob", 33.14f);
        VendingMachine food = new VendingMachine("Food");
        Snack chips = new Snack("Chips", 36, 1.75);
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        // food.setInventory({"Chips",});
        System.out.println("Almost there");
    }

}