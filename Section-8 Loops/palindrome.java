import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("enter the no.");
        int n=scn.nextInt();
        int m=n;
        int rev=0;

        while(n>0){
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        
        }
        //System.out.println(rev);
        if(rev==m){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        scn.close();
    }

    
}
