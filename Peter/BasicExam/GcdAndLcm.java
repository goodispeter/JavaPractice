package Peter.BasicExam;

import java.math.BigInteger;

public class GcdAndLcm {
    public static void main(String[] args) {
        // 輸入兩個正整數m和n，求其最大公約數和最小公倍數。
        // 最小公倍數=兩數相乘/最大公約數
        BigInteger bi1 = BigInteger.valueOf(100);
        BigInteger bi2 = BigInteger.valueOf(55555);
        System.out.println("最大公約數=" + bi1.gcd(bi2));
        System.out.println("最小公倍數=" + bi1.multiply(bi2).divide(bi1.gcd(bi2)));
        int m = 100;
        int n = 55555;
        int gcd = 0;
        if (m > n) {
            for (int i = 2; i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("最大公約數=" + gcd);
        }
        if (n > m) {
            for (int i = 2; i <= n; i++) {
                if (m % i == 0 && n % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("最大公約數=" + gcd);
        }
        System.out.println("最小公倍數=" + (m * n) / gcd);
    }
}
