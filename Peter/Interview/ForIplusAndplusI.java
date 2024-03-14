package Peter.Interview;

public class ForIplusAndplusI {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i++= " + i);
        }
        for (int i = 0; i < 5; ++i) {
            System.out.println("++i= " + i);
        }
        int n = 0;
        int k = 0;
        System.out.println(n++);
        System.out.println(++k);
    }
}
