package CountBMI;

import java.util.Scanner;

public class Go {

    public static void main(String[] args) {
//        練習題2: BMI 指數測試 BMI = 體重 (kg) / 身高² (m)
        System.out.println("請輸入你的體重");
        double weight = new Scanner(System.in).nextDouble();
        System.out.println("請輸入你的身高");
        double height = new Scanner(System.in).nextDouble();
        new getBMI();
        getBMI.BMI(weight, height);

    }
}
