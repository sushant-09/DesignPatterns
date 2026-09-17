package behavioral.command;

public class Main {

    public static void main(String[] args) {
        Light light = new Light();
        Command turnOn = new TurnOnCommand(light);
        Command turnOff = new TurnOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(turnOn);
        remoteControl.pressButton();
        remoteControl.setCommand(turnOff);
        remoteControl.pressButton();
    }
}
