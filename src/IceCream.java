/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shezar Khan
 */
public class IceCream extends DessertItem {
    
    //instance variables
    private int cost;

    /**
     *
     * @param name of ice cream being held
     * @param cost of ice cream being stored
     */
    public IceCream(String name, int cost){
        // constructor
        super(name);
        this.cost = cost;
    }

    /**
     * 
     * @return cost of ice cream
     */
    @Override
    public int getCost(){
        return cost;
    }
  
    /**
     * 
     * @return output the information being formatted 
     */
    @Override
    public String toString() {
        // empty string
        String icecreamOutput = "";
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
        // recieve information given
        icecreamOutput += super.getName();     
        // space between output and the end
        for (int i = 0; i < receiptWidth - centLength - lengthName; i++) {
            icecreamOutput += " ";
        }
        // add cost already converted
        icecreamOutput += cents2Dollars;    
        // return statement
        return icecreamOutput; 
    }
     
}
