package Unit;
public class Spearman extends Warrior {
    public Spearman(String name, Vector2D coords) {
        super(name, 70.f, 70, 10, 2, 4, 10,
                6, coords.posX, coords.posY);
    }

    @Override
    public String getInfo() {
        return "Копейщик";
    }
}
