public class ChuckALuckSpel {
    private float saldo, inzet;
    private int ronde, geluksgetal;
    private Dobbelbeker dobbelbeker;

    public ChuckALuckSpel(float inzet) {
        if (inzet > 0) {
            this.saldo = inzet;

        this.ronde = 0;
        this.dobbelbeker = new Dobbelbeker();
        }
    }

    public void speelRonde(int geluksgetal, float inzet) {
        if (saldo >= inzet) {
            this.inzet = inzet;
            this.geluksgetal = geluksgetal;
            this.ronde++;

            int[] getallen = dobbelbeker.dobbel();

            int getalGelijkAanGeluksgetal = 0;
            for (int getal : getallen) {
                if (getal == geluksgetal) {
                    getalGelijkAanGeluksgetal++;
                }
            }

            switch (getalGelijkAanGeluksgetal) {
                case 0:
                    this.saldo -= inzet;
                    break;
                case 1:
                    this.saldo += inzet;
                    break;
                case 2:
                    this.saldo += 2 * inzet;
                    break;
                case 3:
                    this.saldo += 10 * inzet;
                    break;
            }
        } else {
            System.out.println("Niet genoeg saldo");
        }
    }

    public String toString() {
        return "Ronde: " + this.ronde + "\n" +
                "geluksgetal: " + this.geluksgetal + "\n" +
                 dobbelbeker + " \n" +
                "saldo: " + this.saldo + "\n" +
                "---------------";
    }
}
