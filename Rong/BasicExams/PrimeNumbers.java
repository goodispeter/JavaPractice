package BasicExams;


public class PrimeNumbers {

	public static void main(String[] args) {

		for (int i = 101; i <= 200; i++) {
			boolean Ans = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					Ans = false;
					break;
				}
			}
			if(Ans==true) {
			System.out.println(i);
			}
		}
	}
}