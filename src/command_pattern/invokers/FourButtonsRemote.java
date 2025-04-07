package command_pattern.invokers;

import command_pattern.commands.Command;
import command_pattern.commands.NoCommand;
import java.util.ArrayList;
import java.util.List;


public class FourButtonsRemote {
    private List<Command> onCommands;
    private List<Command> offCommands;
    private Command lastCommand;


    public FourButtonsRemote() {
        this.lastCommand = new NoCommand();
        onCommands = new ArrayList<Command>();
        offCommands = new ArrayList<Command>();
        for (int i = 0; i < 4; i++) {
            onCommands.add(new NoCommand());
            offCommands.add(new NoCommand());
        }
    }

    public void setCommand(Command onCommand, Command offCommand, int slot) {
        this.onCommands.add(slot, onCommand);
        this.offCommands.add(slot, offCommand);
    }

    public void buttonOnPressed(int slot) {
        this.onCommands.get(slot).execute();
        this.lastCommand = onCommands.get(slot);
    }

    public void buttonOffPressed(int slot) {
        this.offCommands.get(slot).execute();
        this.lastCommand = offCommands.get(slot);
    }

    public void buttonUndoPressed(){
        this.lastCommand.unExecute();
    }
}
