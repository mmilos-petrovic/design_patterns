package state_pattern;

public class StateA extends State{

    public StateA(Subject subject)
    {
        super(subject);
    }

    @Override
    public String action1() {
        System.out.println("State A => State B");
        this.subject.setState(new StateB(this.subject));
        return this.subject.doing2();
    }

    @Override
    public String action2() {
        System.out.println("State A => State A");
        return this.subject.doing1();
    }
}
