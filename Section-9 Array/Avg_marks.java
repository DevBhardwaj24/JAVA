
import java.util.*;
public class Avg_marks {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        // float[] arr=new float[10];
        // float total=0;

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=scn.nextFloat();
        //     total=total+arr[i];

        // }
        // System.out.println(total/arr.length);
        // scn.close();
        String str="racecar";
        String[] arr=str.split("");
        Arrays.sort(arr);

        for(String s:arr){
            System.out.print(s);
        }
        scn.close();

    }
    
}
