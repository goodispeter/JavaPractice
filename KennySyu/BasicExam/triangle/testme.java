package triangle;

public class testme {

    //左下直角三角形

    public static void main(String[] args) {
        System.out.println("--------------------這是直角在左下角的三角形");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------這是直角在左上角的三角形");
        //左上直角三角形
        for (int i = 1; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("&");
            }
            System.out.println();
        }
        System.out.println("--------------------這是直角在右上角的三角形");
        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > 5 - i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------這是直角在右下角的三角形");
        for (int i = 10; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = i - 10; k < 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }


}
