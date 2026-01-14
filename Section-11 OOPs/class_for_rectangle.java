
public class class_for_rectangle {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.length=1;
        r.breath=1;

        System.out.println(r.area()+" "+r.perimeter());
    }
}

class Rectangle{
    int length;
    int breath;

    int area(){
        return length*breath;
    }

    int perimeter(){
        return 2*(length+breath);
    }
}