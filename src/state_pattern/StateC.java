package state_pattern;

public class StateC extends State{

    public StateC(Subject subject)
    {
        super(subject);
    }

    @Override
    public String action1() {
        System.out.println("State C => State C");
        return this.subject.doing1();
    }

    @Override
    public String action2() {
        this.subject.setState(new StateB(this.subject));
        System.out.println("State C => State B");
        return this.subject.doing2();
    }
}