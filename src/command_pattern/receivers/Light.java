package command_pattern.receivers;

import command_pattern.commands.LightOnCommand;

public class Light {
    private String name;

    public Light(String name){
        this.name = name;
    }
    public void on(){
        System.out.println( name + ": I am turned on.");
    }

    public void off()
    {
        System.out.println( name + ": I am turned off.");
    }
}