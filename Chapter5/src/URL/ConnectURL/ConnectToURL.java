package URL.ConnectURL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectToURL {
    public static void main(String[] args)   {
        try {
            URL myUrl = new URL("https://google.com");
            URLConnection urlConnection = myUrl.openConnection();
            urlConnection.connect();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
