import processing.core.PApplet;

public class Cirkel extends Figuur {
    private float diameter;

    public Cirkel(float x, float y, float diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    void teken(PApplet p) {
        tekenFiguur(p);
        p.ellipse(x, y, diameter, diameter);
    }
}
