package Peter.Interview;

public class StaticBlockAndInstanceBlock {
    public StaticBlockAndInstanceBlock() {
        System.out.println("this is constructor");
    }

    {
        System.out.println("This is Instance Block");
    }
    static {
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        new StaticBlockAndInstanceBlock();
    }

}
