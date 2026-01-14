
import java.util.Scanner;
class Implementation {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();//if size of array not defined
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();//for input
            System.out.println(arr[i]);//for output
        }
        scn.close();

    }

}