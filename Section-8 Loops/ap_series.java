import java.util.Scanner;
public class ap_series {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int d=scn.nextInt();
        int n=scn.nextInt();

        int term=a;

       
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term=term+d;
        }
            
        scn.close();
    }
}
