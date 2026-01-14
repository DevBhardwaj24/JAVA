public class DataHiding {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(2);
        r.setBreath(2);
        System.out.println(r.area());
        System.out.println(r.getLength());
    }
}

class Rectangle{
    private double length;
    private double breath;

    // as these properties become private means we acheive data hiding we can nt access that from the main method
    // for that we need to use the getter and setter method

    public double getLength(){
        return length;
    }
    public double getBreath(){
        return breath;
    }

    void setLength(double l){
        length = l;
    }

    void setBreath(double b){
        breath=b;

    }

    public double area(){
        return length*breath;

    }
}