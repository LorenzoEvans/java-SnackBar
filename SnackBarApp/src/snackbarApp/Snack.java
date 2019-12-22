package snackbarApp;
public class Snack extends VendingMachine {
    private static float snackID = 0.0f;
    private float snack_id;
    private String snack_name;
    private String button;
    private int quantity;
    private float cost;
    private float vendorCode = 0.0850f;
    private static float machineId;
    
    public Snack(String snack_name, 
                 int quantity, 
                 float cost, 
                 float machineId, 
                 String vending_machine_name, 
                 int id) {
        super(vending_machine_name, snack_inventory, vending_machine_id);
        snackID += snackID++ * vendorCode;
        snack_id = snackID;
        this.snack_name = snack_name;
        this.quantity = quantity;
        this.cost = cost;
        Snack.machineId = vending_machine_id;
    }

    // id getter
    public float getId() {
        return snack_id;
    }
    // id setter
    public void setId(float snack_id) {
        // call setId on the result of an integer (or float like 5.0) * vendorCode
        this.snack_id = snack_id;
    }
    // name getter
    public String getName() {
        return snack_name;
    }
    // name setter
    public void setName(String snack_name) {
        this.snack_name = snack_name;
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
    // public int buySnack(int quantity, String snack) {

    // }
    // get total cost given a quantity
    public void getTotal(int quantity, String choice) {
        // check for snack by name
        // find cost
        // mul cost quantity
        // return
        float snack;
        // choice = button number (kick back string/float id?),
    }
}