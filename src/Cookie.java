/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shezar Khan
 */
public class Cookie extends DessertItem {

    // instance variables
    private int number;
    private int pricePer12;

    /**
     *
     * @param name of cookie being held
     * @param number of cookies being stored
     * @param pricePer12 price of cookies per dozen(12)
     */
    public Cookie(String name, int number, int pricePer12) {
        // constructor
        super(name);
        this.number = number;
        this.pricePer12 = pricePer12;
    }

    /**
     *
     * @return calculate the cost of the cookies based on the number purchased
     * in dozens
     */
    @Override
    public int getCost() {
        // calculate cost
        int cost = (int) Math.round((number * pricePer12) / 12);
        return cost;
    }

    /**
     * 
     * @return output the information being formatted 
     */
    @Override
    public String toString() {
        // empty string
        String cookieOutput = "";
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
        cookieOutput += this.number + " @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePer12) + " /dz" + "\n" + super.getName();     
        // space between output and the end
        for (int i = 0; i < receiptWidth - centLength - lengthName; i++) {
            cookieOutput += " ";
        }
        // add cost already converted
        cookieOutput += cents2Dollars;
        // return statement
        return cookieOutput;  
        
    }

}
