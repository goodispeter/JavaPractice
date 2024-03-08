package Peter.BasicExam;

import java.util.Scanner;

public class InverseExponentialCalculations {
    // 一球從h米高度自由落下，每次落地後反跳回原高度的一半；
    // 再落下，求它在第n次落地時，共經過多少米？第n次反彈多高？
    private static final double HALF = 0.5;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("How height: ");
            int hight = scanner.nextInt();
            System.out.println("How many times: ");
            int times = scanner.nextInt();
            System.out.println("總共經過" + howLong(hight, times) + "米");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double howLong(int height, int times) {
        double[] heightList = new double[times * 2];
        heightList[0] = height;
        for (int i = 1; i < times * 2; i++) {
            if (i % 2 == 1) {
                heightList[i] = heightList[i - 1] * HALF;
            } else {
                heightList[i] = heightList[i - 1];
            }
        }
        double sum = 0;
        for (double newHeight : heightList) {
            System.out.println(newHeight);
            sum += newHeight;
        }
        return sum;
    }
}
