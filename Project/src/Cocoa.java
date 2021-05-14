/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fizto
 */
public class Cocoa extends Drink{
    
    public Cocoa(int numI){
    System.out.println("   >>> COCOA ");
    this.valueI = 20;
    this.numI = numI;
}
    @Override
    public void showItemValue(){
        System.out.println("******************************");
        System.out.println("  Value of this item : "+valueI);
    }

    @Override
    public void showItemNumber() {
        System.out.println("  Quantity of beverages : "+numI);
        System.out.println("******************************");
    }

    @Override
    public double getValueI() {
        return valueI;
    }

    @Override
    public double getNumI() {
        return numI;
    }
    
    }
    

