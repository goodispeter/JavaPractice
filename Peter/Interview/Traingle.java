package Peter.Interview;

public class Traingle {
    // 請用程式畫出等腰三角型：
    private static final int ROWS = 5;

    public static void main(String[] args) {
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= ROWS - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
