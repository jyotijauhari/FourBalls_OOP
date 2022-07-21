import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;
    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintBGWhite();
        b1 = new Ball(1, HEIGHT/5, 10, this);
        b2 = new Ball(2, 2*HEIGHT/5, 10, this);
        b3 = new Ball(3, 3*HEIGHT/5, 10, this);
        b4 = new Ball(4, 4*HEIGHT/5, 10, this);
    }
    private void paintBGWhite() {
        background(255);
    }

    @Override
    public void draw() {
        b1.drawBall();
        b2.drawBall();
        b3.drawBall();
        b4.drawBall();
    }
}
