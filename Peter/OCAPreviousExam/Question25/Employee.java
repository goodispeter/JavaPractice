package Peter.OCAPreviousExam.Question25;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
        // line n1

    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        // line n2
        System.out.println(e);
    }
    // Which two modifications, when made independently, enable the code to print
    // joe:true: 100.0
}
