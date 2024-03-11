package Peter.OCAPreviousExam.Question11;

interface Readable {
    public void readBook();

    public void setBookMark();
}

abstract class Book implements Readable { // line n1
    public void readBook() {

    }
    // line n2
}

// class EBook extends Book { // line n3
// public void readBook() {
// }

// // line n4
// }

public class Question11 {
    public static void main(String[] args) {
        // Book book1 = new EBook();
        // book1.readBook();
        // Which option enable the code to compile
        // A. Replace the code fragment at line n1 With:
        // class Book implenents Readable
        // B. At line n2 insert
        // public abstract void setBookMark();
        // C. Replae the code fragment at line n3 with:
        // abstract class Ebook extends Book{}
        // D. At line n4 insert:
        // public void setBookMark
    }
}
