package Peter.LeetCode;

import java.util.Scanner;

public class LengthOfLastWord {
    // Given a string s consisting of words and spaces, return the length of the
    // last word in the string.

    // A word is a maximal
    // substring
    // consisting of non-space characters only.

    // Example 1:
    // Input: s = "Hello World"
    // Output: 5
    // Explanation: The last word is "World" with length 5.

    // Example 2:
    // Input: s = " fly me to the moon "
    // Output: 4
    // Explanation: The last word is "moon" with length 4.

    // Example 3:
    // Input: s = "luffy is still joyboy"
    // Output: 6
    // Explanation: The last word is "joyboy" with length 6.

    // Constraints:
    // 1 <= s.length <= 104
    // s consists of only English letters and spaces ' '.
    // There will be at least one word in s.
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Please type a senstence: ");
            String input = scanner.nextLine();
            if (!input.matches("[a-zA-z\\s]+")) {
                System.out.println("input must contain only English letters and spaces");
            } else if (input.length() < 1 || input.length() > 104) {
                System.out.println("input length must greater than 1 and less than 104");
            } else {
                // 刪除首尾空格
                input = input.trim();
                LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
                System.out.println(lengthOfLastWord.foundLastWord(input));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String foundLastWord(String input) {
        // 用空格做為分割符號
        String[] stringList = input.split(" ");
        String lastWord = stringList[stringList.length - 1];
        return "The last word is " + lastWord + " with length " + lastWord.length() + ".";

    }
}
