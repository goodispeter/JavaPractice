package BasicExams;


public class CalculateGCDAndLCM {

	public static void main(String[] args) {
		
		//題目：輸入兩個正整數m和n，求其最大公約數和最小公倍數。

		int m=24;
		int n=60;
		int i=2;
		int insum = 1;
		int smallBas;
		while (i<=m && i<=n) {
			if(m%i==0 && n%i==0) {
				m=m/i;
				n=n/i;
				insum = insum*i;
//				System.out.print(i+",");
//				System.err.println();
			}else{i++;}	
//			smallBas =insum * m/insum * n/insum;
//			System.err.println("小公倍數"+smallBas);
		}
		smallBas =insum * m * n;
		System.out.print("最大公因"+insum);
		System.out.print("最小公倍"+smallBas);
		
	}
}
