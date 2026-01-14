public class creating_stringObj {
    public static void main(String[] args) {
        char c[]={'a','b','c','d','e'};
        String str=new String(c,1,3);//offset means starting pt. and count means ending pt.
        System.out.println(str);//bcd
        /*Same goes with byte method of taking string */

        byte[] b={65,66,67,68};
        String str4=new String(b,1,2);
        System.out.println(str4);//BC

        String str1="Java";
        String str2="java";
        String str3=new String("Java");
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));//because the str3 is created in heap
}
}
