import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://example.com");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
    }
}
