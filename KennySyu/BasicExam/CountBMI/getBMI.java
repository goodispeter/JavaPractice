package CountBMI;

public class getBMI {

    public static void BMI(double weight, double height) {
        //        練習題2: BMI 指數測試 BMI = 體重 (kg) / 身高² (m)
        double rHeight = (height / 100) * (height / 100);
        double BMI = weight / rHeight;
        String range = "";
        if (BMI < 18.5) {
            range = "過輕";
        } else if (BMI <= 22.9) {
            range = "正常";
        } else if (BMI <= 24.9) {
            range = "偏胖";
        } else if (BMI <= 29.9) {
            range = "肥胖";
        } else if (BMI <= 40) {
            range = "極度肥胖";
        }
        System.out.println("您的BMI=" + BMI);
        System.out.println("您的範圍屬於" + range);
        System.out.println("設計者Kenny 關心您的健康");
    }


}
