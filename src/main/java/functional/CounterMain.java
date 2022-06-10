package functional;

import java.util.List;

public class CounterMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, -7, -7, 2, -6);
//        CounterResult counterResult = new CounterResult();
//        for (int i: numbers) {
//            counterResult.accept(i);
//        }

//        var counterResult = numbers.stream()
//                .collect(CounterResult::new, CounterResult::accept, CounterResult::addAll);

        var counterResult = numbers.stream()
                .collect(CounterResult.collector());

        System.out.println(counterResult);

        var anotherResult = numbers.stream()
                .reduce(new ImmutableCounterResult(0, 0, 0), ImmutableCounterResult::accept,
                        ImmutableCounterResult::combine);
        System.out.println(anotherResult);


        System.out.println(List.of(1, 5, 6, 7, 8, 20, 10).stream().reduce(0, (i, j) -> i + 1, (i, j) -> i + j));
    }
}
