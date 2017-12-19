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
     * @return 
     */
    @Override
    public String toString() {

    }

}
