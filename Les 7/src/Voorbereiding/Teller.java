package Voorbereiding;

import static processing.core.PApplet.str;
import static processing.core.PConstants.CENTER;

public class Teller {
    public int maximum, waarde;
    public float x, y, hoogte, breedte;
    private final Main app;

    Teller(int maximum, float x, float y, float breedte, float hoogte, Main app) {
        this.maximum = maximum;
        waarde = 0;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
        this.app = app;
    }

    void tik() {
        waarde = (waarde + 1) % maximum;
    }

    void tekenTeller() {
        app.rectMode(CENTER);
        app.noStroke();
        app.fill(0);
        app.rect(x, y, breedte, hoogte);

        app.fill(255, 0, 0);
        app.textSize(hoogte);
        app.textAlign(CENTER);
        float verschuiving = (app.textAscent() - app.textDescent()) / 2;
        app.text(geefTijdNotatie(), x, y + verschuiving);
    }

    String geefTijdNotatie() {
        if (waarde < 10) {
            return "0" + str(waarde);
        } else {
            return str(waarde);
        }
    }
}
