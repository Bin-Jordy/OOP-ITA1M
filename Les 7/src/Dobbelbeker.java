public class Dobbelbeker {
    Dobbelsteen[] dobbelstenen;

    public Dobbelbeker() {
        this.dobbelstenen = new Dobbelsteen[]{
                new Dobbelsteen(),
                new Dobbelsteen(),
                new Dobbelsteen(),
        };
    }

    public int[] dobbel() {
        int[] getallen = new int[3];

        for (int i = 0; i < 3; i++) {
            getallen[i] = dobbelstenen[i].gooi();
        }

        return getallen;
    }

    public String toString() {
        return "worp: " + dobbelstenen[0] + " " + dobbelstenen[1] + " " + dobbelstenen[2];
    }
}
