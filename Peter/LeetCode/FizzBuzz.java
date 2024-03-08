package Peter.LeetCode;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class FizzBuzz {
    // Given an integer n, return a string array answer (1-indexed) where:
    // answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    // answer[i] == "Fizz" if i is divisible by 3.
    // answer[i] == "Buzz" if i is divisible by 5.
    // answer[i] == i (as a string) if none of the above conditions are true.
    // Example 1
    // Input: n = 3
    // Output: ["1","2","Fizz"]
    // Example 2:
    // Input: n = 5
    // Output: ["1","2","Fizz","4","Buzz"]

    // Example 3: Input: n = 15

    // Output:
    // ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    Integer n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please giva an Integer: ");
        Integer n = scanner.nextInt();
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> resultList = fizzBuzz.fizzBuzzList(n);
        System.out.print("[");
        for (int i = 0; i <= resultList.size() - 1; i++) {
            if (i != resultList.size() - 1) {
                System.out.print(resultList.get(i) + ",");
            } else {
                System.out.print(resultList.get(i));
            }
        }
        System.out.print("]");
        scanner.close();
    }

    private List<String> fizzBuzzList(Integer n) {
        List<String> fizzBuzzList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fizzBuzzList.add(fizzBuzzValidate(i));
        }
        return fizzBuzzList;
    }

    private String fizzBuzzValidate(Integer n) {
        if (n % 3 == 0 && n % 5 != 0) {
            return "Fizz";
        } else if (n % 5 == 0 && n % 3 != 0) {
            return "Buzz";
        } else if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else {
            return Integer.toString(n);
        }
    }
}
