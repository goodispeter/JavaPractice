package isNeworOld;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class newORold {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd :hh:mm:ss");


        System.out.println(calendar.getTime());

//        System.out.println(dateFormat.format());
    }

}


