package BasicExams;

import java.util.ArrayList;
import java.util.List;

public class FindPerfectNumbers {

	public static void main(String[] args) {
		//一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
		List<Integer> ans = new ArrayList<>();
		for (int i = 1; i < 1000; i++) {
			int sum =0 ;
			int n = 1;
			while(n<i) {
				if(i%n==0) {
					sum+=n;
				}
				n++;
			}
			if(i==sum) {ans.add(i);}
		}
		System.out.println(ans);
	}
}
