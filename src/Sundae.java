/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shezar Khan
 */
public class Sundae extends IceCream {

    // instance variables
    private String toppingName;
    private int costOfTopping;

    /**
     *
     * @param icName name of ice cream passed 
     * @param icCost cost of ice cream passed
     * @param toppingName name of the topping
     * @param costOfTopping cost of the topping
     */
    public Sundae(String icName, int icCost, String toppingName, int costOfTopping) {
        // constructor
        super(icName, icCost);
        this.toppingName = toppingName;
        this.costOfTopping = costOfTopping;
    }

    /**
     *
     * @return the cost of ice cream plus its topping
     */
    @Override
    public int getCost() {
        // cost of icecream plus cost of topping being returned
        return (super.getCost() + this.costOfTopping);
    }

    /**
     *
     * @return output the information being formatted 
     */
    @Override
    public String toString() {
        // empty string
        String sundaeOutput = "";
        // converting the cost to dollars from cents
        String cents2Dollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // determining space alloted by cost
        int centLength = DessertShoppe.cents2dollarsAndCents(this.getCost()).length();
        // determine length of name
        int lengthName = super.getName().length();
        // store width of reciept
        int receiptWidth = DessertShoppe.RECEIPT_WIDTH;
        // determine space available for cost to be placed
        int spaceLeft = receiptWidth - lengthName;
        // format the information given 
        sundaeOutput += this.toppingName + " Sundae with" + "\n" + super.getName();  
        // space between output and the end
        for (int i = 0; i < receiptWidth - centLength - lengthName; i++) {
            sundaeOutput += " ";
        }
        // add cost already converted
        sundaeOutput += cents2Dollars;
        // return statement
        return sundaeOutput; 

    }

}
