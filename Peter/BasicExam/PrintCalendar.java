package Peter.BasicExam;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PrintCalendar {
    private static final String WEEKDAY = "MON TUE WED THU FRI SAT SUN";

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // 獲取月份
        int month = date.getMonthValue();
        // 獲取日期
        int day = date.getDayOfMonth();
        // 將date設定為這個月的第一天
        // 減去今天-1 EX: 今天11號 11-(11-1)一定就等於1 就是當前第一日
        date = date.minusDays(day - 1);
        // 找到這個月第一天是禮拜幾
        DayOfWeek weekDay = date.getDayOfWeek();
        // Monday = 1,TUE=2....Sunday = 7;
        int value = weekDay.getValue();
        System.out.println(WEEKDAY);
        // 打印出前面的空格
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        // 如果在當月就執行迴圈
        while (date.getMonthValue() == month) {
            // %3d是一个格式化字符串，他告訴printf方法輸出一个整數，占用至少3个字符的寬度，不足的地方在前面用空格填充。
            System.out.printf("%3d", date.getDayOfMonth());
            // 當前日用*標記
            if (date.getDayOfMonth() == day) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            // 當前日期＋1日 如果getDayOfWeek().getValue是1的話(禮拜一)就換行
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        // 如果最後一日不
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }
    }
}
