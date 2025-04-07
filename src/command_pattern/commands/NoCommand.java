package command_pattern.commands;

public class NoCommand implements Command{

    public NoCommand() {
    }
    public void execute(){
        System.out.println("I am NoCommand. I have no receiver.");
    }

    @Override
    public void unExecute() {
        System.out.println("I am NoCommand. I cannot do unexecution.");
    }
}
