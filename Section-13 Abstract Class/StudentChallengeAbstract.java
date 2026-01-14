public class StudentChallengeAbstract {
    public static void main(String[] args) {
        Shape s=new Circle(1);
        s.perimeter();
    }
}

abstract class Shape{
    abstract double perimeter();

    abstract double area();

}

class Circle extends Shape{

    Circle(int par) {
    }
    public int radius;
    

    @Override
    public double perimeter(){
        return 2*3.14*radius;

    }

    @Override
    public double area(){
        return 3.14*radius*radius;
    }
}

class Rectangle extends Shape{
    public int l;
    public int b;

    @Override
    public double perimeter(){
        return 2*(l+b);
    }

    @Override
    public double area(){
        return l*b;
    }
}