import java.util.Scanner;
public class reverse_no {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the no.:- ");
        int n=scn.nextInt();

        while(n>0){
            int r=n%10;
             n=n/10;
            System.out.print(r);
        }
        scn.close();
        
    }
}
