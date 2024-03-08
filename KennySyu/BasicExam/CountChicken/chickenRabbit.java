package CountChicken;

public class chickenRabbit {

    public static void main(String[] args) {
//        練習題5:雞兔同籠問題(窮舉法)
        int chicken = 0;
        int rabbit = 0;
        int total = 35;
        System.out.println(rabbit + total);

        for (chicken = 0, rabbit = 35; chicken <= 35; chicken++, rabbit--) {
            System.out.println("雞的數量" + chicken + "\t" + "兔子數量" + rabbit + "\t" + "雞腳：" + chicken * 2 + "\t" + "兔子腳：" + rabbit * 4 + "\t" + "目前共有幾隻腳：" + (chicken * 2 + rabbit * 4));
            if (chicken * 2 + rabbit * 4 == 94) {
                System.out.println("已成功找到最佳解答" + "\t" + "雞數量" + chicken + "兔子數量" + rabbit);
                break;
            }
        }
    }
}
