package LoseFatPlan;

import java.util.Scanner;

public class LoseFatPlan {

    //    使用嵌套分支完成练习
//    接收用户输入的星期数，提示用户今天的减肥安排
//    星期一：跳绳
//    星期二：跑步
//    星期三：瑜伽
//    星期四: 普拉提
//    星期五：打网球
//    星期六：游泳
//    星期日：休息日不运动
    public static void main(String[] args) {
        System.out.println("please input weekday today?");
        String lose = new Scanner(System.in).nextLine();
        switch (lose) {
            case "星期一":
                System.out.println("跳繩");
                break;
            case "星期二":
                System.out.println("跳繩");
                break;
            case "星期三":
                System.out.println("瑜伽");
                break;
            case "星期四":
                System.out.println("普拉提");
                break;
            case "星期五":
                System.out.println("打网球");
                break;
            case "星期六":
                System.out.println("游泳");
                break;
            case "星期日":
                System.out.println("今天是休息日");
                break;
            default:
                System.out.println("似乎輸入錯誤喔 ，正確格式為= 星期x");
                return;
        }
    }
}
