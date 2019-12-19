package snackbarApp;

public class Customer {
    private static float maxID = 0 * 0.347f;
    private float id;
    private String name;
    private float cash = 0.0f;

    // constructor
    public Customer(String name, float cash) {
        maxID++;
        id = maxID;
        this.name = name;
        this.cash = cash;
    }

    // getter for name
    public String getCustomerName(){
        return name;
    }
    // setter for name
    public void setCustomerName(String name) {
        this.name = name;
    }

    public float checkBalance(float cost) {
        float new_balance = 0.00f;
        if (cash >= cost) {
            new_balance = cash - cost;
            return new_balance;
        }
        else {
            throw new java.lang.Error("Not enough cash in balance.");
        }
        
    }



    // to make a purchase we must:
        // check if there's enough cash in balance
            // check cash should be it's own function
        // check if there's enough stock
            // check stock should be a function but...on the Vending machine
        // alter the cash balance, subtracting the cost 
            // this is done on the Customer object bc it has the cash
        // done

}