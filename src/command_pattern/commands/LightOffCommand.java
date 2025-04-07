package command_pattern.commands;


import command_pattern.receivers.Light;

public class LightOffCommand implements Command{
    private final Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }

    public void execute(){
        this.light.off();
    }

    @Override
    public void unExecute() {
        this.light.on();
    }
}
