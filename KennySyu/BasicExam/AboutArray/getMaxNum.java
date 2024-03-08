package AboutArray;

public class getMaxNum {


    /*本类用于复习数组的操作*/

    public static void main(String[] args) {
        //需求1:求出数组中所有的元素之和
        f1();
        //需求2:求出数组中所有元素的最大值
        f2();
    }

    private static void f2() {
//        int[] intArray = {24, 2, 0, 34, 12, 110, 2};
//
//        int maxNum = intArray[0];
//
//        for (int j : intArray) {
//            if (j > maxNum)
//                maxNum = j;
//        }
//
//        System.out.println("Maximum number = " + maxNum);
        int[] inArray = {2, 4, 5, 67, 78, 12, 213123, 123};
        int maxNum = inArray[0];
        for (int i = 0; i < inArray.length; i++) {
            if (maxNum < inArray[i]) {
                maxNum = inArray[i];
            }
        }
        System.out.println("maxNum" + maxNum);
    }

    private static void f1() {
//        //需求1:求出数组中所有的元素之和
//        //1.定义一个数组
//        int[] a = {1, 2, 3, 4, 5};
//        //2.定义一个变量用来保存最终的结果
//        int sum = 0;
//        //3.用数组的遍历来进行数据的累加
//        //i:下标 0 a.length-1 ++
//        for (int i = 0; i <= a.length - 1; i++) {
//            sum += a[i];
//        }
//        System.out.println("数组元素累计的和为:" + sum);


        int[] inarray = {1, 2, 3, 4, 5, 6,};
        int sum = 0;

        for (int i = 0; i < inarray.length; i++) {
            sum += inarray[i];
        }
        System.out.println("總和為" + sum);
    }
}



