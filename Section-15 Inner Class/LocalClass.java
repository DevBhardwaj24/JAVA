public class LocalClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.Display();
    }
}

class Outer{

    void Display(){
        class Inner{
            void innerDisplay(){
                System.out.println("hello");
            }
        }

        Inner i=new Inner();
        i.innerDisplay();
    }
}