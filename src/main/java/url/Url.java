package url;

public class Url {

    public Url(String jsonFormatString) {

    }

    public static Url createUrlFromUrlString(String s) {
        return new Url(s);
    }

    public static Url createUrlFromJson(String s) {
        return new Url(s);
    }

    public String getParameterValue(String parameterKey) {
            throw new IllegalArgumentException("Parameter not found with key: " + parameterKey);
    }
}
