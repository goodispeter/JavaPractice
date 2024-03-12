package Peter.BasicExam;

public class DigitsInteger {
    // Write a method that computes the sum of the digits in an integer. Use the
    // following method header:
    // public static int sumDigits(long n)
    // For example, sumDigits(234) returns 9 (2+3+4). Use a loop to repeatedly
    // extract and remove the digit until all the digits are extracted. Write a test
    // program thar prompts the user to enter an inter an integer and displays the
    // sum of all its digits.
    private static final long N = 234;

    public static void main(String[] args) {
        System.out.println(sumDigits(N));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            int a = (int) n % 10;
            int b = (int) n / 10;
            n = b;
            sum += a;
        }
        return sum;
    }
}
