import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void solveProblem(BaseProblemIfc baseProblemIfc, List<BaseProblemIfc> problemList) {
        String result;

        result = baseProblemIfc.solve();
        baseProblemIfc.setResult(result);
        problemList.add(baseProblemIfc);
    }

    public static void main(String[] args) {
        List<BaseProblemIfc> problems = new ArrayList<>();

//        solveProblem(new MultiplesOfThreeOrFive(), problems);
//        solveProblem(new EvenFibonacciNumbers(), problems);
//        solveProblem(new LargestPrimeFactor(), problems);
//        solveProblem(new LargestPalindromeProduct(), problems);
//        solveProblem(new SmallestMultiple(), problems);
//        solveProblem(new SumSquareDifference(), problems);
        solveProblem(new The10001stPrime(), problems);

        System.out.println();

        for (BaseProblemIfc problem : problems) {
            System.out.println(problem.getProblemNumber() + " - " + problem.getClass().getSimpleName() + " : " + problem.getResult());
        }

    }
}