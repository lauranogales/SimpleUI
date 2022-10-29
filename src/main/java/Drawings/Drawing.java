package Drawings;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;

public class Drawing extends Canvas {
    Point p = new Point();
    Color c = new Color(0x82266);
    private Circle circ ;
    Random rand = new Random();
    private Rect rect;

    private Frame f;
    private ArrayList<Shapee> listofshapes = new ArrayList<>();
    public Drawing(){
        setupFrame();
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
        setupCanvas();

        for(int i=0; i<4; i= i+1){
            listofshapes.add(new Circle(new Point(rand.nextInt(400),rand.nextInt(400)),c,rand.nextInt(200)));
        }
        for(int i=0; i<4; i= i+1){
            listofshapes.add(new Rect(rand.nextInt(400),rand.nextInt(400),new Point(rand.nextInt(400),rand.nextInt(400)),new Color(0x8226)));
        }
        for(int i=0; i<4; i= i+1){
            listofshapes.add(new Square(50,50,new Point(rand.nextInt(400),rand.nextInt(400)),new Color(0x822669)));
        }

    }

    private void setupFrame() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }

    private void setupCanvas() {
        setBackground(Color.WHITE);
        setSize(1000,1000);
    }

    public void paint(Graphics g){
        for(Shapee s:listofshapes){
            s.draw(g);
        }
    }


    };




