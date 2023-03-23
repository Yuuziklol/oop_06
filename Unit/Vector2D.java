package Unit;

public class Vector2D {
    protected int posX;
    protected int posY;

    public Vector2D(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    protected double getDistance(Vector2D oponent){
        return Math.sqrt(Math.pow(posX - oponent.posX,2) + Math.pow(posY - oponent.posY,2));
    }
    protected boolean onTheLeft(Vector2D oponent){
        return (posX < oponent.posX)? false: true;
    }

    protected boolean onTheTop(Vector2D oponent){
        return (posY > oponent.posY)? false: true;
    }

}
