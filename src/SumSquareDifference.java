/* The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385.

The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025.

Hence, the difference between the sum of the squares of the first ten natural numbers and the square of the sum is

3025-385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum. */

public class SumSquareDifference extends BaseProblem implements BaseProblemIfc {
    private static final int LIMIT = 100;

    SumSquareDifference() {
        super(6);
    }

    @Override
    public String solve() {
        int difference;

        difference = calculateSquareOfSum() - calculateSumOfSquares();

        return String.valueOf(difference);
    }

    public int calculateSumOfSquares() {
        int sumOfSquares = 0;

        for (int number = 1; number <= LIMIT; number++) {
            sumOfSquares += number * number;
        }

        return sumOfSquares;
    }

    public int calculateSquareOfSum() {
        int sum = 0;
        int squareOfSum;

        for (int number = 1; number <= LIMIT; number++) {
            sum += number;
        }

        squareOfSum = sum * sum;

        return squareOfSum;
    }
}