package factoryMethod.example2;

public class Main {
    public static void main(String[] args) {
        IFactory factory = new EnemyFactory();

        Enemy plane = factory.createEnemy("Plane");
        Enemy ship = factory.createEnemy("Ship");

        plane.move();
        ship.move();
    }
}
