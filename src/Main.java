import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String result;

        List<BaseProblem> problems = new ArrayList<>();

        MultiplesOfThreeOrFive multiplesOfThreeOrFive = new MultiplesOfThreeOrFive();
        result = multiplesOfThreeOrFive.solve();
        multiplesOfThreeOrFive.setResult(result);
        problems.add(multiplesOfThreeOrFive);

        EvenFibonacciNumbers evenFibonacciNumbers = new EvenFibonacciNumbers();
        result = evenFibonacciNumbers.solve();
        evenFibonacciNumbers.setResult(result);
        problems.add(evenFibonacciNumbers);

        System.out.println();

        for (BaseProblem problem : problems) {
            System.out.println(problem.getProblemNumber() + " - " + problem.getClass().getSimpleName() + " : " + problem.getResult());
        }

    }
}
