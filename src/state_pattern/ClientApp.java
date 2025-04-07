package state_pattern;

// Implements finite-sate machine
// Object alerts behaviour when the sate is changed
/*
         action 1     action 2
     A <---------> B <-------->C
         action 1     action 2
 */
public class ClientApp {
    public static void main(String[] args) {
        Subject subject = new Subject();
        String s1 = subject.action1();
        s1 = subject.action1();
        s1 = subject.action1();
        s1 = subject.action2();
        s1 = subject.action2();
        System.out.println(s1);
    }
}
