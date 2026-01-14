
public class Linear_search_algo {
    public static void main(String[] args) {
        java.util.Scanner scn = new java.util.Scanner(System.in);

        System.out.println("Enter the key:");
        int key=scn.nextInt();

        System.out.println("Enter the size of an array:");
        int n =scn.nextInt();

        int[] arr=new int[n];

        int ans=-1;

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            if(key==arr[i]){
                ans=i;

                // System.out.println(i);
            }
           
        }
        System.out.println(ans);
        

        scn.close();

        
    }
}
