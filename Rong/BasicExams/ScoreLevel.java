package BasicExams;


public class ScoreLevel {

	public static void main(String[] args) {
		
		//題目：利用條件運算子的巢狀來完成此題：學習成績>=90分的同學用A表示，60-89分之間的用B表示，60分以下的用C表示。
		
		int score = 78;
//		if(score>=0 && score <=60) {
//			System.out.println("C");
//		}else if(score>60 && score<=89) {
//			System.out.println("B");
//		}else if(score>=90 && score<=100) {
//			System.out.println("A");
//		}
		
	String level = (score >=90) ? "A" :(score >=60? "B" :"C") ;
	System.out.println(level);
	}
}
