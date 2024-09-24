import processing.core.PApplet;

public abstract class Figuur {
    protected float x, y, vx, vy, ax, ay;
    protected int kleur;
    protected boolean isZichtbaar = true;

    public Figuur(float x, float y) {
        this.x = x;
        this.y = y;
        zetStil();
        this.kleur = 0xFFFFFFFF;
    }

    public void doeStap() {
        if (!this.staatStil()) {
            this.pasVersnellingToe();
            this.pasSnelheidToe();
        }
    }

    public boolean staatStil() {
        return (vx == 0 && vy == 0 && ax == 0 && ay == 0);
    }

    public void zetStil() {
        vx = vy = ax = ay = 0;
    }

    public void setSnelheid(float vx, float vy) {
        this.vx = vx;
        this.vy = vy;
    }

    public void setVersnelling(float ax, float ay) {
        this.ax = ax;
        this.ay = ay;
    }

    public void setKleur(int kleur) {
        this.kleur = kleur;
    }

    private void pasVersnellingToe() {
        vx += ax;
        vy += ay;
    }

    private void pasSnelheidToe() {
        x += vx;
        y += vy;
    }

    public void maakZichtbaar() {
        this.isZichtbaar = true;
    }

    public void maakOnzichtbaar() {
        this.isZichtbaar = false;
    }

    abstract void teken(PApplet p);

    protected void tekenFiguur(PApplet p) {
        p.noStroke();
        if (this.isZichtbaar) {
            p.fill(kleur);
        } else {
            p.noFill();
        }
    }
}
