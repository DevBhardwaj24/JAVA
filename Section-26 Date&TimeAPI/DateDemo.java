import java.util.*;

public class DateDemo {
    public static void main(String[] args) {
        Date d = new Date();// current date and time
        Date d2 = new Date(System.currentTimeMillis()); // epoch time
        System.out.println(d);
        System.out.println(d2);
    }
}
