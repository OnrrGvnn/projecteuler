/* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all the numbers from 1 to 20 ? */

public class SmallestMultiple extends BaseProblem implements BaseProblemIfc {
    SmallestMultiple() {
        super(5);
    }

    @Override
    public String solve() {
        long total = 1L;

        for (long i = 2; i <= 20; i++) {
            total = lcm(total, i);
        }

        return String.valueOf(total);
    }

    public long gcd(long a, long b) {
        long tempNumber;

        while (b != 0) {
            tempNumber = b;
            b = a % b;
            a = tempNumber;
        }

        return a;
    }

    public long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
}