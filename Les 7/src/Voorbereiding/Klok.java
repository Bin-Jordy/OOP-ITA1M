package Voorbereiding;

public class Klok {
    private final Teller minutenTeller, urenTeller;
    public float x, y, hoogte, breedte;

    Klok(float x, float y, float breedte) {
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = (float) (breedte * 0.4);
        urenTeller = new Teller(24, x, y, breedte / 2, hoogte);
        minutenTeller = new Teller(60, x + breedte / 2, y, breedte / 2, hoogte);
    }

    void setTijd(int uren, int minuten) {
        minutenTeller.setWaarde(minuten);
        urenTeller.setWaarde(uren);
    }

    void tik() {
        minutenTeller.tik();
        if (minutenTeller.getWaarde() == 0) {
            urenTeller.tik();
        }
    }

    void tekenKlok(Main app) {
        urenTeller.tekenTeller(app);
        minutenTeller.tekenTeller(app);
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

}
