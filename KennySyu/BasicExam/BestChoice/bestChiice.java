package BestChoice;

public class bestChiice {
    public static void main(String[] args) {

//        练习题：最优选择2
//
//        小蓝同学想买一个价值8888元的新手机，她的旧手机在二手市场能卖1880元，而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打7.5折优惠。为了更省钱，小蓝要不要以旧换新？

        int newPhone = 8888;
        int oldPhone = 1880;

        if (newPhone * 0.75 > newPhone - oldPhone) {
            System.out.println("建議買新手機");
        } else {
            System.out.println("建議用換的");
        }
    }
}
