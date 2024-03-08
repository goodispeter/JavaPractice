package Peter.BasicExam;

public class PerfectNumber {
    // 一個數如果恰好等於它的因子之和，這個數就稱為"完數"。例如6=1＋2＋3.找出1000以内的所有完數。
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (i == sum) {
                System.out.println(i);

            }
        }
    }
}
