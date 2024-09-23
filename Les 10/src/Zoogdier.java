public class Zoogdier extends Dier {

    protected int draagTijd;

    protected String engelseVertaling = "Mammal";

    public Zoogdier(String soort, int draagTijd) {
        super(soort);
        this.draagTijd = draagTijd;
    }
}
