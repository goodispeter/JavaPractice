package Peter.OCAPreviousExam.Question37;

public class Question37 {
    public static void main(String[] args) {
        Question37 ts = new Question37();
        System.out.print(isAvailable + " ");
        isAvailable = ts.doStuff();
        System.out.print(isAvailable);
    }

    public static boolean doStuff() {
        return !isAvailable;
    }

    static boolean isAvailable = false;
}
// What is the result
