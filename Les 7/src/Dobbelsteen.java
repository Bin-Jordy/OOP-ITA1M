public class Dobbelsteen {

    private int getal;

    Dobbelsteen() {
        this.getal = 0;
    }

    public int gooi() {
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        this.getal = (int) (Math.random() * range) + min;
        return this.getal;
    }

    public String toString() {
        return "" + getal;
    }
}
