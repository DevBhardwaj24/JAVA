public class InterThreadCommunication {
    public static void main(String[] args) {
        MyData1 d=new MyData1();

        Producer p=new Producer(d);
        Consumer c=new Consumer(d);

        p.start();
        c.start();
    }
}

class MyData1{
    int value;

    boolean flag=true;

    synchronized public void set(int v){// method for writing the value
        while(flag!=true){
            try{wait();}catch(Exception e){}
        }
        value=v;
        flag=false;
        notify();
    }

    synchronized public int get(){// method for reading the value
        int x=0;
        while(flag!=false){
            try{wait();}catch(Exception e){}
        }
        x=value;
        flag=true;
        notify();

        return x;
    }
}

class Producer extends Thread{
    MyData1 data;

    public Producer(MyData1 d){
        data=d;
    }

    public void run(){
        int count=1;
        while(true){
            data.set(count);
            System.out.println("Producer "+ count);
            count++;
        }
    }
}

class Consumer extends Thread{
    MyData1 data;

    public Consumer(MyData1 d){
        data=d;
    }

    public void run(){
        int value;
        while(true){
            value=data.get();
            System.out.println("Consumer "+value);
        }
    }
}