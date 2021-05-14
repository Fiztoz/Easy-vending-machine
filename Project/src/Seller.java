/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fizto
 */
public class Seller implements SellIden {
    
    @Override
    public void Seller(int ID){
        int a = this.sellID;
     if(ID == a)
            System.out.println("You are Admin (/◕ヮ◕)/");
     
     else{
      System.out.println("You are not Admin (・へ・)");
      System.out.println("** Now you are Customer **");
     }     
     }

}
