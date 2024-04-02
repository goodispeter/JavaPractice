package Peter.OCAPreviousExam.Question44;

public class Question44 {

}

class Base {
    public void test() {
        System.out.println("Base ");
    }
}

class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA ");
    }
}

class DerivedB extends DerivedA {
    public void test() {
        System.out.println("DerivedB ");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
        // What is the result?
    }
}
