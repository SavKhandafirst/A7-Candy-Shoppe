/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CHANGE_THIS_TO_YOUR_NAME
 */
public class Sundae extends IceCream{
    private String icName;
    private int icCost;
    private String toppingName;
    private int toppingCost;

    public Sundae(String icName, int icCost, String toppingName, int toppingCost) {
       this.icName = icName;
       this.icCost = icCost;
       this.toppingName = toppingName;
       this.toppingCost = toppingCost;
    }
    /**
     * 
     * @return 
     */
    @Override
    public int getCost(){
        int cost = this.icCost + this.toppingCost;
        return cost;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        
    }
    
}
