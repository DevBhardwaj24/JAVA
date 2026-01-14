public class practising_Interface{
    public static void main(final String[] args) {
        Test t=new My();//use dynamic dispatch method
        t.meth1();
        t.meth2();
        My m=new My();
        m.meth3();
        
    }

}


interface Test{
    void meth1();
    void meth2();
}

class My implements Test{
    @Override
    public void meth1(){
        System.out.println("meth1");
    }
    @Override
    public void meth2(){
        System.out.println("meth2");
    }
    public void meth3(){
        System.out.println("meth3");
    }
} 