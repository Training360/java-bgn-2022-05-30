package functional;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LetterHistogram {

    public static void main(String[] args) {
        String text = "A streamek a Java nyelvben adatfolyamok. Úgy kell elképzelni, mint egy futószalagot, ahol sorban jönnek az adatok, és minden művelet csinál velük valamit. A közbenső műveletek (intermediate operations) eredménye szintén stream, így folytathatjuk a feldolgozást, míg a záró művelet (terminal operation) kimenete valamilyen kollekció vagy más objektum. A feldolgozás ún. lusta kiértékelésű (lazy evaluation), azaz a műveletek csak akkor hajtódnak végre, amikor szükség van rájuk, és csak azokon az adatokon, amelyeken feltétlenül szükséges. Az egész feldolgozást a záró művelet indítja el. Enélkül nem történik semmi, az adatok a futószalag előtt várakoznak feldolgozásra.";

        var histogram = text.chars()
                .parallel()
                .mapToObj(i -> (char) i)
                .filter(Character::isAlphabetic)
                .map(Character::toLowerCase)
                .map(c -> Character.toString(c))
                .collect(Collectors.toConcurrentMap(
                        c -> c, // Kulcs legyen önmaga
                        c -> 1, // Érték kezdeti értéke legyen 1
                        (i, c) -> i + 1 // Ha már van a mapben érték, akkor növelje
                ))
                .entrySet()
                .stream()
                .parallel()
                .sorted(Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed())
                .map(e -> e.getValue() + " - " + e.getKey())
                .collect(Collectors.joining(", "));
        System.out.println(histogram);
    }
}
