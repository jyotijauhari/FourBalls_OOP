import processing.core.PApplet;

public class FourBalls extends PApplet {
    public static final int WIDTH = 648;
    public static final int HEIGHT = 488;

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
    }
    private void paintBGWhite() {
        background(255);
    }

    @Override
    public void draw() {
    }
}
