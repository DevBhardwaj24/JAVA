public class Quadritic_eq {
    public static void main(String[] args) {
        double a=1;
        double b=5;
        double c=6;

        //double small= b*b-(4*a*c);

        //double root1= (-b + Math.sqrt(small))/(2*a);
       double root2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        //System.out.println(root1);
        System.out.println(root2);
    }
}
