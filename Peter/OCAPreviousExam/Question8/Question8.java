package Peter.OCAPreviousExam.Question8;

class Caller {
    private void init() {
        System.out.println("Initialized");
    }

    private void start() {
        init();
        System.out.println("Started");
    }
}

public class Question8 {
    public static void main(String[] args) {
        Caller c = new Caller();
        // c.start(); // line n1
        // c.init(); // line n2
    }
}
