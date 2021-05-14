public class Pringles extends Snacks{
    
    public Pringles(int numI){
    System.out.println("   >>> Pringles ");
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
        System.out.println("  Quantity of snack : "+numI);
        System.out.println("******************************");
    }

    public double getValueI() {
        return valueI;
    }

    public double getNumI() {
        return numI;
    }
}
