package factoryMethod.example2;

public class EnemyFactory implements IFactory {
    @Override
    public Enemy createEnemy(String enemyType) {
        Enemy enemy = null;
        switch (enemyType) {
            case "Plane":
                enemy = new Plane();
                break;
            case "Ship":
            default:
                enemy = new Ship();
                break;
        }

        return enemy;
    }
}
