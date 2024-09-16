package Voorbereiding;

import processing.core.PApplet;

public class Main extends PApplet {
    Klok klok;

    public static void main(String[] args) {
        PApplet.main("Voorbereiding.Main");
    }

    public void settings() {
        size(400, 300);
    }

    public void setup() {
        background(255);
        frameRate(1);
        klok = new Klok(150, 100, 100, this);
        klok.setTijd(22, 58);
        klok.tik();
        klok.tik();
        klok.tekenKlok();
    }

    public void draw() {
        klok.tik();
        klok.tekenKlok();
    }
}

