package BasicExams;


public class RepeatedSum {

	public static void main(String[] args) {
		// 题目：求s = a + aa + aaa + aaaa + aa...a的值，其中a是一个数字。
		// 例如2 + 22 + 222 + 2222 + 22222(此时共有5个数相加)，几个数相加有键盘控制。
		
		int sum = 0;
		int newNum = 0;
		int oldNum = 0;
		int a = 3;
		int n = 4;
		
		for(int i = 0;i<n;i++) {
			int pow = (int) Math.pow(10,i);
			newNum+=a*pow;
			System.out.println("newNum="+newNum);
			sum = newNum + oldNum;
			System.out.println("suminline="+sum);
			oldNum=sum;
			System.out.println("oldNum="+oldNum);
		}
		System.out.println("sum="+sum);
	}
}
