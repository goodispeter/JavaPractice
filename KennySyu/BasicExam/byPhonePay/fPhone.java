package byPhonePay;

public class fPhone {


    public void getPhone(String phone) {

        if (phone.length() != 10) {
            System.out.println("您輸入數字只有" + phone.length() + "位");
            System.out.println("您輸入為" + phone + "不符合規格請輸入正確格式");
            return;
        }
        char fNum = phone.charAt(9);

        System.out.println("您數字最後一碼為：" + fNum);
        int price = 0;
        switch (fNum) {
            case '8':
                price = 50;
                break;
            case '4':
                price = 0;
                break;
            default:
                price = 20;

        }
        System.out.println("實際您支付的價格為=" + price + "元");
    }
}
