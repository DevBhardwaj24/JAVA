public class Calculate_area {
    public static void main(String[] args) {
        double a=1;
        double b=3;
        double c=3;
        double s=(a+b+c)/2;
        double subarea=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(subarea);
        System.out.println(area);
    }
}
