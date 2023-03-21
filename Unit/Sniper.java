package Unit;

import java.util.ArrayList;

public class Sniper extends Shooter{
    public Sniper(String name, Vector2D coords) {
        super(name, 60.f, 60, 10, 3, 5, 3,
                9, 22, 10, coords.posX, coords.posY);
    }

    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        super.step(t1, t2);
    }

    @Override
    public String getInfo() {
        return "Снайпер";
    }
}