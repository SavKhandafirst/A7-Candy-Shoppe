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

    public IceCream(String name, int cost){
        super(name);
        this.cost = cost;
    }

    /**
     * 
     * @return simply return the cost  
     */
    @Override
    public int getCost(){
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
