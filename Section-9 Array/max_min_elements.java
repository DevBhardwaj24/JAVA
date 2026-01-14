

import java.util.Scanner;
public class max_min_elements {
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        System.out.print("enter the size of an array:-");
        int size=scn.nextInt();
        int max=0;
        int min=0;

        //yeh wala nii aaya.
        int[] arr=new int[size];
        for(int k=0;k<arr.length;k++){
            arr[k]=scn.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                if(arr[i]>arr[j]){
                    max=arr[i];
                }
                if(arr[i]<arr[j]){
                    min=arr[i];
                }
            }
            System.out.println(max);
            System.out.println(min);

        }
        scn.close();
    }
}
