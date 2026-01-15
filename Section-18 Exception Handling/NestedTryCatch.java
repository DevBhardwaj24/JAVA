public class NestedTryCatch {
    public static void main(String[] args) {
        int [] arr={1,2,3,5,0};
        try {
            int c=arr[1]/arr[4];
            System.out.println("result is: "+c);

            System.out.println(arr[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("division by zero");

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid");
        }

        System.out.println("end of program");
        

        
    }
}


// as soon as the program gets an exception it teriminates from there without reading other line 
// that why there are 2 exception --> Arthmetic nd ArrayOutOfBound index
// but it will only show one without using the try catch block in the first place