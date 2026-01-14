
import java.util.*;
public class Square1toN {
    public static void main(String[] args) {
        try (Scanner sc=new Scanner(System.in)) {
            
            System.out.print("Enter the size of an array: ");
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arr[i]=arr[i]*arr[i];
                System.out.print(arr[i]+" ");
                
            }
        }
    }
}
