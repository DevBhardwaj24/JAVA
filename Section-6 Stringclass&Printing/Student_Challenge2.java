//Ques 1 Find if a number is binary or not
//Ques 2 Find if a number is hexadecimal or not
//Ques 3 Find if the data in date format(dd/mm/yyyy)



public class Student_Challenge2 {
    public static void main(String[] args) {
        int b=10110001;
        String str=b+"";// this is the way to convert the int into string . also another way using String.valueOf(b);
        System.out.println(str.matches("[01]+"));

        String str1="3647AB";
        System.out.println(str1.matches("[0-9A-F]+"));

        String date="23/02/2005";
        System.out.println(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));


    }
}
