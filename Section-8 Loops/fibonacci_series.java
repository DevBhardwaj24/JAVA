import java.util.Scanner;
public class fibonacci_series {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num1=scn.nextInt();
        int num2=scn.nextInt();
        int n=scn.nextInt();

        int temp=0;
        System.out.print(num1+" "+num2+" ");

        for(int i=0;i<n;i++){
            temp=num1+num2;
            System.out.print(temp+" ");
            num1=num2;
            num2=temp;
        }
        scn.close();
    }
    
}
