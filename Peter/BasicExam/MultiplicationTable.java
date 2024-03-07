package Peter.BasicExam;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.print(j + "*" + i + "=" + i * j + " ");
            }
            System.out.println("");
        }
    }
}
