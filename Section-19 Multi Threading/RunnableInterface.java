public class RunnableInterface {
    public static void main(String[] args) {
        My m=new My();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while (true) {
            System.out.println(i+"from main class");
        }
    }
}
// in this one we have to ceate an object for thread cause if we talk aboult the prevoius one using the thread class it is already
// doing the same thing but have the thread class extended 

// here we have implement a runnable interface which basically means it can run ... so for making it thread we need thread object
class My implements Runnable{
    public void run(){
       int i=1;
        while (true) {
            System.out.println(i+"from MY class");
        } 
    }
}