public class StaticMember {
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        Test.Display();  // call static method in a static way
    }
}

class Test{
    static int x=10;
    int y=20;

    void show(){
        System.out.println(x+" "+y);// it can access the static member and also the non static one
    }

    static void Display(){
        System.out.println(x);// but this method can not access the non static members only the static one
    }
}