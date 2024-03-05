package Peter.BasicExam;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // 題目：打印出所有的"水仙花數"，
        // 所謂"水仙花數"是指一個三位數，其各位數字立方和等於該數本身。
        // 例如：153是一個"水仙花數"，因為153=1的三次方＋5的三次方＋3的三次方。
        // 打印100-999的水仙花數
        int start = 100;
        int end = 999;
        System.out.println(start + "到" + end + "的水仙花數為: ");
        for (int i = start; i <= end; i++) {
            int hundreds = i / 100;
            int median = (i % 100) / 10;
            int single = i % 10;
            if (i == (Math.pow(hundreds, 3)) + (Math.pow(median, 3)) + (Math.pow(single, 3))) {
                System.out.print(i + " ");
            }
        }
    }
}
