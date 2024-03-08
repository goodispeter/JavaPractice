package byPhonePay;

import java.util.Scanner;

public class Phone {

    public static void main(String[] args) {
//        練習題3: 手機選號:根據使用者輸入的手機號來確認使用者實際支付的價格
//        如果尾數為8，需支付辦卡費50元
//        如果尾數為4，需支付辦卡費用0元
//        如果是其他尾號,需支付辦卡費用20員
        System.out.println("請輸入你的門號號碼");
        String phone = new Scanner(System.in).nextLine();
        fPhone fPhone = new fPhone();
        fPhone.getPhone(phone);

    }

}
