package Drawings;

import java.awt.*;

public class Rect implements Shapee {
    private int w;
    private Point pos;
    private Color col;
    private int h;

    public Rect(int w, int h,Point pos, Color col){
        this.pos = pos;
        this.col = col;
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics g){
        g.setColor(col);
        g.fillRect(pos.x,pos.y,w,h);
    }
}
