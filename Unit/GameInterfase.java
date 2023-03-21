package Unit;

import java.util.ArrayList;

public interface GameInterfase {
    String getInfo();
    void step(ArrayList<Human> team1, ArrayList<Human> team2);

}
