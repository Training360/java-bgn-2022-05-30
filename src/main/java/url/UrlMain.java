package url;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UrlMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02");
        scanner.useDelimiter(":");
        String protocol = scanner.next();
        System.out.println(protocol);
        scanner.useDelimiter("/");
        scanner.skip("://");
        String host = scanner.next();
        System.out.println(host);
        scanner.useDelimiter("\\?");
        String path = scanner.next();
        System.out.println(path);
        scanner.skip("\\?");
        String params = scanner.nextLine();
        System.out.println(params);

    }
}
