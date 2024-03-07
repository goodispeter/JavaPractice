
public class BonusRange {

	public static void main(String[] args) {
		/*
		  利润(I)低于或等于10万元时，奖金可提10%；
		  利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
		  20万到40万之间时，高于20万元的部分，可提成5%；
		  40万到60万之间时高于40万元的部分，可提成3%；
		  60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
		  从键盘输入当月利润lirun，求应发放奖金总数sum？
		*/

		// Scanner input = new Scanner(System.in);
		int i=432000;
		double bonus = 0;
		if(i<=100000) {
			bonus=i*0.1;
		}else if(i>100000 && i<=200000) {
			bonus=(i-100000)*0.075+10000;
		}else if(i>200000 && i<=400000) {
			bonus=(i-200000)*0.05+17500;
		}else if(i>400000 && i<=600000) {
			bonus=(i-400000)*0.03+27500;
		}else if(i>600000 && i<=1000000) {
			bonus=(i-600000)*0.015+32500;
		}else if(i>1000000) {
			bonus=(i-1000000)*0.01+38500;
		}
		
		System.out.println(bonus);		
		
	}

}
