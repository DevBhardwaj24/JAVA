import java.io.*;

public class FileOutputStream {
    public static void main(String[] args) {
        try {
            java.io.FileOutputStream fos = new java.io.FileOutputStream("Test.txt");
            String data = "Hello World! This is FileOutputStream Demo.\nLearning Java IO Streams";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            fos.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
