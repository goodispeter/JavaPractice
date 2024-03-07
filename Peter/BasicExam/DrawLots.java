package Peter.BasicExam;

public class DrawLots {
    private static final String[] STUDENTS = { "A", "B", "C", "D", "E", "F", "G" };

    public static void main(String[] args) {
        if (STUDENTS.length != 0) {
            System.out.println(STUDENTS[(int) (Math.random() * STUDENTS.length)]);
        } else {
            System.out.println("null");
        }
    }
}
