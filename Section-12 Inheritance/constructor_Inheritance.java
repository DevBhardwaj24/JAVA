public class constructor_Inheritance{
    public static void main(String[] args) {
        Child c1=new Child(2);
        System.out.println(c1.method());

    }
}

class Parent{
    public Parent(){
        System.out.println("hello");
    }
    public Parent(int x){
        System.out.println("ok");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("hello welcome");
    }
    public Child(int x,int y){
        super(x);
        System.out.println("not ok");
    }
    public Child(int y){
        System.out.println("thik haii");
    }
    public String method(){
        return "haa";
    }
}