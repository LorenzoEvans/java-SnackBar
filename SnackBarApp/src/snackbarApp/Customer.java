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

    public boolean checkBalance(float cost) {
        // check if there's enough cash in balance [done]
        if (cash >= cost) {
            return true;
        } else {
            return false;
        }
    }

    public void alterBalance(float cost){
         // alter the cash balance, subtracting the cost [done]
        float new_balance = 0.0f;
        if (checkBalance(cost)) {
            new_balance = cash - cost;
            cash = new_balance;
        }
        else {
            throw new java.lang.Error("Not enough cash in balance");
        }

    

    }

    public void buySnack(String snack, int quantity, VendingMachine machine) {
            // does vending machine have snack? 
            // if snack is in machine.inventory
                // inventory is an array of "snacks"
                // for every element in the array, are any of their names
                // equivalent to snack?
                // if so:
                    // does it have *enough* of the snack?
                    // does snack quantity >= purchase quantity
                        // if so:
                            // do we have enough to buy the quantity we want?
                            // if snack quantity * cost <= cash_balance
                                // make purchase
    }

    @Override
    public String toString() {
        String rtnStr;
        rtnStr = "Name: " + name + "\n" + "Cash Balance: " + cash;
        return rtnStr;
    }
}




    // to make a purchase we must:
        // check if there's enough stock
            // check stock should be a function but...on the Vending machine
            // this is done on the Customer object bc it has the cash

