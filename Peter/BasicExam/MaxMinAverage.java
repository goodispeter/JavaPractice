package Peter.BasicExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMinAverage {
    // 請設計一個程式，
    // 要求使用者重複輸入整數數值
    // (數值可能為正數也可能為負數，並無特定範圍)，
    // 直到輸入0為止，計算並印出這些整數中的最大值、最小值以及它們的平均值至小數點第1位，如果一剛開始輸入0，則輸出沒有結果。
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Integer> list = new ArrayList<>();
            while (true) {
                System.out.print("Please type a Integer(type 0 to stop): ");
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (num == 0) {
                        break;
                    }
                    list.add(num);

                } else {
                    System.out.println("Wrong type");
                    scanner.next();
                }
            }
            System.out.println("最大值=" + foundMax(list));
            System.out.println("最小值=" + foundMin(list));
            System.out.println("平均數=" + foundAvg(list));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer foundMax(List<Integer> list) {
        Integer max = list.get(0);
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static Integer foundMin(List<Integer> list) {
        Integer min = list.get(0);
        for (Integer num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static Double foundAvg(List<Integer> list) {
        Integer sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        Double avg = (double) sum / list.size();
        return avg;
    }
}
