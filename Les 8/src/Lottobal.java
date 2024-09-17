public class Lottobal {
    private final int balNummer;

    public Lottobal(int nummer) {
        this.balNummer = nummer;
    }

    public boolean isNummerGroterDan(Lottobal andereBal) {
        return this.balNummer > andereBal.getBalNummer();
    }

    public int getBalNummer() {
        return balNummer;
    }

    public String toString() {
        return "" + this.balNummer;
    }
}
