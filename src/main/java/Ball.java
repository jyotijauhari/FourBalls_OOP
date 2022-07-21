import processing.core.PApplet;

public class Ball {
    int leftDistance;
    int speed;
    int topDistance;
    int diameter;
    PApplet draw;


    Ball(int speed, int topDistance, int diameter, FourBalls draw){
        this.speed = speed;
        this.topDistance = topDistance;
        this.diameter = diameter;
        this.draw = draw;
    }

    public void drawBall(){
        draw.ellipse(this.leftDistance, this.topDistance, this.diameter, this.diameter);
        this.leftDistance += this.speed;
    }

    private void incrementSpeed(int speed) {
        this.speed += this.speed;
    }
}
