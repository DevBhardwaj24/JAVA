// Ques 1 Find if the email id is on gmail
// Ques 2 Find username and domain name form email
// Given String str ="programmer@gmail.com";


public class Student_Challenge1 {
    public static void main(String[] args) {
        String str="programmer@gmail.com";
        int i=str.indexOf('@');
        String uname=str.substring(0, i);
        String domain=str.substring(i+1);
        System.out.println(uname);
        System.out.println(domain);
        System.out.println(str.contains("gmail.com"));

    }

}
