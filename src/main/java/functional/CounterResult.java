package functional;

import java.util.stream.Collector;

public class CounterResult {

    private int negative;

    private int zero;

    private int positive;

    public void accept(int number) {
        if (number < 0) {
            negative++;
        }
        else if (number > 0) {
            positive++;
        }
        else {
            zero++;
        }
    }

    public CounterResult addAll(CounterResult another) {
        negative += another.negative;
        zero += another.zero;
        positive += another.positive;
        return this;
    }

    public int getNegative() {
        return negative;
    }

    public int getZero() {
        return zero;
    }

    public int getPositive() {
        return positive;
    }

    @Override
    public String toString() {
        return "CounterResult{" +
                "negative=" + negative +
                ", zero=" + zero +
                ", positive=" + positive +
                '}';
    }

    public static CounterResult combine(CounterResult result1, CounterResult result2) {
        CounterResult counterResult = new CounterResult();
        counterResult.positive = result1.positive + result2.positive;
        counterResult.negative = result1.negative + result2.negative;
        counterResult.zero = result1.zero + result2.zero;
        return counterResult;
    }

    public static Collector<Integer, CounterResult, CounterResult> collector() {
//        return Collector.of(CounterResult::new, CounterResult::accept, CounterResult::addAll,
//                Collector.Characteristics.UNORDERED, Collector.Characteristics.IDENTITY_FINISH);
        return Collector.of(CounterResult::new, CounterResult::accept, CounterResult::combine,
                Collector.Characteristics.UNORDERED, Collector.Characteristics.IDENTITY_FINISH);
    }
}
