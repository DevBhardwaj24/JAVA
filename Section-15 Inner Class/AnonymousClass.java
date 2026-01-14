public class AnonymousClass{
    public static void main(String[] args) {
        
    }
}

abstract class My{
    abstract void Display();
}

class Outer{
    public void meth(){
        My m=new My(){
            @Override
            public void Display(){
                System.out.println("hello");
            }
        };
        m.Display();
        
    }
}