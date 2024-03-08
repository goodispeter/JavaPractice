package Peter.BasicExam;

public class FoundPrime {
    public static void main(String[] args) {
        // 判斷101-200之間有多少個質數，並輸出所有質數。
        // 只能被1或本身整除得數
        int start = 101;
        int end = 200;
        System.out.println(start + "到" + end + "之間得質數為");
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true && i != 1) {
                System.out.print(i + " ");
            }
        }
    }

}
