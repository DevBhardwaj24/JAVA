//Ques 1 Remove special character from a string
//Ques 2 Remove extra spaces from string
//Ques 3 Find number of word in a string

public class Student_Challenge3 {
    public static void main(String[] args) {
        String str="a!b@c#123";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

        String str1="   ab   d    ";
        System.out.println(str1.trim());// so trim only works with the staring and ending spaces if the spaces are in
        //between it doesn't get removed -- to remove we need to use different method..

        System.out.println(str1.replaceAll(" ",""));

        String str2="abc   de   fgh    ijk ";
        str2=str2.replaceAll("\\s+"," ").trim();
        String[] words=str2.split("\\s");
        System.out.println(words.length);



    }
    
}
