package snackbarApp;

public class VendingMachine {
    private static float maxID = 0 * 0.287f;
    public float vending_machine_id;
    public String vending_machine_name;

    // constructor
    public VendingMachine(String vending_machine_name, float id) {
        maxID++;
        this.vending_machine_id = maxID;
        this.vending_machine_name = vending_machine_name;
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


