public class increment_decrement {
    public static void main(String[] args) {
        int x=5;
        int y=4;
        int z;
        //z=2*x++ + 3*++y;//answer should be 25
        z=2*x++ + 3*++x;//answer should be 31
        System.out.println(z);
        y=++x;
        System.out.println(y);
        System.out.println(x);



       
        // char c='A';
        // ++c;
        // System.out.println(c);
        


        
    }
    
}
