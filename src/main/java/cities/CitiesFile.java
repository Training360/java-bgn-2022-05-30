package cities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class CitiesFile {

    enum Header {HAS_HEADER, HAS_NO_HEADER}

    private Path path;

    private Header header;

    int lineNumber = 0;

    public CitiesFile(Path path, Header header) {
        this.path = path;
        this.header = header;
    }

    public List<City> getCities() {
        try {
            return parseLines();
        }
        catch (IOException ioe) {
            throw new CitiesFileReadException("Can not read file " + path, ioe, path);
        }
    }

    private List<City> parseLines() throws IOException {
        var cities = new ArrayList<City>();
        var lines = Files.readAllLines(path);
        for (var line: lines) {
            lineNumber++;
            if (hasNoHeader() || lineIsNotHeader()) {
                var city = parseLine(line);
                cities.add(city);
            }
        }
        return cities;
    }

    private boolean hasNoHeader() {
        return header == Header.HAS_NO_HEADER;
    }

    private boolean lineIsNotHeader() {
        return lineNumber > 1;
    }

    private City parseLine(String line) {
        var parts = line.split(",");
        var name = parts[0];
        var lat = Double.parseDouble(parts[1]);
        var lon = Double.parseDouble(parts[2]);
        return new City(name, lat, lon);
    }

    public static void main(String[] args) {
        var cities = new CitiesFile(Path.of("MOCK_DATA.csv"), Header.HAS_HEADER).getCities();

        for (var city: cities) {
            System.out.println(city);
        }
    }
}
