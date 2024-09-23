import processing.core.PApplet;

public class Rechthoek extends Figuur {
    private float breedte, hoogte;

    public Rechthoek(float x, float y, float breedte, float hoogte) {
        super(x, y);
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public void tekenRechthoek(PApplet p) {
        tekenFiguur(p);
        p.rect(x, y, breedte, hoogte);
    }
}
