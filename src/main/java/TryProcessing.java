//OOPS way of solving 4 balls challenge

import processing.core.PApplet;

public class TryProcessing extends PApplet {

    private final int WIDTH ;
    private final int HEIGHT ;
    private final int DIAMETER ;
    int x=0;
    //int y=0,z=0,w=0;
    public TryProcessing(){
        this.WIDTH = 640;
        this.HEIGHT = 500;
        this.DIAMETER = 10;
    }
    public int getWidth(){
        return WIDTH;
    }
    public  int getHeight(){
        return HEIGHT;
    }
    public int getDiameter(){
        return DIAMETER;
    }
    public static void main(String[] args) {
        PApplet.main( "TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(getWidth(), getHeight());
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle(x,1);
        drawCircle(2*x,2);
        drawCircle(3*x,3);
        drawCircle(4*x,4);
        x++;
    }

    public void drawCircle(int x_axis,int y_axis) {
        ellipse(x_axis,y_axis * getHeight()/5, getDiameter(),getDiameter());
    }

    /*public void drawCircle2() {
        ellipse(2*y,2*HEIGHT/5,DIAMETER,DIAMETER);
        y++;
    }

    public void drawCircle3() {
        ellipse(3*z,3* HEIGHT/5,DIAMETER,DIAMETER);
        z++;
    }

    public void drawCircle4() {
        ellipse(4*w,4* HEIGHT/5,DIAMETER,DIAMETER);
        w++;
    }*/
}
