package Peter.OCAPreviousExam.Question20;

public class Question20 {
    public static void main(String[] args) {
        int x = 5;
        while (isAvailable(x)) {
            System.out.println(x);
        }
    }

    public static boolean isAvailable(int x) {
        return x-- > 0 ? true : false;
    }

    // Which modification enables the code to print 54321?
    // A. Replace line 6 with System.out.print(-x);
    // B. At line 7, insert x--;
    // C. Replace line 6 with --x;and,at luine 7, insert System.out.print(x)
    // D. Repalce line 12 wutg return(x>0)?false:true;
}
