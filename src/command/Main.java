package command;

public class Main {
    public static void main(String[] args) {
        CommandConsole control = new CommandConsole();

        ICommand moveUp = new MoveUp();
        ICommand moveDown = new MoveDown();

        control.setCommand(moveUp);
        control.executeCommand();

        control.setCommand(moveDown);
        control.executeCommand();
    }
}
