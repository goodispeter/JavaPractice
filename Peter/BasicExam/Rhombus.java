package Peter.BasicExam;

public class Rhombus {
    // 印出菱形
    private static final int ROWS = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= ROWS - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= ROWS - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (ROWS - i) * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
