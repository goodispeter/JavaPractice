import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class prog14 {

	public static void main(String[] args) {
		// 题目：输入某年某月某日，判断这一天是这一年的第几天？
		// 闰年的条件：year除以400能整除，或者year除以4能整除，但是不能是100的倍数
		
		String dtStr = "2024/04/31";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        
        // 将字符串解析为 LocalDate 对象
        LocalDate date = LocalDate.parse(dtStr, formatter);
        
        System.out.println(date);
        // 获取年、月、日
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        
        int sum = 0;
        
        if(year%400==0 || (year%4==0 && year%100!=0)) {
        	int [] md = {31,29,31,30,31,30,31,31,30,31,30,31};
        }else {
        	
        }
        
	}

}
