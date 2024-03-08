package Peter.BasicExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Accumulate {
    // 求s = a + aa + aaa + aaaa + aa...a的值
    // 例如輸入2及5 會顯示出2+22+222+2222+22222的值
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please type a Integer: ");
            int number = scanner.nextInt();
            System.out.println("Please type how many time to add: ");
            int numberOfTimes = scanner.nextInt();
            System.out.println("答案為:" + calculate(number, numberOfTimes));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int calculate(int number, int numberOfTimes) {
        int newNum = 0;
        int result = 0;
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < numberOfTimes; i++) {
            newNum += number * (int) Math.pow(10, i);
            numberList.add(newNum);
        }
        for (int num : numberList) {
            System.out.println(num);
            result += num;
        }
        return result;
    }
}
