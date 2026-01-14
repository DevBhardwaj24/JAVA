import java.util.Scanner;
public class common_elements_array {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter the size of first array and second array:-");
        int sizearr=scn.nextInt();

       
//nii aaya yeh wala.
        int[] arr1=new int[sizearr];
        int[] arr2=new int[sizearr];
        int[] arr3=new int[sizearr];

        //for first array
        for(int i=0;i<sizearr;i++){
            System.out.print("Enter the elements of first array:-");
            arr1[i]=scn.nextInt();
        }

        //for second array
        for(int i=0;i<sizearr;i++){
            System.out.println("Enter the elemnts of second array:-");
            arr2[i]=scn.nextInt();

        }

        //for third array
        for(int i=0;i<sizearr;i++){
            for(int j=0;j<=i;j++){
                if(arr1[i]==arr2[j]){
                    arr3[j]=arr2[j];
                }
                System.out.println(arr3[j]);
                
            }
            
            
        }
        scn.close();


        
    }
}
