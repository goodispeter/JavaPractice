package Prime;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("我們來找質");
        int i, j;
        for (i = 1; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (j >= i)
                System.out.println(j);
        }
    }
}
