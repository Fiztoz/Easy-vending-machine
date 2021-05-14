/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fizto
 */
public class Stock {
    public int numStock=20;
    
    public void addStock(int stock){
        this.numStock = this.numStock+stock;
    }

    public int getNumStock() {
        return numStock;
    }
    
    public void showStock(){
        
        System.out.println("** Quantity in stock : "+numStock);
        System.out.println("********************************");
        
    }
   
    
    
}
