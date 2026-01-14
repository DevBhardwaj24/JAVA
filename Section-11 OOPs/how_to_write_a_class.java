
public class how_to_write_a_class {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=1.0;
        System.out.println("area is: " + c.area());
        
    }

}

class Circle{
    public double radius;// property

    //method in a class
    public double area(){
        return 3.14*radius*radius;
    }
}