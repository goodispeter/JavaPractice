package Peter.BasicExam;

public class UnknownNumber {
    // 一个整数，它加上100後是一个完全平方數，再加上168又是一个完全平方數，请问該數是多少？
    // 在十萬內判斷
    // 完全平方數 例如：9 = 3 × 3

    public static void main(String[] args) {
        // 解法一
        for (int i = 1; i <= 100000; i++) {
            for (int j = 1; j <= i + 100; j++) {
                if ((i + 100) % j == 0 && (i + 100) / j == j) {
                    for (int k = 1; k <= i + 268; k++) {
                        if ((i + 268) % k == 0 && (i + 268) / k == k) {
                            System.out.println(i);
                        }
                    }
                }
            }
        }
        System.out.println("-----------------------");
        // 解法二
        for (int i = 1; i <= 100000; i++) {
            if (Math.sqrt(i + 100) == (int) Math.sqrt(i + 100)
                    && Math.sqrt(i + 268) == (int) Math.sqrt(i + 268)) {
                System.out.println(i);
            }
        }
    }
}
