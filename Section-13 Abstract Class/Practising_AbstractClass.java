public class Practising_AbstractClass {
    public static void main(String[] args) {
        Super s=new Sub();
        s.meth();
        s.meth1();
    }
}


abstract class Super{
    
    public Super(){System.out.println("super constructor");}

    public void meth(){
        System.out.println("meth of super");
    }

    abstract public void meth1();// these classes just meant for inheritence and we need to declare them
}

class Sub extends Super{
    @Override
    public void meth1(){
        System.out.println("meth1 of super abstract class");
    }
}