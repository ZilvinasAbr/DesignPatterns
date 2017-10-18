package strategy;

public class Main {
    public static void main(String[] args) {
        Unit unit = new Unit();
        IAlgorithm algorithm = new SwimAlgorithm();
        unit.moveAlgorithm = algorithm;
        unit.moveAlgorithm.customMove();
    }
}
