package WinterORSummer;

import java.util.Scanner;

public class winterORsummer {

//    练习题 : 嵌套分支的练习
//
//    需求:提示并接收用户输入的月份,判断并输出属于哪个季节
//1-12月是合法数据 3~5春天 6~8夏天 9~11秋天 其他情况冬天

    public static void main(String[] args) {
        System.out.println("please input month");
        int season = new Scanner(System.in).nextInt();
        if (season <= 0 || season > 12) {
            System.out.println("您似乎輸入不正確月份");
            return;
        }

        if (season >= 3 && season <= 5) {
            System.out.println("現在是春天");
        } else if (season >= 6 && season <= 8) {
            System.out.println("現在是夏天");
        } else if (season >= 9 && season <= 11) {
            System.out.println("現在是秋天");
        } else {
            System.out.println("現在冬天了");
        }
    }


}
