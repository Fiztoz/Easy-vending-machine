
import java.util.*;
public class Main { //Main method
    public static void main(String[] args)
    {   
        
        Scanner scan = new Scanner(System.in);
        Seller seller = new Seller();
        
        Stock[] stock = new Stock[8];
        
       for (int i = 0; i < 8; i++) {
            stock[i] = new Stock();   //Create the student object
        }
       
        int cond = 0;
        do{
        double a,b,c,d=0;
        int ID = 0;
        String e;
        System.out.println("Are you Admin?(answer yes/y for admin)");
        System.out.print("--> ");
        e = scan.nextLine();
        if(e.equals("yes") ||e.equals("y"))
        {
            System.out.println("**** Enter your ID(enter<3>to exit as customer) *****");
            System.out.print("--> ");
            ID = scan.nextInt();
            seller.Seller(ID);          
        }
        else{
            System.out.println("");
            System.out.println("**************************");
            System.out.println("     You are customer");
            System.out.println("**************************");
        }
        if(ID != 8246){
        a = vendingMachine(stock);
        if(a!=0){
        System.out.println("");
        System.out.println("******************************");
        System.out.println("  Total value : "+(a)+" Baht");
        do{
         System.out.print("  Insert your money(Baht) : ");
         b = scan.nextDouble();
         d=d+b;
         c = d-a;
         
         System.out.println("******************************");
         if(c<0){
             c=c*-1;
         System.out.println("  Insert your money again....");   
         System.out.println("  You should insert "+c+" Baht more");
            c=c*-1;
         }
        }while(c<0);
        System.out.println("******************************");
         System.out.println("  Your change : "+(c)+" Baht");
         System.out.println("  Thank You for Your Order");
         System.out.println("******************************");
        }
        else
        System.out.println("   You not buy anything....");
        cond = 2;
        System.out.println("***** Visit me again ^.^ *****");
    }else{
           cond = AdminSet(stock);
        }
        }while(cond != 2);
        
        
    }

    private static double vendingMachine(Stock[] stock) {
        double a;
        double d=1;
        double b = 0;
        double c = 0;
        int qwe = 1;
        int[] stnum = new int[8];
        for (int i = 0; i < 8; i++) {
            stnum[i] = stock[i].numStock;
        }

        int num = 0,num1=0,num2 = 0;
        boolean goodInput = false;
        Scanner scan = new Scanner(System.in);
        do{
          do{
            try{
        System.out.println("");
        System.out.println("********  M E N U  ********");
        System.out.println("**1.Snacks");
        System.out.println("**2.Beverage");
        System.out.println("**3.Exit");
        
        System.out.print("** Choose your action : ");        
        num1 = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch (num1){
            case 1:
        Snacks snack;
            do{
                do{
            try{
        System.out.println("");
        System.out.println("******* Snack Menu *******");
        System.out.println("**1.Lays");
        System.out.println("**2.KitKat");
        System.out.println("**3.Pringles");
        System.out.println("**4.Exit"); 
        System.out.print("** Choose your snack : ");
        num2 = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        
        if(num2 >=1 && num2 <=4){
            
            if(num2 != 4){

            System.out.print("** Quantity of snack you need : ");
            qwe = scan.nextInt();
            }
            
            switch (num2) {
                case 1:
                    snack = new Lays(qwe);
                    if(qwe>stnum[0]){
                    System.out.println("!!!  Lack of Stock  !!!");
                    System.out.println("-> Stock Remaining : "+stnum[0]+ " <-");
                    System.out.println("-----  Try Again  -----");
                    }else{
                    snack.showItemValue();
                    snack.showItemNumber();
                    a= snack.getValueI();
                    stnum[0]=stnum[0]-qwe;
                    System.out.print("** Stock remaining : "+stnum[0]);
                    c= c+a*qwe;
                    }
                    break;
                case 2:
                    snack = new Kitkat(qwe);
                    if(qwe>stnum[1]){
                    System.out.println("!!!  Lack of Stock  !!!");
                    System.out.println("-> Stock Remaining : "+stnum[1]+ " <-");
                    System.out.println("-----  Try Again  -----");
                    }else{
                    snack.showItemValue();
                    snack.showItemNumber();
                    a= snack.getValueI();
                    stnum[1]=stnum[1]-qwe;
                    System.out.print("** Stock remaining : "+stnum[1]);
                    c= c+a*qwe;
                    }
                    break;
                case 3:
                    snack = new Pringles(qwe);
                    if(qwe>stnum[2]){
                    System.out.println("!!!  Lack of Stock  !!!");
                    System.out.println("-> Stock Remaining : "+stnum[2]+ " <-");
                    System.out.println("-----  Try Again  -----");
                    }else{
                    snack.showItemValue();
                    snack.showItemNumber();
                    a= snack.getValueI();
                    stnum[2]=stnum[2]-qwe;
                    System.out.print("** Stock remaining : "+stnum[2]);
                    c= c+a*qwe;
                    }
                    break;
                default:
                    System.out.println("*** Exit from Snacks Menu ***");
                    break;
            }
        }
        
        else{
        System.out.println("***  Not in the list....");
        }
        }while(num2!=4);            
                    break;
            case 2:
        Drink drink;
            do{
                do{
            try{
        System.out.println("");
        System.out.println("*******Beverage Menu*******");
        System.out.println("**1.Cocoa");
        System.out.println("**2.Coffee");
        System.out.println("**3.Tea");
        System.out.println("**4.Exit"); 
        System.out.print("** Choose your beverage : ");
        num = scan.nextInt();
        
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput == false);
        goodInput = false;
        if(num >=1 && num <=4){
            
            if(num != 4){

            System.out.print("** Quantity of beverage you need : ");
            qwe = scan.nextInt();
            }
            
            switch (num) {
                case 1:
                    drink = new Cocoa(qwe);
                    if(qwe>stnum[3]){
                    System.out.println("!!!  Lack of Stock  !!!");
                    System.out.println("-> Stock Remaining : "+stnum[3]+ " <-");
                    System.out.println("-----  Try Again  -----");
                    }else{
                    drink.showItemValue();
                    drink.showItemNumber();
                    a= drink.getValueI();
                    stnum[3]=stnum[3]-qwe;
                    System.out.print("** Stock remaining : "+stnum[3]);
                    b= b+a*qwe;
                    }
                    break;
                case 2:
                    drink = new Coffee(qwe);
                    if(qwe>stnum[4]){
                    System.out.println("!!!  Lack of Stock  !!!");
                    System.out.println("-> Stock Remaining : "+stnum[4]+ " <-");
                    System.out.println("-----  Try Again  -----");
                    }else{
                    drink.showItemValue();
                    drink.showItemNumber();
                    a= drink.getValueI();
                    stnum[4]=stnum[4]-qwe;
                    System.out.print("** Stock remaining : "+stnum[4]);
                    b= b+a*qwe;
                    }
                    break;
                case 3:
                    drink = new Tea(qwe);
                    if(qwe>stnum[5]){
                    System.out.println("!!!  Lack of Stock  !!!");
                    System.out.println("-> Stock Remaining : "+stnum[5]+ " <-");
                    System.out.println("-----  Try Again  -----");
                    }else{
                    drink.showItemValue();
                    drink.showItemNumber();
                    a= drink.getValueI();
                    stnum[5]=stnum[5]-qwe;
                    System.out.print("** Stock remaining : "+stnum[5]);
                    b= b+a*qwe;
                    }
                    break;
                default:
                    System.out.println("*** Exit from Beverage Menu ***");
                    break;
            }
        }
        
        else{
        System.out.println("*** Not in the list....");
        }
        }while(num!=4);
        break;
            case 3:
        System.out.println("");
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("**********   E X I T    **********");
        System.out.println("**********************************");
                    break;
            default:
        System.out.println("*** Not in the list....");
                break;
        }
        }while(num1 !=3);
        return ((double)b+c);
    }

   private static int AdminSet(Stock[] stock){
       Scanner scan = new Scanner(System.in);
       boolean goodInput = false;
       int[] ac = new int[8];
       int[] nm = new int[8];
       int result = 0;
       int tri=0;
       
       do{
            do{
            try{
       System.out.println("***** Setting Menu *****");
       System.out.println("** 1.Set Stock.");
       System.out.println("** 2.Check Stock.");
       System.out.println("** 3.Exit.");
       System.out.print("** Choose your action : ");    
        ac[0] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[0]){
            case 1 :
                
                do{
                    do{
            try{
       System.out.println("***** Setting Stock *****");
       System.out.println("** 1.Snacks.");
       System.out.println("** 2.Beverage.");
       System.out.println("** 3.Exit.");
       System.out.print("** Choose your action : ");        
        ac[1] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[1]){
            case 1 :
                
                do{
                    do{
            try{
       System.out.println("***** Snacks Stock *****");
       System.out.println("** 1.Lays.");
       System.out.println("** 2.KitKat.");
       System.out.println("** 3.Pringles.");
       System.out.println("** 4.Exit.");
       System.out.print("** Choose your action : ");        
        ac[2] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[2]){
            case 1 :
                do{
            try{
                System.out.print("** Quantity you want to add : "); 
                nm[0]= scan.nextInt();
                 goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
                stock[0].addStock(nm[0]);
                stock[0].showStock();
                break;
            case 2:
                  do{
            try{
                System.out.print("** Quantity you want to add : "); 
                nm[1]= scan.nextInt();
                goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
                stock[1].addStock(nm[1]);
                stock[1].showStock();
                break;
            case 3:
                 do{
            try{
                System.out.print("** Quantity you want to add : "); 
                nm[2]= scan.nextInt();
                   goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
                stock[2].addStock(nm[2]);
                stock[2].showStock();
                break;
            case 4:
            System.out.println("*** Exit from Setting Snacks Stock ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[2]!=4);
                
                break;
            case 2:
                
                do{
                     do{
            try{
       System.out.println("***** Snacks Stock *****");
       System.out.println("** 1.Cocoa.");
       System.out.println("** 2.Coffee.");
       System.out.println("** 3.Tea.");
       System.out.println("** 4.Exit.");
       System.out.print("** Choose your action : ");        
        ac[3] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[3]){
            case 1 :
                  do{
            try{
                System.out.print("** Quantity you want to add : "); 
                nm[3]= scan.nextInt();
                goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
                stock[3].addStock(nm[3]);
                stock[3].showStock();
                break;
            case 2:
                    do{
            try{
                System.out.print("** Quantity you want to add : "); 
                nm[4]= scan.nextInt();
                 goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
                stock[4].addStock(nm[4]);
                stock[4].showStock();
                break;
            case 3:
                 do{
            try{
                System.out.print("** Quantity you want to add : "); 
                nm[5]= scan.nextInt();
                 goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
                stock[5].addStock(nm[5]);
                stock[5].showStock();
                break;
            case 4:
            System.out.println("*** Exit from Setting Beverage Stock ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[3]!=4);
                
                break;
            case 3:
            System.out.println("*** Exit from Setting Stock Menu ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[1]!=3);
                
                break;
            case 2:
                
                do{
                    do{
            try{
       System.out.println("***** Checking Stock *****");
       System.out.println("** 1.Snacks.");
       System.out.println("** 2.Beverage.");
       System.out.println("** 3.Exit.");
       System.out.print("** Choose your action : ");        
        ac[1] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[1]){
            case 1 :
                
                do{
                    do{
            try{
       System.out.println("***** Snacks Stock *****");
       System.out.println("** 1.Lays.");
       System.out.println("** 2.KitKat.");
       System.out.println("** 3.Pringles.");
       System.out.println("** 4.Exit.");
       System.out.print("** Choose your action : ");        
        ac[2] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[2]){
            case 1 :
            System.out.println("*** You have Lays in Stock : "+stock[0].getNumStock()+" x");
                break;
            case 2:
            System.out.println("*** You have KitKat in Stock : "+stock[1].getNumStock()+" x");
                break;
            case 3:
            System.out.println("*** You have Pringles in Stock : "+stock[2].getNumStock()+" x");
                break;
            case 4:
            System.out.println("*** Exit from Checking Snacks Stock ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[2]!=4);
                
                break;
            case 2:
                
                do{
                     do{
            try{
       System.out.println("***** Snacks Stock *****");
       System.out.println("** 1.Cocoa.");
       System.out.println("** 2.Coffee.");
       System.out.println("** 3.Tea.");
       System.out.println("** 4.Exit.");
       System.out.print("** Choose your action : ");        
        ac[3] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[3]){
            case 1 :
            System.out.println("*** You have Cocoa in Stock : "+stock[3].getNumStock()+" x");
                break;
            case 2:
            System.out.println("*** You have Coffee in Stock : "+stock[4].getNumStock()+" x");
                break;
            case 3:
            System.out.println("*** You have Tea in Stock : "+stock[5].getNumStock()+" x"); 
                break;
            case 4:
            System.out.println("*** Exit from Checking Beverage Stock ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[3]!=4);
                
                break;
            case 3:
            System.out.println("*** Exit from Checking Stock Menu ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[1]!=3);
                
                break;
            case 3:
            System.out.println("*** Exit from Setting Menu ***");    
                break;
            default:
            System.out.println("*** Not in the list....");
                break;  
        }
        }while(ac[0]!=3);
       
       
       do{
        do{
            try{
       System.out.println("****  Wanna Continue as Customer ?  ****");
       System.out.println("** 1.Yes.");
       System.out.println("** 2.No.");
       System.out.print("** Choose your action : ");        
        ac[5] = scan.nextInt();
        goodInput = true;
            }catch(InputMismatchException e) {
                scan.nextLine();  //to clear \n from scanner
                System.out.println("**Input is not a number");
                System.out.println("**Try again");
            }
        }while(goodInput==false);
        goodInput = false;
        switch(ac[5]){
            case 1 :
                result=1;
                System.out.println("*** STAY AS CUSTOMER ***");
                tri=1;
                break;
            case 2 :
                result=2;
                tri=1;
                System.out.println("*** EXIT THE PROGRAM ***");
                break;
            default :
                tri=2;
            System.out.println("*** Not in the list....");
                break;  
        }
        
       }while(tri!=1);
       return result;
   }
}