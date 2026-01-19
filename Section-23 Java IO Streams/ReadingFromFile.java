import java.io.*;

public class ReadingFromFile {
    public static void main(String[] args) throws Exception {
        try(FileInputStream fis=new FileInputStream("Test.txt")) {
            byte b[]=new byte[fis.available()];
            fis.read(b);

            String str =new String(b);
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
//FileReader is same as FileInputStream ... and same goes with FileWriter ... almost same function 