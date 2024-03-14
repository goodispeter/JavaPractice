package Peter.Interview;

public class StringAdd {
    // 有一String為"a,b,c,d,e,f,g…"，
    // 請分別列印出
    // "a1"、"b1"、"c1"、"d1"、"e1"、"f1"、"g1"…=。
    private final static String STR = "a,b,c,d,e,f,g";

    public static void main(String[] args) {
        String[] strArr = STR.split(",");
        for (String s : strArr) {
            System.out.println(s + 1);
        }
    }
}
