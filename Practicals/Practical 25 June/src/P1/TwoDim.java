package P1;

public class TwoDim {
    private int x;
    private int y;

    public TwoDim(){
        x = 0;
        y = 0;
    }

    public TwoDim(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return ("("+x+", "+y+")");
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
