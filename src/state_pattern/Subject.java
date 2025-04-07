package state_pattern;

public class Subject {
    private State currnetState;
    public Subject(){
        currnetState = new StateA(this);
    }

    public void setState(State s) {
        this.currnetState = s;
    }

    // SUBJECT IS DOING
    public String doing1() {
        return "Subject doing 1";
    }

    public String doing2() {
        return "Subject doing 2";
    }

    public String doing3() {
        return "Subject doing 3";
    }

    // ACTIONS => STATE CHANGERS
    public String action1() {
        return this.currnetState.action1();
    }

    public String action2() {
        return this.currnetState.action2();
    }
}
