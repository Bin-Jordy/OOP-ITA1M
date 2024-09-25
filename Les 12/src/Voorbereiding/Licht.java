package Voorbereiding;

import processing.core.PApplet;

public class Licht {
    private PApplet app;
    private int kleur;
    private LichtSwitch lichtSwitch;

    public Licht(PApplet app) {
        this.app = app;
        kleur = 0;
    }

    void schakelLicht() {
        if (kleur == 0) {
            kleur = 0xFFA4C739;
            lichtSwitch.setIsAan(true);
        }
        else {
            kleur = 0;
            lichtSwitch.setIsAan(false);
        }
    }

    public void setLichtSwitch(LichtSwitch lichtSwitch) {
        this.lichtSwitch = lichtSwitch;
    }

    public void tekenLicht() {
        app.background(kleur);
    }
}
