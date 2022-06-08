package streams;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("aaaaa aaaaaaaa bb ccccc dd eeeeee ff ");
        System.out.println(scanner.tokens()
                .map(String::toUpperCase)
                .map(s -> s.substring(0, 2))
                .distinct()
                .peek(e -> System.out.println(e))
                .limit(3)

                .toList());

        System.out.println(Stream.iterate(0, i -> i + 1)
                .limit(10)
                .collect(Collectors.summarizingInt(i -> i))
                .getSum());

        System.out.println(IntStream.range(0, 10).sum());

        Stream.of(1, 2, 3, 5, 7, 13).filter(i -> i % 2 == 1).forEach(i -> System.out.println(i));

        Stream.generate(Math::random)
                .limit(20)
                .forEach(e -> System.out.println(e));

    }
}
