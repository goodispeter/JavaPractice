package WhoMax;

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
//        練習題1:接收使用者輸入的3個整數,並將它們的最大值作為結果輸出
        System.out.println("輸入比較數值選手一號");
        double n1 = new Scanner(System.in).nextDouble();
        System.out.println("輸入比較數值選手二號");
        double n2 = new Scanner(System.in).nextDouble();
        System.out.println("輸入比較數值選手三號");
        double n3 = new Scanner(System.in).nextDouble();
        double max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
        System.out.println("最大的數值為=" + max);
        System.out.println("設計者為Kenny");
    }


}
