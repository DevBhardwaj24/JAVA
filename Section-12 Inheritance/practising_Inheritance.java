public class practising_Inheritance {
    public static void main(String[] args) {
        Circle c1=new Circle();
        Cylinder c2=new Cylinder(2,3);
        System.out.println(c2.vol());

        System.out.println(c1.radius);

    }
    
}

class Circle{
    public double radius;

    //constructor
    public Circle(){
        radius=1.0;
    }

    //parametrised constructor
    public Circle(double r){
        radius=r;
    }

}

class Cylinder extends Circle{
    public double height;

    public Cylinder(){
        height=1.0;
    }

    public Cylinder(int r,int h){
        super(r);
        height=h;
    }

    public double vol(){
        return Math.PI*radius*radius*height;
    }
}
