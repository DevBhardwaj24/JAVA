import java.util.Scanner;
public class display_digit {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the number:- ");
        int n=scn.nextInt();
        int count=0;

        while(n>0){
            int r=n%10;
            n=n/10;
            count=count+1;
            System.out.println(r);
            
        }
        System.out.println("total no. of digits are:- "+count);
        scn.close();

    }
   
}
