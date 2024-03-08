package byColor;

import java.util.Scanner;

public class byColor {
    //需求:接收用户今天输入的颜色,推荐菜品
    //1.提示并接收用户输入的颜色

    public static void main(String[] args) {
        System.out.println("please");
        String colro = new Scanner(System.in).nextLine();


        switch (colro) {
            case "紅":
                System.out.println("今天吃紅燒魚？");
                break;
            case "黃":
                System.out.println("今天吃咖哩");
                break;
            case "綠":
                System.out.println("今天吃草");
                break;
            default:
                System.out.println("沒錢吃草吧你");
        }
    }


}
