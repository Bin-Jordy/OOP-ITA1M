package Voorbereiding;

public class Klok {
    public Teller minutenTeller;
    public Teller urenTeller;
    public float x, y, hoogte, breedte;


    Klok(float x, float y, float breedte, Main app) {
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = (float) (breedte * 0.4);
        urenTeller = new Teller(24, x, y, breedte / 2, hoogte, app);
        minutenTeller = new Teller(60, x + breedte / 2, y, breedte / 2, hoogte, app);
    }

    void setTijd(int uren, int minuten) {
        minutenTeller.waarde = minuten;
        urenTeller.waarde = uren;
    }

    void tik() {
        minutenTeller.tik();
        if (minutenTeller.waarde == 0) {
            urenTeller.tik();
        }
    }

    void tekenKlok() {
        urenTeller.tekenTeller();
        minutenTeller.tekenTeller();
    }
}
