package functional;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientMain {

    public static void main(String[] args) throws Exception{
        var request = HttpRequest.newBuilder().uri(new URI("https://index.hu")).GET().build();
        var response= HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
    }
}
