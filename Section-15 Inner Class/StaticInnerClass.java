public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner i=new Outer.Inner();
        i.Display();
    }
}

class Outer{
    static int x=10;
    static int y=20;

    static class Inner{
        void Display(){
            System.out.println(x);
            System.out.println(y);
        }
    }
}