class MyThread extends Thread{
    public MyThread(String name){//that is a constructor
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
}

public class MethodsConstructors {
    public static void main(String[] args) throws Exception{
        MyThread t=new MyThread("My Thread 1");

        System.out.println(t.threadId());// getId method is gor depricated 
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.start();
        System.out.println(t.getState());// it will show the state until we start the thread then it will show runnable state
        System.out.println(t.isAlive());
    }
}

