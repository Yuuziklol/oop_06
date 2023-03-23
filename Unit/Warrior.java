package Unit;

import java.util.ArrayList;

import Unit.Human;

public abstract class Warrior extends Human {

    public Warrior(String name, float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed, int posX, int posY) {
        super(name, hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
    }
    @Override
    public void step(ArrayList<Human> t1, ArrayList<Human> t2) {
        if (state.equals("Die")) {hp = 0; return;}
        int target = findNearest(t2);
        if (target < 2) {
            float damdge = (t2.get(target).defense - attack > 0) ?
                    damageMin : (t2.get(target).defense - attack < 0) ?
                    damageMax : ( (damageMax+damageMin) / 2);
            t2.get(target).getDamage(damdge);
            return;
        }
        moveToOpponent(target, t2);
    }

    void moveToOpponent(int target, ArrayList<Human> t2){
        if (coords.onTheTop(t2.get(target).coords) & (coords.posY != t2.get(target).coords.posY)){
            coords.posY++;
            return;
        } else if (!coords.onTheTop(t2.get(target).coords) & (coords.posY != t2.get(target).coords.posY)) {
            coords.posY--;
            return;
        }
        if (coords.onTheLeft(t2.get(target).coords)) {
            coords.posX++;
            return;
        } else if (!coords.onTheLeft(t2.get(target).coords)){
            coords.posX--;
            return;
        }
    }

    @Override
    public String toString() {
        return "\uD83D\uDC82" +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) + " " +
                state;
    }
}
