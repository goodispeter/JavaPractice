import java.util.HashSet;
import java.util.Set;

public class ThreeDigitNumbers {

	public static void main(String[] args) {
		// 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
	
	Set<Integer> ans = new HashSet<>();
		for(int h=1 ; h<5 ;h++) {
			for(int t=1 ; t<5 ;t++) {
				for(int x=1 ; x<5 ;x++) {
					int a =h*100+t*10+x;
					if(h!=t && h!=x && t!=x) {ans.add(a);}
				}
			}
		}
		System.out.println(ans);
		System.out.println("共有:"+ans.size()+"個");
		
	}

}
