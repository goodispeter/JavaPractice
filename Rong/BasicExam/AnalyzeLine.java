
import java.util.Scanner;


public class AnalyzeLine {

	public static void main(String[] args) {
		//題目：輸入一行字元，分別統計出其英文字母、空格、數字和其它字元的個數。
		System.out.println("請輸入一段文字");
		try (Scanner scanner = new Scanner(System.in)) {
			String nextLine = scanner.nextLine();
//		String nextLine = "w%我ne @#kqe e123!";
			char[] arr = nextLine.toCharArray();
			int isSpace = 0;
			int isNumber = 0;
			int isAlpha = 0;
			int isOther=0;
			for (int i = 0; i < arr.length; i++) {
				char x = arr[i];
				
				if(x==32) {
					isSpace++;
				}else if(x>47 && x<58) {
					isNumber++;
				}else if((x>64 && x<91)||(x>96 && x<123)) {
					isAlpha++;
				}else {
					isOther++;
				}
			}
			System.out.println("空格個數＝"+isSpace);
			System.out.println("數字個數＝"+isNumber);
			System.out.println("字母個數＝"+isAlpha);
			System.out.println("其他個數＝"+isOther);
		}	
	}
}
