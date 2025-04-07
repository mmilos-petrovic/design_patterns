package state_pattern;

public class StateB extends State{

    public StateB(Subject subject)
    {
        super(subject);
    }

    @Override
    public String action1() {
        System.out.println("State B => State A");
        this.subject.setState(new StateA(this.subject));
        return this.subject.doing3();
    }

    @Override
    public String action2() {
        this.subject.setState(new StateC(this.subject));
        System.out.println("State B => State C");
        return this.subject.doing2();
    }
}