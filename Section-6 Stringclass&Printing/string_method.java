

public class string_method {
    public static void main(String[] args) {
        char[] c ={'a','b','c','d'};
        
       

        String str=new String(c);
        System.out.println(str);

        int len=str.length();
        System.out.println(len);

        String rep=str.replace('b','f');
        System.out.println(rep);

        String str1="  welcome  ";
        System.out.println(str1);

        String str3=str1.trim();//used to delete the spaces
        System.out.println(str3);

        String str4="python";
        String str5="python";
        String str6="Python";


        System.out.println(str4.equals(str5));
        System.out.println(str5.equalsIgnoreCase(str6));
        System.out.println(str4.compareTo(str6));//comparison based on Unicode

        System.out.println(str4.toLowerCase());

        System.out.println(str5.toUpperCase());

        String sub=str6.substring(1,4);
        System.out.println(sub);


    }
}
