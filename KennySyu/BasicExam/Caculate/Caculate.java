package Caculate;

public class Caculate {
    public static void main(String[] args) {
        add(4, 2);
        reduce(4, 2);
        multiplication(4, 2);
        division(4, 2);


    }


    public static void add(int a, int b) {
        int ab = a + b;
        System.out.println(ab);
    }

    public static void reduce(int a, int b) {
        int ab = a - b;
        System.out.println(ab);
    }

    public static void multiplication(int a, int b) {
        int ab = a * b;
        System.out.println(ab);
    }

    public static void division(int a, int b) {
        int ab = a / b;
        System.out.println(ab);
    }

}
