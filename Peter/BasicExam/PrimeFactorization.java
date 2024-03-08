package Peter.BasicExam;

public class PrimeFactorization {
    public static void main(String[] args) {
        // 題目：將一個正整數分解質因數。例如：輸入90,打印出90=2*3*3*5。
        int number = 90;
        System.out.print(number + "=");
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i);
                number = number / i;
                if (number != 1) {
                    System.out.print("*");
                }
            }
        }
    }
}
