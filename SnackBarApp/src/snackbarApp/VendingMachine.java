package snackbarApp;

public class VendingMachine {
    private static float maxID = 0 * 0.287f;
    private float id;
    private String name;

    // constructor
    public VendingMachine(String name, float id) {
        maxID++;
        id = maxID;
        this.name = name;
    }

    // getter for name
    public String getVendingMachineName() {
        return name;
    }
    // setter for name
    public void setVendingMachineName(String name) {
        this.name = name;
    }
}