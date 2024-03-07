
public class CalculateRebound {

	public static void main(String[] args) {
		// 题目：一球从h米高度自由落下，每次落地后反跳回原高度的一半；
		// 再落下，求它在第n次落地时，共经过多少米？第n次反弹多高？

		float h = 100;
		int n = 10;
		double roadLen = h;
		double expHeight = 0;
		for (int i = 0; i < n; i++) {
			roadLen += expHeight*2;
			expHeight = h / Math.pow(2,i+1);
			System.out.println("第i"+i+ "次经过"+ roadLen);
			System.out.println("第i"+i+ "預期反弹" + expHeight);
		}
		System.out.println("第"+n+ "次经过"+ roadLen);
		System.out.println("預期反弹" + expHeight);
	}
}
