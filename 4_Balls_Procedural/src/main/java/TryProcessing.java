import processing.core.PApplet;

public class TryProcessing extends  PApplet{


    public static final int HEIGHT = 480;
    public static final int WIDTH = 620;
    public static final int BALL_HEIGHT = 15;
    public static final int BALL_WIDTH = 15;

    public int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        ellipse(x1, HEIGHT / 5, BALL_HEIGHT, BALL_WIDTH);
        ellipse(x2, 2 * HEIGHT / 5, BALL_HEIGHT, BALL_HEIGHT);
        ellipse(x3, 3 * HEIGHT / 5, BALL_HEIGHT, BALL_WIDTH);
        ellipse(x4, 4 * HEIGHT / 5, BALL_HEIGHT, BALL_WIDTH);
        x1 += 1;
        x2 += 2;
        x3 += 3;
        x4 += 4;
    }
}
