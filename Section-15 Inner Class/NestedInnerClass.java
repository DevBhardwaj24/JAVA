public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerDisplay();

        Outer.Inner i=new Outer().new Inner();
        i.Display();

    }
}


class Outer{
    int x=10;

    class Inner{
        int y=20;

        void Display(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay(){
        Inner i=new Inner();
        i.Display();
        System.out.println(i.y);//can provide the acces to the inner class element
    }
}