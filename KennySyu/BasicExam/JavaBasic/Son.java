package JavaBasic;

public class Son extends Father {
    private int i = test();
    private static int j = method();

    static {
        System.out.print("(6)");
    }

    Son() {
        System.out.print("(7)");
    }

    {
        System.out.print("(8)");
    }

    public int test() {
        System.out.print("(9)");
        return 1;
    }

    public static int method() {
        System.out.print("(10)");
        return 1;
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println();
        Son s2 = new Son();
    }


}

// 會先從main 所在的class 去初始化
// class初始化 編譯器會使用client方法，會先 從 父類初始化
// 而  初始化的類，優先順序為 static 開始
//1. method   >> 5
//2. static   >> 1
//3. 換 子類 static
//4. method   >> 10
//5. static  >> 6

