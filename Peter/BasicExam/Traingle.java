package Peter.BasicExam;

public class Traingle {
    public static void main(String[] args) {
        // 行數
        int rows = 5;
        // 正三角形
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        // 倒三角形
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        // 等腰三角形
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        // 數字倒數倒三角形
        for (int i = rows; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        // 數字等腰三角形
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        // 倒等腰三角形
        for (int i = rows * 2 - 1; i > 0; i = i - 2) {
            for (int j = rows * 2 - 1; j > i; j = j - 2) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
