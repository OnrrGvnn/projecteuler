public abstract class BaseProblem {
    private int problemNumber;
    private String result;

    BaseProblem() {

    }

    BaseProblem(int problemNumber) {
        this.problemNumber = problemNumber;
    }

    public int getProblemNumber() {
        return problemNumber;
    }

    public void setProblemNumber(int problemNumber) {
        this.problemNumber = problemNumber;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}