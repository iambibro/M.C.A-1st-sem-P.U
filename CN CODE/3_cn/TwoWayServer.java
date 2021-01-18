import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
public class TwoWayServer
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Server side Starting");
        ServerSocket ss = new ServerSocket(4567);
        System.out.println("waiting for Client...");
        Socket s= ss.accept();
        System.out.println("Connected");
        BufferedReader br= new BufferedReader(new
                InputStreamReader(s.getInputStream()));
        String str1= br.readLine();
        System.out.println("Client data: "+str1);
//for two way
        String str2= "Hello, Prabhat";
        PrintWriter out= new PrintWriter(s.getOutputStream());
        out.println(str2);
        out.flush();
        out.close();
        s.close();
        ss.close();
    }
}
