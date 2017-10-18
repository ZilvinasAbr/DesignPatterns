package factoryMethod.example2;

public abstract class Enemy {
    public String name;
    public int damage;
    public int distance;

    public abstract void move();
    public abstract void shoot();
}
