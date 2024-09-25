import java.util.ArrayList;

public class Main {
    private ArrayList<Persoon> lijst;

    public Main() {
        lijst = new ArrayList<>();
    }

    public ArrayList<Student> getSLBStudenten(Docent SLBer) {
        ArrayList<Student> studenten=new ArrayList<>();
        for (Persoon p:lijst) {
            if (p instanceof Student) {
                Student s=(Student) p;

                if (s.getSLBer() == SLBer) {
                    studenten.add(s);
                }
            }
        }
        return studenten;
    }

    public static void main(String[] args) {
        Main main = new Main();

        Docent piet=new Docent("Piet", "Jansen", "jnsnp");

        Student marie=new Student("Marie", "Pieters", 31415, piet);

        Student jan=new Student("Jan", "de Vries", 92653, null); // nog geen SLB'er

        main.lijst.add(piet);

        main.lijst.add(marie);

        main.lijst.add(jan);

        // voeg zelf nog enkele docenten en studenten toe

        ArrayList<Student> studentenVanPiet=main.getSLBStudenten(piet);

        for (Student s:studentenVanPiet) {
            System.out.println(s);
        }
    }
}
