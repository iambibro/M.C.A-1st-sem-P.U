import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TwowayClient
{
    public static void main(String[] args) throws Exception
    {
        String ip= "localhost";
        int port = 4567;
        System.out.println("client side Starting");
        Socket soc= new Socket(ip,port);
        System.out.println("waiting for Server");
        String str1= "Hi,Server!";
        PrintWriter out= new PrintWriter(soc.getOutputStream());
        out.println(str1);
        out.flush();
        //for two way
        System.out.println("Connected");
        BufferedReader br= new BufferedReader(new
                InputStreamReader(soc.getInputStream()));
        String str2= br.readLine();
        System.out.println("Server data: "+str2);
        soc.close();
	}
}