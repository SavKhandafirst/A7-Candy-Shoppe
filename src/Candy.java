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

    }

}
