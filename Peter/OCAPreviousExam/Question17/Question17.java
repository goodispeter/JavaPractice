package Peter.OCAPreviousExam.Question17;

public class Question17 {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) Math.random() * 1000);
        System.out.println(acct.getAmount());
        // line n1
        System.out.println(acct.getAmount());

        // which three lines , when inserted independently at line n1,
        // cause the program to print a 0 balance?(Choose three.)

        // A.acct.setAmount(-acct.getAmount());
        // B.acct.amount = 0;
        // C.acct.setAmount(0);
        // D.acct.getAmount() = 0;
        // E.this.amount = 0;
        // F.acct.changeAmount(0);
        // G.acct.changeAmount(-acct.amount);
    }

}
