package Peter.BasicExam;

import java.util.HashSet;

public class NoDuplicate {
    // 有1、2、3、4个數字，能组成多少个互不相同且重複數字的三位數？都是多少？
    private static final int[] numberList = { 1, 2, 3, 4 };

    public static void main(String[] args) {
        HashSet<Integer> set = randomHashSet(numberList);
        System.out.println("有" + set.size() + "個數字");
        System.out.println(set);

    }

    private static HashSet<Integer> randomHashSet(int[] numberList) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < numberList.length; i++) {
            for (int j = 0; j < numberList.length; j++) {
                for (int k = 0; k < numberList.length; k++) {
                    if (i != j && i != k && j != k) {
                        int number = numberList[i] * 100 + numberList[j] * 10 + numberList[k];
                        set.add(number);
                    }
                }
            }
        }
        return set;
    }
}
