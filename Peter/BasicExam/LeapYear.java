package Peter.BasicExam;

import java.util.Scanner;

public class LeapYear {
    // 輸入年份判斷此年是否為閏年
    // 閏年：
    // 1. 能被4整除但不能被100整除
    // 2. 能被100整除也能被400整除
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("please give a year ");
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                if (year > 0) {
                    if (isLeapYear(year)) {
                        System.out.println(year + "是閏年");
                    } else {
                        System.out.println(year + "不是閏年");
                    }
                }
            } else {
                System.out.println("格式輸入錯誤");
            }
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
