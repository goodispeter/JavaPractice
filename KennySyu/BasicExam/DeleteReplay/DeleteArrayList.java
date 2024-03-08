package DeleteReplay;

import java.util.ArrayList;

public class DeleteArrayList {
    public static void main(String[] args) {

        int[] str = {1, 1, 1, 2, 2, 2, 3, 3, 3, 3,};
        ArrayList<Object> list = new ArrayList<>(); // new ayyar put str
        for (int i = 0; i < str.length; i++) {
            if (!list.contains(str[i]))
                list.add(str[i]);
        }
        System.out.println("去除整數的陣列" + list);
    }

}
