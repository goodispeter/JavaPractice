package Peter.BasicExam.ChickensAndRabbits;

public class ChickenAndRabbit {
    // 雞兔同籠
    // 假設雞總共有X隻，兔子總共有Y隻，所以籠子裡的總數為X+Y=35隻。
    // 又每一隻雞有2隻腳，每一隻兔子有4隻腳，總共籠子裡雞和兔子的腳共有2X+4Y=94隻腳
    private static final int SUM = 35;
    private static final int FOOTS = 94;

    public static void main(String[] args) {
        Rabbits rabbits = new Rabbits();
        Chickens chickens = new Chickens();

        for (int x = 0; x <= SUM; x++) {
            int y = 35 - x;
            if ((x * 2) + (y * 4) == 94) {
                rabbits.setRabbitsTotal(x);
                chickens.setChickenTotal(y);
                break;
            }
        }
        System.out.println("兔子有:" + rabbits.getRabbitsTotal() + "隻");
        System.out.println("雞有:" + chickens.getChickenTotal() + "隻");

    }

}
