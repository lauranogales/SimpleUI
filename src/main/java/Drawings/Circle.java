package Drawings;

import java.awt.*; //change made

public class Circle implements Shapee {
    private  int rad;
    private Point pos;
    private Color col;
    public Circle(Point pos, Color col, int radius){
        this.pos = pos;
        this.col = col;
        rad=radius;

    }
    public void draw(Graphics g){
        g.setColor(col);
        g.fillOval(pos.x,pos.y,rad,rad);
    }
}


