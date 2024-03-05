package Peter.BasicExam;

public class Rabbits {
    public static void main(String[] args) {
        // 有一對兔子，從出生後第3個月起每個月都生一對兔子，
        // 小兔子長到第三個月後每個月又生一對兔子，
        // 假如兔子都不死，問三年的兔子對數為多少？
        // 36個月
        int months = 36;
        int[] rabbits = new int[months];
        // 一開始有一對兔子
        // 規律為:1,1,2,3,5,8,13,21
        // rabbits[0]+rabbits[1]=rabbits[2]
        // rabbits[1]+rabbits[2]=rabbits[3]
        rabbits[0] = 1;
        rabbits[1] = 1;
        for (int i = 2; i < months; i++) {
            rabbits[i] = rabbits[i - 2] + rabbits[i - 1];
        }
        System.out.println("兔子總共有:" + rabbits[months - 1] + "對");
    }
}