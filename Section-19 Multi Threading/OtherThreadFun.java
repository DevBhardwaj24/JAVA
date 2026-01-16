class MyThread extends Thread{
    public MyThread(String name){//that is a constructor
        super(name);
    }

    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            
        }
    }
}

public class OtherThreadFun {
    public static void main(String[] args) throws Exception{
        MyThread t=new MyThread("Mythread");
        t.setDaemon(true);// deamon threads are dependent threads if the function is terminated than daemon also gets terminated..
        t.start();
        

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // that means that only the values got printed in 10 milisec cause after that it is going to get terminated
    }
}


// 2 more methods are there that is join(it waits for other thread to get excuted after the main is already termminated and waiting for other ones) and yeild(which give more time to other methods )