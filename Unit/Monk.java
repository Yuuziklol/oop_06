package Unit;

import java.util.ArrayList;

public class Monk extends Mag{
    public Monk(String name, Vector2D coords) {
        super(name, 50.f, 50, 10, -7, -7, 3,
                7, 5 ,5, coords.posX, coords.posY);

    }

    @Override
    public String getInfo() {
        return "Монах";
    }
}
