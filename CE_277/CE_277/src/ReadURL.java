import java.net.MalformedURLException;
import java.net.URL;

public class ReadURL {
    public static void main(String[] args) {
        URL web = null;
        try{
            web = new URL("https//:www.umat.edu.gh/");
        }
        catch (MalformedURLException e){
            System.out.println("Your hyperlink might not be well-formed");
        }
    }
}
