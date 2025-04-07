package command_pattern;

import command_pattern.commands.LightOnCommand;
import command_pattern.commands.LightOffCommand;
import command_pattern.invokers.FourButtonsRemote;
import command_pattern.receivers.Light;

public class ClientApp {
    static public void main(String[] args){
        Light l = new Light("Kitchen Light");
        FourButtonsRemote fourButtonRemote = new FourButtonsRemote();
        fourButtonRemote.setCommand(new LightOnCommand(l), new LightOffCommand(l), 0);
        fourButtonRemote.buttonOnPressed(0);
        fourButtonRemote.buttonOffPressed(0);
    }
}