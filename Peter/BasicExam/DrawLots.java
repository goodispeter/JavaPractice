package Peter.BasicExam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class DrawLots {
    private static final String[] STUDENTS = { "A", "B", "C", "D", "E", "F", "G", "H" };

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("請輸入人數: ");
            int howMany = scanner.nextInt();
            if (draw(STUDENTS, howMany) != null) {
                System.out.println(draw(STUDENTS, howMany));
            } else {
                System.out.println("請檢查資料後重新輸入");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> draw(String[] STUDENTS, int howMany) {
        ArrayList<String> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        if (STUDENTS.length != 0 && howMany <= STUDENTS.length && howMany != 0) {
            for (int i = 0; i < howMany; i++) {
                int index = (int) (Math.random() * STUDENTS.length);
                while (set.contains(index)) {
                    index = (int) (Math.random() * STUDENTS.length);
                }
                set.add(index);
                list.add(STUDENTS[index]);
            }
            return list;
        } else {
            return null;
        }
    }
}
