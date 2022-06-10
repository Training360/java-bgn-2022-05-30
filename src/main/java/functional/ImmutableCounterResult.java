package functional;

import java.util.stream.Collector;

public class ImmutableCounterResult {

    private final int negative;

    private final int zero;

    private final int positive;

    public ImmutableCounterResult(int negative, int zero, int positive) {
        this.negative = negative;
        this.zero = zero;
        this.positive = positive;
    }

    public ImmutableCounterResult accept(int number) {
        if (number < 0) {
            return new ImmutableCounterResult(negative + 1, zero, positive);
        }
        else if (number > 0) {
            return new ImmutableCounterResult(negative, zero, positive + 1);
        }
        else {
            return new ImmutableCounterResult(negative, zero + 1, positive);
        }
    }

    public ImmutableCounterResult combine(ImmutableCounterResult another) {
        return new ImmutableCounterResult(negative + another.negative,
                zero + another.zero, positive + another.positive);
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

}
