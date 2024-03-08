package JavaChangeType;

public class changeType {
    public static void main(String[] args) {

        byte a = 10;
        short b = a;  //小轉大 不會有錯

        int c = 1;
        long d = c; //小轉大 不會有錯

        long ll = 11112132132131223l;
        int ttt = (int) ll;


    }
}


