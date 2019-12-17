package snackbarApp;

public class VendingMachine {
    private static int maxID = 0;
    private int id;
    private String name;

    // constructor
    public VendingMachine(String name, int id) {
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