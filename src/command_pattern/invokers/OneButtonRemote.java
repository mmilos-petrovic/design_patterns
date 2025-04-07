package command_pattern.invokers;

import command_pattern.commands.Command;

public class OneButtonRemote {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonPressed()
    {
        this.command.execute();
    }
}
