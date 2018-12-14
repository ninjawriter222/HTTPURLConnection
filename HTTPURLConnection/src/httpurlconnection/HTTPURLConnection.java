package httpurlconnection;
import java.io.*;
import java.net.*;
/**
 *
 * @author Poozer
 */
public class HTTPURLConnection {
    public static void main(String[] args) throws Exception {
        URL aWebPage = new URL ("https://www.google.com/");//Enter in any https website name in here.
        
        HttpURLConnection letsSee = (HttpURLConnection) aWebPage.openConnection();
        
        BufferedReader BringItIn = new BufferedReader (new InputStreamReader(letsSee.getInputStream()));
        
        String httpCode;
        
        while((httpCode = BringItIn.readLine()) != null)
            {
            if(httpCode.isEmpty() != true){
                System.out.println(httpCode);
            } else {
                System.out.println("There is nothing more to print");
            }
            }
        BringItIn.close();
    }
    
}
