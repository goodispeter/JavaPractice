package triangle;

public class triangle {
    public static void main(String[] args) {

        //這邊印出 直角三角形
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");
        for (int i = 1; i <= 10; i++) { //代表三角形的高度
            for (int j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------");
        //嘗試自己印出相反直角三角形

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

