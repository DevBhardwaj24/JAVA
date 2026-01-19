import java.io.*;

public class BufferInputStream {
    public static void main(String[] args) throws Exception {
        try(FileInputStream fis=new FileInputStream("Test.txt")) {
            BufferedInputStream bis=new BufferedInputStream(fis);

            System.out.println("file "+fis.markSupported());
            System.out.println("buffer "+bis.markSupported());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
