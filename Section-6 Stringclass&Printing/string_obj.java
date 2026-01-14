public class string_obj {
    public static void main(String[] args) {
        String str1="Java";
        System.out.println(str1);
        char c[]={'a','b','c','d'};
        String str=new String(c);// that's how to make a character into a string
        System.out.println(str);
        /*the 'new' keyword make the object in heap have a reference
         * str1 is a reference
         * String is the class name
         * String(b) is a constructor
        */

        byte[] b ={65,66,67,68};
        String str2=new String(b);
        System.out.println(str2);

        String str3=new String("Java");//this will make a string pool that is constant having literals
        System.out.println(str3);
    }
}
