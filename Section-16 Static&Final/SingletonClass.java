public class SingletonClass {


    public static void main(String[] args) {
        CoffeeMachine c = CoffeeMachine.getInstance();
        System.out.println(c);
    }
}


class CoffeeMachine{
    private final int coffeeQty;
    private final int waterQty;

    static private CoffeeMachine ours=null;

    private CoffeeMachine(){
        coffeeQty=1;
        waterQty=1;
        System.out.println("hello: coffeeQty=" + coffeeQty + " waterQty=" + waterQty);
    }

    static public CoffeeMachine getInstance(){
        if(ours==null){
            ours=new CoffeeMachine();
            
        }
        return ours;
    }


}