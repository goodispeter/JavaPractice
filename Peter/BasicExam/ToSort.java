package Peter.BasicExam;

public class ToSort {
    // 寫出一個方法讓int陣列排序
    public static final int[] intArray = { 33, 1023, 2, 99 };

    public static void toSort(int[] intArray) {
        for (int i = 1; i < intArray.length; i++) {
            int key = intArray[i];
            int j = i - 1;
            while (j >= 0 && intArray[j] > key) {
                intArray[j + 1] = intArray[j];
                j = j - 1;
            }
            intArray[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        toSort(intArray);
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
