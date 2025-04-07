package state_pattern;

public abstract class State {

    protected Subject subject;
    public State(Subject subject)
    {
        this.subject = subject;
    }


    public abstract String action1();
    public abstract String action2();
}
