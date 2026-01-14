import java.util.Scanner;

public class gp_series {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter a,r,n");
        int a=scn.nextInt();
        int r=scn.nextInt();
        int n=scn.nextInt();
        
        int term=a;
        for(int i=0;i<n;i++){
            System.out.print(term+",");
            term=term*r;
            
        }
        scn.close();
    }
    
}
