package Peter.BasicExam;

import java.util.Scanner;

public class GiveBonus {
    // 當利潤(I)低於或等於10萬元時，獎金可提10%；
    // 利潤高於10萬元，低於20萬元時，低於10萬元的部分按10%提成，高於10萬元的部分，可提成7.5%；
    // 20萬到40萬之間時，高於20萬元的部分，可提成5%；
    // 40萬到60萬之間時高於40萬元的部分，可提成3%；
    // 60萬到100萬之間時，高於60萬元的部分，可提成1.5%，
    // 高於100萬元時，超過100萬元的部分按1%提成，
    // 從鍵盤輸入當月利潤，求應發放獎金總數？
    static Integer profits;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("請輸入當月利潤：");
            profits = scanner.nextInt();
            System.out.println("應該發放的獎金數為: " + Math.round(bonusCalculate(profits)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double bonusCalculate(Integer profits) {
        if (profits <= 100000) {
            return profits * 0.1;
        } else {
            double bonus = 0.0;
            if (profits <= 200000) {
                bonus = (profits - 100000) * 0.075 + bonusCalculate(100000);
            } else if (profits <= 400000) {
                bonus = (profits - 200000) * 0.05 + bonusCalculate(200000);
            } else if (profits <= 600000) {
                bonus = (profits - 400000) * 0.03 + bonusCalculate(400000);
            } else if (profits <= 1000000) {
                bonus = (profits - 600000) * 0.015 + bonusCalculate(600000);
            } else {
                bonus = (profits - 1000000) * 0.01 + bonusCalculate(1000000);
            }
            return bonus;
        }
    }
}
