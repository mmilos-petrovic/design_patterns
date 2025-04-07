package command_pattern.commands;


import command_pattern.receivers.Light;

public class LightOnCommand implements Command{
    private final Light light;
    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    public void execute(){
        this.light.on();
    }

    @Override
    public void unExecute() {
        this.light.off();
    }
}
