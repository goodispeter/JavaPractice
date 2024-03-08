package Peter.BasicExam;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BMICalculate {
    // BMI公式:體重(公斤)/身高(公尺)的平方
    public static void main(String[] args) {
        Map<String, Double> inputMap = inputToMap();
        System.out.println("your BMI = " + Math.round(BMICalculate(inputMap) * 100.0) / 100.0);
    }

    private static Map<String, Double> inputToMap() {
        Map<String, Double> inputMap = new HashMap<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please type your height(cm): ");
            if (scanner.hasNextDouble()) {
                double height = scanner.nextDouble();
                inputMap.put("Height", height);
                System.out.println("Please type your weight(kg): ");
                if (scanner.hasNextDouble()) {
                    double weight = scanner.nextDouble();
                    inputMap.put("Weight", weight);
                } else {
                    System.out.println("體重格式輸入錯誤");
                    return null;
                }
            } else {
                System.out.println("身高格式輸入錯誤");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inputMap;

    }

    // BMI公式:體重(公斤)/身高(公尺)的平方
    private static Double BMICalculate(Map<String, Double> inputMap) {
        if (inputMap != null) {
            return inputMap.get("Weight") /
                    (Math.pow(inputMap.get("Height") / 100, 2));
        }
        return null;
    }

}
