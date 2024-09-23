public class Dier {
    protected String soort;

    protected String engelseVertaling = "Animal";

    public Dier(String soort) {
        this.soort = soort;
    }

    public Dier getSuper() {
        return this;
    }
}
