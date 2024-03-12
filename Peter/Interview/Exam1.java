package Peter.Interview;

import java.util.HashSet;
import java.util.Set;

public class Exam1 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Tom");
        hashSet.add("Tom");
        hashSet.remove("Tom");
        for (String str : hashSet) {
            System.out.println(str);
        }
    }
}
