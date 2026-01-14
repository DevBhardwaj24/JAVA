import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int n=scn.nextInt();
        int sum=0;
        int m=n;

        while(m>0){
            int r=m%10;
            m=m/10;
            sum=sum+r*r*r;

        }
        if(sum==n){
            System.out.println("is armstrong");
        }
        else{
            System.out.println("is not armstrong");
        }
        //System.out.println(sum);
        scn.close();
    }

}
