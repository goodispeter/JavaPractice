package Peter.Interview;

public class Triangle {
    // 請用程式畫出以下正三角形(不貼牆)
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
        System.out.println("==================");
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= ROWS - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= ROWS - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= ROWS - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
