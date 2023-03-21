package Unit;

import java.util.ArrayList;

public class Farmer extends Human {
    protected int cartridges;
    protected Farmer(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
                  int speed, int cartridges, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.cartridges = cartridges;
    }
    public Farmer(String name, Vector2D coords) {
        super(name, 50.f, 50, 1, 1, 1, 1,
                3, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        if (state.equals("Die")) {hp = 0; return;}
        if (!state.equals("Die")) state = "Stand";
        System.out.println("Фермер " + name + " освободился");
    }

    @Override
    public String getInfo() {
        return "Фермер";
    }
}