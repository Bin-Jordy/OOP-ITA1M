public class Student {
    private String naam;
    private int[] cijfers;

    public Student(String naam) {
        this.naam = naam;
        cijfers = new int[8];
    }

    public int[] getCijfers() {
        return cijfers;
    }

    public void setCijfer(int vaknummer, int cijfer) {
        cijfers[vaknummer] = cijfer;
    }
}
