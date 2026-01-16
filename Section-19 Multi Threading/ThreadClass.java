public class ThreadClass {
    public static void main(String[] args) {
        Mythread t=new Mythread();
        t.start();

        int i=1;
        while (true) {
            System.out.println(i+"from main class");
        }
    }
}


class Mythread extends Thread{
    public void run(){
        int i=1;
        while (true) {
            System.out.println(i+"from mythread class");
        }
    }
}

//it will show mixed result cause CPU is executing the thread and the main statement with a fraction of milisec delay and both the methods are infinitly runnable