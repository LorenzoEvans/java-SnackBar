package snackbarApp;

public class Snack {
    private static int snackID = 0;
    private String name;
    private int quantity;
    private float cost;
    private int machineId;

    public Snack(String name, int quantity, float cost, int machineId) {
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    // id getter
    public int getId() {
        return id;
    }
    // id setter
    public void setId(int id) {
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
    // machineId getter
    // machineId setter
    // quantity getter
    // set quantity (receives 1 arg, int)
    // buy snack (receives 1 arg, int)
    // get total cost given a quantity
}