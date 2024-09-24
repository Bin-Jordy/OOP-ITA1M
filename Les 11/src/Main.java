import processing.core.PApplet;

public class Main extends PApplet {
    Cirkel cirkel = new Cirkel(50, 50, 20);
    Rechthoek rechthoek = new Rechthoek(40, 80, 20, 20);

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
//        cirkel.maakOnzichtbaar();
        cirkel.setSnelheid(1, 1);
        cirkel.setVersnelling(1, 1);
        rechthoek.setSnelheid(1, 1);
        rechthoek.setVersnelling(1, 1);
    }

    public void draw() {
        cirkel.doeStap();
        rechthoek.doeStap();
        cirkel.teken(this);
        rechthoek.teken(this);
    }
}
