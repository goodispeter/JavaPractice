package BasicExams;


public class ThirdFlowerSum {

	public static void main(String[] args) {
		
		// 打印出所有的”水仙花數”，所謂”水仙花數”是指一個三位數，其各位數字立方和等於該數本身。
		// 例如：153是一個”水仙花數”，因爲153=1的三次方＋5的三次方＋3的三次方。
		for(int i =100;i<1000;i++) {
			boolean Ans = true;
			
			int h = i/100;
			int b = (i/10)%10;
			int t = i%10;
			
			if(i!=(h*h*h)+(b*b*b)+(t*t*t)) {
				Ans = false;
			}
			if(Ans==true) {
			System.out.println(i);
			}
		}
	}
}
