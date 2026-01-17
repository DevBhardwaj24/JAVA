public class StudentTeacherChallenge {
    public static void main(String[] args) {
        WhiteBoard wb=new WhiteBoard();
        Teacher t=new Teacher(wb);

        Student s1=new Student("1. John", wb);
        Student s2=new Student("2. Dev", wb);
        Student s3=new Student("3. Sins", wb);
        Student s4=new Student("4. Mia", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}

class WhiteBoard {
    String text;
    int numberofstudents = 0;
    int count = 0;

    public void attendence() {
        numberofstudents++;
    }

    synchronized public void write(String t) {
        System.out.println("teacher is writing "+t);
        while(count!=0){
            try{wait();}catch(Exception e){}
        }
        text=t;
        count=numberofstudents;
        notifyAll();

    }

    synchronized public String read() {
        
        while(count==0){
            try{wait();}catch(Exception e){}
        }
        String t=text;
        count--;
        if(count==0){
            notify();
        }
        return t;
    }
}

class Teacher extends Thread{

    WhiteBoard w;
    String Notes[]={"Java is a lang","it supports oops","end"};

    public Teacher(WhiteBoard wb){
        w=wb;
    } 
    public void run(){
        for(int i=0;i<Notes.length;i++)
            w.write(Notes[i]);
    }
}

class Student extends Thread{
    String name;
    WhiteBoard wb;
    public Student (String n,WhiteBoard w){
        name=n;
        wb=w;
    }

    public void run(){
        String text;
        wb.attendence();

        do{
            text=wb.read();
            System.out.println(name+" Reading "+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}