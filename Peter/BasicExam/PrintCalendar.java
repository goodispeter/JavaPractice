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
        date = date.minusDays(day - 1);
        // 印出2024-03-01
        System.out.println(date);
        // 找到這個月第一天是禮拜幾
        DayOfWeek weekDay = date.getDayOfWeek();
        // Monday = 1; Sunday = 7;
        int value = weekDay.getValue();
        System.out.println(WEEKDAY);
        for (int i = 1; i < value; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue() == month) {
            System.out.printf("%3d", date.getDayOfMonth());
            if (date.getDayOfMonth() == day) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }

    }
}
