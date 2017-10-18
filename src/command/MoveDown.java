package command;

public class MoveDown implements ICommand {
    @Override
    public void execute() {
        System.out.println("Moves down");
    }
}
