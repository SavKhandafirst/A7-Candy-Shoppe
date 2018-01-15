/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shezar Khan
 */
public class Candy extends DessertItem {

    // instance variables
    private double weight;
    private int pricePerLbs;

    public Candy(String name, double weight, int pricePerLbs) {
        // constructor
        super(name);
        this.weight = weight;
        this.pricePerLbs = pricePerLbs;
    }

    /**
     *
     * @return the price of the candy based on the weight multiplied by the
     * price per pound
     */
    @Override
    public int getCost() {
        // calculate cost, rounded
        int cost = (int) Math.round(this.weight * this.pricePerLbs);
        return cost;
    }

    /**
     *
     * @return output the information being formatted (candy, weight, price per
     * pound)
     */
    @Override
    public String toString() {
        // empty string
        String candyOutput = "";
        // converting the cost to dollars from cents
        String cents2Dollars = DessertShoppe.cents2dollarsAndCents(this.getCost());
        // determine length of name
        int lengthName = super.getName().length();
        // determine space available for cost to be placed
        int spaceLeft = DessertShoppe.RECEIPT_WIDTH - lengthName;
        // format the information given 
        candyOutput += this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerLbs) + " /lb." + "\n" + super.getName();
        // return
        return candyOutput;    
    }

}
