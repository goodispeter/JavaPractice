package BasicExams;


public class PrimeFactorization {

	public static void main(String[] args) {

		// 題目：將一個正整數分解質因數。例如：輸入90,打印出90=2*3*3*5。
		// 程式分析：對n進行分解質因數，應先找到一個最小的質數k，然後按下述步驟完成：

		int n = 18;
		int i = 2;
		while (i <= n) {
			if (n % i == 0) {
				n = n / i;
				System.out.print(i+"*");
			} else {
				i++;
			}
		}

	}

}
