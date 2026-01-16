public class SleepIntrupt {
    public static void main(String[] args) {
        MyThread t=new MyThread("My Thread 1");

        t.start();
        t.interrupt();
    }
}


class MyThread extends Thread{
    public MyThread(String name){//that is a constructor
        super(name);
    }

    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try {
                Thread.sleep(200);// as this method throws unhandled exception we must catch that using try and catch block
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            // it means that it will print but with a short sleep duration
        }
    }
}