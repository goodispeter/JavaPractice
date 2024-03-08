package TestIterator;

public class iterator {
    public static void main(String[] args) {

//        1、for迴圈輸出1 到100


        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

//        2、while迴圈輸出1-100
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }


//        2 * 5 = 10
//        4 * 10 = 40
//        6 * 15 = 90
//                ?*100 =?
        int bb = 2;
        for (int j = 5; j <= 100; j += 5, bb += 2) {
            System.out.println(bb + "*" + j + "=" + "\t" + bb * j);
        }
    }
}
