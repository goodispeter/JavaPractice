package Score;

import java.util.Scanner;

public class score {
    public static void main(String[] args) {
//        利用條件運算子的巢狀來完成此題：學習成績>=90分的同學用A表示，60-89分之間的用B表示，60分以下的用C表示。
        System.out.println("please 輸入你的分數");
        int score = new Scanner(System.in).nextInt();
        if (score > 90) {
            System.out.println("A");
        } else if (score > 60 && score < 89) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }


    }

}
