package Peter.Interview;

public class StringAdd {
    // 有一String為"a,b,c,d,e,f,g…"，
    // 請分別列印出
    // "a1"、"b1"、"c1"、"d1"、"e1"、"f1"、"g1"…=。
    private static final String S = "a,b,c,d,e,f,g";

    public static void main(String[] args) {
        String[] stringList = S.split(",");
        for (int i = 1; i <= stringList.length; i++) {
            System.out.print(stringList[i - 1] + i + " ");
        }
    }
}
