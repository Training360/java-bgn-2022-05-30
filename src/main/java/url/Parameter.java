package url;

import java.util.ArrayList;
import java.util.List;

public class Parameter {

    private String name;

    private String value;

    public Parameter(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public static List<Parameter> createFromQueryParameters(String queryParameters) {
        var parameters = new ArrayList<Parameter>();
        // format=geojson&starttime=2014-01-01&endtime=2014-01-02
        String[] params = queryParameters.split("&");
        for (var para: params) {
            String[] parts = para.split("=");
            String name = parts[0];
            String value = parts[1];
        }
        return parameters;
    }
}
