package Peter.Interview;

class Parent {
    Parent() {
        System.out.println("This is Parent");
    }

    public void print() {
        System.out.println("Print Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("This is Child");
    }

    public void print() {
        System.out.println("Print Child");
    }
}

class Child2 extends Parent {
    Child2() {
        System.out.println("This is Child2");
    }

    public void print() {
        System.out.println("Print Child2");
    }

    public void printChild2() {
        System.out.println("Did not Intance Child2");
    }
}

class ChildChild3 extends Child2 {
    ChildChild3() {
        super.print();
        System.out.println("This is ChildChild3");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Parent parent = new Child2();
        parent.print();

    }
}
