package Voorbereiding;

import static processing.core.PApplet.str;
import static processing.core.PConstants.CENTER;

public class Teller {
    private int maximum, waarde;
    private float x, y, hoogte, breedte;

    Teller(int maximum, float x, float y, float breedte, float hoogte) {
        this.maximum = maximum;
        waarde = 0;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    void tik() {
        waarde = (waarde + 1) % maximum;
    }

    void tekenTeller(Main app) {
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

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getWaarde() {
        return waarde;
    }

    public void setWaarde(int waarde) {
        this.waarde = waarde;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getHoogte() {
        return hoogte;
    }

    public void setHoogte(float hoogte) {
        this.hoogte = hoogte;
    }

    public float getBreedte() {
        return breedte;
    }

    public void setBreedte(float breedte) {
        this.breedte = breedte;
    }


    String geefTijdNotatie() {
        if (waarde < 10) {
            return "0" + str(waarde);
        } else {
            return str(waarde);
        }
    }
}
