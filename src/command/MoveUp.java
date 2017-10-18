package command;

public class MoveUp implements ICommand {
    @Override
    public void execute() {
        System.out.println("Moves up");
    }
}
