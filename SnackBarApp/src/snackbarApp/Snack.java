package snackbarApp;

public class Snack {
    private static float snackID = 0 * 0.850f;
    private float id;
    private String name;
    private String button;
    private int quantity;
    private float cost;
    private float vendorCode = 0.0850f;
    private int machineId;

    public Snack(String name, int quantity, float cost, int machineId, String button) {
        snackID++;
        id = snackID;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.button = button ; // A3 B5 G2..etc
        this.machineId = machineId;
    }

    // id getter
    public float getId() {
        return id;
    }
    // id setter
    public void setId(float id) {
        // call setId on the result of an integer (or float like 5.0) * vendorCode
        this.id = id;
    }
    // name getter
    public String getName() {
        return name;
    }
    // name setter
    public void setName(String name) {
        this.name = name;
    }
    // cost getter
    public float getCost() {
        return cost;
    }
    // cost setter
    public void setCost(float cost) {
        this.cost = cost;
    }
    // machineId getter
    public int getMachineId() {
        return machineId;
    }
    // machineId setter
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }
    // quantity getter
    public int getQuantity() {
        return quantity;
    }
    // set quantity (receives 1 arg, int)
    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }
    // buy snack (receives 1 arg, int)
    // public int buySnack(int snack-q) {

    // }
    // get total cost given a quantity
    public void getTotal(int quantity, String choice) {
        // gonna need to search an object here.
        float snack;
        // choice = button number,
    }
}