public class ArrayPractice {
    public static void main(String[] args) {
        // 1. Finding sum of all elements
        int arr[]={3,9,7,8,12,6,15,5,4,10};

        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];

        }
        System.out.println(sum);

        // 2. Searching an element

        int target=99;
        for (int i=0;i<arr.length;i++){
            if(target == arr[i]){
                System.out.println("target found");
            }

        }
        System.out.println("target not found");

    }
}
