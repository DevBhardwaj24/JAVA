public class method_Overriding {
    public static void main(String[] args) {
        // Child c1=new Child();
        // c1.display();
        Super su=new Sub();//output depend on the object method 
        su.m1();
        su.m2();

    }
    
}

class Super{
    public void m1(){
        System.out.println("hello");
     
    }
    public void  m2(){
        System.out.println("hello jii");

    }
}

class Sub extends Super{
    @Override
    public void m1(){
        System.out.println("hlo");
    }
    @Override
    public void m2(){
        System.out.println("hlooo");
    }
    public void m3(){
        System.out.println("hlooooo");
    }

}
