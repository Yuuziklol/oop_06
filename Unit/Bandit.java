package Unit;

public class Bandit extends Warrior {
    int disguise;

    public Bandit(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int disguise, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.disguise = disguise;
    }

    public Bandit(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 6, 7,
                6, coords.posX, coords.posY);
        this.disguise = 50;
    }

    public void steal(int disguise, Shooter Shooter) {
    }
    
    @Override
    public String getInfo() {
        return "Разбойник";
    }
}
