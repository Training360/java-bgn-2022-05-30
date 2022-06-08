package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LetterCounter {

    private String word;

    public LetterCounter(String word) {
        this.word = word;
    }

    public Map<Character, Long> count() {
//        var result = new HashMap<Character, Integer>();
//        for (var c: word.toCharArray()) {
//            c = Character.toLowerCase(c);
//            if (Character.isAlphabetic(c)) {
//                result.compute(c, (k, v) -> v == null ? 1 : v + 1);
////                var count = result.get(c);
////                if (count == null) {
////                    result.put(c, 1);
////                }
////                else {
////                    result.put(c, count + 1);
////                }
//            }
//        }
//        return result;

        return word.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> Character.isAlphabetic(c))
                .map(c -> Character.toLowerCase(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    }

    public static void main(String[] args) {
        var counter = new LetterCounter("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse quis dignissim purus. Aenean iaculis urna turpis, ac molestie leo rutrum eget. Sed non eleifend ante, a consequat ligula. Sed dapibus purus vitae aliquam bibendum. Sed hendrerit mauris in finibus bibendum. In hac habitasse platea dictumst. Proin ut dolor laoreet, dignissim felis efficitur, ultricies arcu. Etiam sagittis nisi at quam vulputate molestie. Maecenas tincidunt tempor eros, nec laoreet massa molestie vel. Nulla auctor hendrerit leo id aliquam. Cras ultrices odio sit amet tortor aliquet posuere. Morbi malesuada aliquet eros, sed congue turpis. In neque ex, pulvinar eget erat vitae, volutpat mattis lacus. Suspendisse et auctor libero.");
        System.out.println(counter.count());
    }
}
