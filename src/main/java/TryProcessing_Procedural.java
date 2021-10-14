//Procedural way of solving 4 balls challenge
import processing.core.PApplet;

public class TryProcessing_Procedural extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    int x;
    public static void main(String[] args) {
        PApplet.main( "TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //draw();
    }
    @Override
    public void draw() {
        /* ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);
        ellipse(2 *x,2*HEIGHT/5,10,10);
        ellipse(3*x,3*HEIGHT/5,10,10);
        ellipse(4*x,4*HEIGHT/5,10,10);*/
        drawCircle(x,1);
        drawCircle(2*x,2);
        drawCircle(3*x,3);
        drawCircle(4*x,4);
        x++;
    }
    public void drawCircle(int x_axis,int y_axis) {
        ellipse(x_axis,y_axis * HEIGHT/5, DIAMETER,DIAMETER);
    }
}
