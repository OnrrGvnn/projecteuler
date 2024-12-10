/* The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143? */

public class LargestPrimeFactor extends BaseProblem implements BaseProblemIfc {
    LargestPrimeFactor() {
        super(3);
    }

    @Override
    public String solve() {
        long number = 600851475143L;
        long i = 2;

        while (number > 1) {
            if (number % i == 0) {
                number /= i;
            } else if (i > Math.sqrt(number)) {
                i = number;
            } else {
                i += 1;
            }
        }

        return String.valueOf(i);

//        long number = 600851475143L;
//        long highestPrimeNumber = 0L;
//
//        for (long i = number / 2; i > 1; i--) {
//            if (number % i == 0) {
//                if (isPrime(i)) {
//                    highestPrimeNumber = i;
//                    return String.valueOf(highestPrimeNumber);
//                }
//            }
//        }
//
//        return String.valueOf(highestPrimeNumber);

    }

//    public Boolean isPrime(long number) {
//        for (long i = 2; i < number / 2; i++) {
//            if (number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }
}