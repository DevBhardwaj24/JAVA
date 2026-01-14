public class example_of_interface {
    public static void main(String[] args) {
        Smartphone smt=new Smartphone();
        smt.play();
        smt.stop();
        smt.phn();
        
    }
}

class Phone{
    void phn(){
        System.out.println("your phone is linging");
    }

    void msg(){
        System.out.println("babu ka msg");
    }

}

interface musicPlayer{
    void play();
    void stop();
}

interface Icamera{
    void click();
}

class Smartphone extends Phone implements musicPlayer,Icamera{

    @Override
    public void play(){
        System.out.println("ganna chalu");

    }
    @Override
    public void stop(){
        System.out.println("ganna band");
    }

    @Override
    public void click(){
        System.out.println("phto click");
    }


}