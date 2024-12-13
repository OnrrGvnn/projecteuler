/* By listing the first six prime numbers: 2, 3, 5, 7, 11 and 13, we can see that the 6th prime is 13.
What is the 10001st prime number? */

public class The10001stPrime extends BaseProblem implements BaseProblemIfc {
    The10001stPrime() {
        super(7);
    }

    @Override
    public String solve() {
        int count = 0;
        int number = 1;

        while (count < 10001) {
            number++;

            if (isPrime(number)) {
                count++;
            }
        }

        return String.valueOf(number);
    }

    public boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}