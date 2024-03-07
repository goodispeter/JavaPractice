package Peter.BasicExam;

import java.util.Scanner;

public class UBNValide {
    // 統一編號為8位數的整數
    // 邏輯乘數為[1,2,1,2,1,2,4,1]
    // 第7位數不是7的時候: 乘積之和(+)能被5整除就符合
    // 第7位數為7的時候: 成績之和最後第二位數任一位數做相加能被5整除,就符合
    // 定義乘績之和的常數陣列
    public static final int[] LOGICALMULTIPLIER = { 1, 2, 1, 2, 1, 2, 4, 1 };

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please give an UBN: ");
            String ubnStr = scanner.nextLine();
            if (ubnStr.length() == 8 && ubnStr != null) {
                int[] ubn = stringToIntArray(ubnStr);
                if (validate(ubn) == true) {
                    System.out.println("正確格式");
                } else {
                    System.out.println("不合法的統一編號");
                }
            } else {
                System.out.println("請輸入正確統一編號");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int[] stringToIntArray(String ubnStr) {
        int[] ubn = new int[ubnStr.length()];
        for (int i = 0; i < ubn.length; i++) {
            char c = ubnStr.charAt(i);
            if (c >= '0' && c <= '9') {
                ubn[i] = Character.getNumericValue(c);
            } else {
                return null;
            }
        }
        return ubn;
    }

    private static boolean validate(int[] ubn) {
        int sum = 0;
        int[] mulitply = new int[ubn.length];
        for (int i = 0; i < ubn.length; i++) {
            mulitply[i] = ubn[i] * LOGICALMULTIPLIER[i];
            // 如果相加為二位數 將兩個二位數相加
            if (mulitply[i] > 9) {
                mulitply[i] = (mulitply[i] / 10) + (mulitply[i] % 10);
            }
            // 如果相加後是10(只有倒數第二個元素會發生) 將此元素定義為1
            if (mulitply[i] == 10) {
                mulitply[i] = 1;
            }
        }
        for (int n : mulitply) {
            sum += n;
        }
        // 倒數第二個元素為1時整列總合可以被10整除返回true
        // 不能被10整除時將總和-1(因為倒數第二個元素只會是1 or 0)在除一次 可以整除也返回true
        if (sum % 10 == 0) {
            return true;
        } else if ((sum - 1) % 10 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
