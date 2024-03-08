package AboutArray;

public class aboutArray {

    //    练习题 : 数组练习2
    /*需求: 将数组中的所有元素逆序输出(3种)*/
    public static void main(String[] args) {
        reverseArray();
    }


    private static void f2() {
    }

    public static void reverseArray() {
        int[] inArrays = {1, 2, 3, 3, 4, 5, 76, 1, 2, 34};
        for (int aa = inArrays.length - 1; aa >= 0; aa--) {
            System.out.println(inArrays[aa]);
        }
    }
}


