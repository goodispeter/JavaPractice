package Peter.OCAPreviousExam.Question35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question35 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(6, 24, 2014);
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 =" + date1);
        System.out.println("date2 =" + date2);
        System.out.println("date3 =" + date3);
        // Assume that the system date is June20,2014.What is the result
    }
}
