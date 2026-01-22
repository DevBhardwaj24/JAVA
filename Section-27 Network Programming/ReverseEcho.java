import java.net.*;
import java.io.*;

public class ReverseEcho {
    public static void main(String[] args) throws Exception {
        try (ServerSocket ss = new ServerSocket(2000)) {
            Socket stk = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintWriter ps = new PrintWriter(stk.getOutputStream(), true);

            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();

                ps.println(msg);
            } while (!msg.equals("dne"));
        }
    }

}

class Client {
    public static void main(String[] args) throws Exception {
        try (Socket stk = new Socket("localhost", 2000)) {

            BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintWriter ps = new PrintWriter(stk.getOutputStream(), true);

            String msg;

            do {
                msg = keyb.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From Server: " + msg);

            } while (!msg.equals("dne"));
        }
    }

}
