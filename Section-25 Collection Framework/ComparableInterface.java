import java.util.*;

public class ComparableInterface {
    public static void main(String[] args) {
        TreeSet<Point> points = new TreeSet<>();
        points.add(new Point(3, 4));
        points.add(new Point(1, 2));
        points.add(new Point(5, 1));

        for (Point p : points) {
            System.out.println("Point(" + p.x + ", " + p.y + ")");
        }
           
    }
}

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        return Integer.compare(this.x, other.x);
    }
}
