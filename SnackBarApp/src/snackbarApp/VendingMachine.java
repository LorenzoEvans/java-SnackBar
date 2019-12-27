package snackbarApp;
import java.util.*;
public class VendingMachine {
    private static float machineID = 0.0f;
    public static float vending_machine_id;
    private float machineVendorCode = 0.287f;
    // vendor code unique to vending machines
    public String vending_machine_name;
    // how do we represent inventory?
    public static ArrayList<Snack> snack_inventory = new ArrayList<Snack>(); 
    // constructor
    public VendingMachine(String new_machine_name, ArrayList<Snack> inventory) {
        machineID += machineID++ * machineVendorCode;
        vending_machine_id = machineID;
        snack_inventory = inventory;
        vending_machine_name = new_machine_name;
    }

    public void setInventory(ArrayList<Snack>stock){
        // so we have to read from this map of snacks and quantities
        // and add them into inventory *on top* of what is already there
        // inventory.put("Danish", 15);
        // inventory.put("Twizzlers", 9);
        // ** we'll swap them out for now **
        VendingMachine.snack_inventory = stock;
    }

    public void setSnack(String snack, int quantity) {
        int inventory_size = this.snack_inventory.size();
        ArrayList<Snack> inventory = this.snack_inventory;
        for (int i = 0; i <= inventory_size; i++) {
            if (inventory.get(i).snack_name == snack) {
                inventory.get(i).setQuantity(quantity);
            }
            else { throw new java.lang.Error("Snack not in machine");}
        }
    }

    public ArrayList<Snack> getInventory() {
        // probably gonna be a pointer.
        return snack_inventory;
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


