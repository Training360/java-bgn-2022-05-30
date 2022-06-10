package functional;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkFinder {

    private static final String HREF= "href=\"";

    private boolean byLink(String s) {
        return s.contains(HREF);
    }

    public String getLink(String line) {
        var index = line.indexOf("href");
        var index2 = line.indexOf("\"", index + HREF.length());
        var part = line.substring(index + HREF.length(), index2);
        return part;
    }

    public List<String> getLinkWithRegexp(String line) {
        Pattern pattern = Pattern.compile("href=\"([^\"]+)\"");
        Matcher matcher = pattern.matcher(line);
//        if (matcher.find()) {
//            return matcher.group(1);
//        }
//        else {
//            throw new IllegalArgumentException("No match");
//        }
        return matcher
                .results()
                .map(r -> r.group(1))
                .toList();

    }

    public void getLinks(Path file) throws IOException {
        var start = System.currentTimeMillis();
        try (var lines = Files.lines(Path.of("index.hu.html"))) {
            lines
//                    .filter(this::byLink)
//                    .map(this::getLink)
                    .flatMap(l -> getLinkWithRegexp(l).stream())
                    .filter(s -> s.startsWith("https"))
//                    .limit(20)
//                    .peek(System.out::println)
//                    .parallel()
                    .map(s -> download(s))
                    .filter(r -> r.statusCode() == 200)
                    .map(r -> r.statusCode())
                    .forEach(u -> System.out.println("Status: " + u));
            ;
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public HttpResponse<String> download(String url)  {
        try {
            var request = HttpRequest.newBuilder().uri(new URI("https://index.hu")).GET().build();
            return HttpClient.newBuilder().build().send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch (Exception exception) {
            throw new IllegalStateException("Can not download: " + url, exception);
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new LinkFinder().getLink("""
                <a class="c-index2-pager_link" href="https://cimlap.blog.hu/">
                """));

        System.out.println(new LinkFinder().getLinkWithRegexp("""
                <a class="c-index2-pager_link" href="https://cimlap.blog.hu/">
                <a class="c-index2-pager_link" href="https://nemcimpal.blog.hu/">
                """));

        //new LinkFinder().getLinks(Path.of("index.hu.html"));


    }
}
