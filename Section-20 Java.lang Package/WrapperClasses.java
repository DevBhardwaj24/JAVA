public class WrapperClasses {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(10);// this is the way of how u create the data type interger as a object and assign the value ... 

        //AutoBoxing??
        int m=10;
        Integer n=Integer.valueOf(m);// see the primitive (m) is converted into an object(n)-- Called Autoboxing

        //AutoUnboxing??
        int a=10;
        Integer b=Integer.valueOf(a);
        int p = n;// obejct is converted into the primitive -- called AutoUnboxing


        // pretty much every data type can work as same as the above
    }
}


/*
1. need of Wrapper classes --> is to make the java fully object oriented lang
2. There are primitives data types(int , float,...) and they cant be worked as a object so for that
   these Wrapper classes are introduced in the java 
3. and are available for every datatype 
 */