package inter;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PriceMain {

    public static void main(String[] args) {
        CanCalculatePrice price = new LengthPriceCalculator("aaa");
        System.out.println(price.calculatePrice());

//        List<String> names = new ArrayList<>();
        List<String> names = new LinkedList<>();

        System.out.println(List.of("alma", "körte"));
        System.out.println(Path.of("MOCK_DATA.csv"));
        var path = Path.of("MOCK_DATA.csv");
        System.out.println(path.getClass().getName());

    }
}
