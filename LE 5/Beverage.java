abstract class Beverage{
    void pour(int qty){
        System.out.println("pour"+qty+"ml of beverage");
    }
    protected abstract void addContiment();
    protected void stir(){}
    private void serve(){
        System.out.println("Serve through waiter");
        
    }
    
    public void templateMethod(int qty){
        pour(qty);
        addContiment();
        stir();
        serve();
    }
}