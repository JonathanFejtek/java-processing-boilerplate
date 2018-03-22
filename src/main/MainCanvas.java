package main;

import processing.core.PApplet;
import toxi.geom.Vec2D;

public class MainCanvas extends PApplet {


    private static int width = 500;
    private static int height = 500;

    public static void main(String[] args){
        String[] processingArgs = {"MainCanvas"};
        MainCanvas mySketch = new MainCanvas();
        PApplet.runSketch(processingArgs, mySketch);
    }


    public void setup(){}

    public void settings(){
        size(width, height);
    }

    public void draw(){
        colorMode(PApplet.HSB,255,255,255);
        background(255,0,255);
        ellipse(mouseX, mouseY, 20, 20);
    }
}

