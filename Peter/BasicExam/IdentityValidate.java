package Peter.BasicExam;

import java.util.Scanner;

public class IdentityValidate {
    // 每個相對應數字乘上對應的邏輯乘數
    // 將乘數相加後除以10 10減去餘數的值同最後一碼的話為正確的身份證號碼
    // 定義邏輯乘數的常數陣列
    private static final int[] LOGICALMULTIPLIER = { 1, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("請輸入一組身分證號碼: ");
            String input = scanner.nextLine();
            if (isInputValidate(input)) {
                String identityNum = alphatToNumStr(input) + input.substring(1);
                System.out.println(identityNum);
                if (isIdentityValidate(identityNum)) {
                    System.out.println("正確的身分證字號");
                } else {
                    System.out.println("不正確的身分證字號");
                }
            } else {
                System.out.println("輸入不合法");
            }

        }
    }

    // 驗證使用者輸入是否正確 長度等於10 首字為子母 其餘為0-9
    private static boolean isInputValidate(String input) {
        if (input.length() != 10) {
            return false;
        }
        if (Character.toUpperCase(input.charAt(0)) < 'A' || Character.toUpperCase(input.charAt(0)) > 'Z') {
            return false;
        }
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) < '0' || input.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    // 將第一碼英文字母轉換成數字字串
    private static String alphatToNumStr(String input) {
        char alphat = Character.toUpperCase(input.charAt(0));
        switch (alphat) {
            case 'A':
                return "10";
            case 'B':
                return "11";
            case 'C':
                return "12";
            case 'D':
                return "13";
            case 'E':
                return "14";
            case 'F':
                return "15";
            case 'G':
                return "16";
            case 'H':
                return "17";
            case 'I':
                return "34";
            case 'J':
                return "18";
            case 'K':
                return "19";
            case 'L':
                return "20";
            case 'M':
                return "21";
            case 'N':
                return "22";
            case 'O':
                return "35";
            case 'P':
                return "23";
            case 'Q':
                return "24";
            case 'R':
                return "25";
            case 'S':
                return "26";
            case 'T':
                return "27";
            case 'U':
                return "28";
            case 'V':
                return "29";
            case 'W':
                return "30";
            case 'X':
                return "31";
            case 'Y':
                return "32";
            case 'Z':
                return "33";
            default:
                return null;
        }
    }

    // 驗證身分證邏輯
    private static boolean isIdentityValidate(String identityNum) {
        int[] identityArr = stringToIntArray(identityNum);
        int sum = 0;
        for (int i = 0; i < identityArr.length - 1; i++) {
            sum += identityArr[i] * LOGICALMULTIPLIER[i];
        }
        System.out.println("sum=" + sum);
        if (10 - (sum % 10) == identityArr[identityArr.length - 1]) {
            return true;
        }
        return false;
    }

    // 將String轉乘int[]
    private static int[] stringToIntArray(String identityNum) {
        int[] num = new int[identityNum.length()];
        for (int i = 0; i < identityNum.length(); i++) {
            num[i] = Character.getNumericValue(identityNum.charAt(i));
        }
        return num;
    }
}
