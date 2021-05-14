public class Tea extends Drink{
    
    public Tea(int numI){
    System.out.println("   >>> Tea ");
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