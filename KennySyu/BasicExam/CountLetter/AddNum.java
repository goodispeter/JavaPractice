package CountLetter;


import java.util.Scanner;

public class AddNum {
    public static void main(String[] args) {

        int[] a = new int[26];
        System.out.println("請輸入一串小寫字串");
        String str = new Scanner(System.in).nextLine();
        str = str.trim().toLowerCase();


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 'a';
            a[index] = a[index] + 1;
        }


        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                System.out.println("字母" + (char) (i + 'a') + "出現:" + a[i] + "次");
            }
        }
    }

}
