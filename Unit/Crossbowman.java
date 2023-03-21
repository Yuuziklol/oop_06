package Unit;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, Vector2D coords) {
        super(name, 60.f, 60, 7, 3, 7, 4,
                9, 20, 10, coords.posX, coords.posY);
    }

    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        super.step(t1, t2);
    }


    @Override
    public String getInfo() {
        return "Арбалетчик";
    }
}
