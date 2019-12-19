package snackbarApp;
import java.util.HashMap;
public class VendingMachine {
    private static float maxID = 0 * 0.287f;
    private float vending_machine_id;
    public String vending_machine_name;
    // how do we represent inventory?
    public HashMap<String, Integer> inventory = new HashMap<>();

    // constructor
    public VendingMachine(String vending_machine_name, HashMap<String, Integer> inventory) {
        maxID++;
        vending_machine_id = maxID;
        this.vending_machine_id = maxID;
        this.inventory = inventory;
        this.vending_machine_name = vending_machine_name;
    }

    public void setInventory(HashMap<String, Integer>stock){
        // so we have to read from this map of snacks and quantities
        // and add them into inventory *on top* of what is already there
        // inventory.put("Danish", 15);
        // inventory.put("Twizzlers", 9);
        // ** we'll swap them out for now **
        inventory = stock;
    }

    // getter for name
    public String getVendingMachineName() {
        return vending_machine_name;
    }
    // setter for name
    public void setVendingMachineName(String vending_machine_name) {
        this.vending_machine_name = vending_machine_name;
    }

    // public int buySnack(int quantity) {

    // }
}


