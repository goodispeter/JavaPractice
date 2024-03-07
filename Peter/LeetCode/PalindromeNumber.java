package Peter.LeetCode;

import java.util.Scanner;

public class PalindromeNumber {
    // Given an integer x, return true if x is a
    // palindrome
    // , and false otherwise.
    // Example 1:
    // Input: x = 121
    // Output: true
    // Explanation: 121 reads as 121 from left to right and from right to left.
    // Example 2:
    // Input: x = -121
    // Output: false
    // Explanation: From left to right, it reads -121. From right to left, it
    // becomes 121-. Therefore it is not a palindrome.
    // Example 3:
    // Input: x = 10
    // Output: false
    // Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please type an Integer");
            int number = scanner.nextInt();
            if (isPalindrome(number)) {
                System.out.println(number + " is a Palindrome Number");
            } else {
                System.out.println(number + " is not a Palindrome Number");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isPalindrome(int number) {
        String numStr = Integer.toString(number);
        int last = numStr.length() - 1;
        // 將數字反過來儲存成新的String
        String oppositeArr = "";
        for (int i = last; i >= 0; i--) {
            oppositeArr += String.valueOf(numStr.charAt(i));
        }
        return numStr.equals(oppositeArr);
    }
}
