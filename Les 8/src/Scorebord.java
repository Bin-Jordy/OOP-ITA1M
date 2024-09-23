import java.util.ArrayList;

public class Scorebord {
    private ArrayList<Lottobal> getrokkenBallen;
    private Lottobal bonusBal;

    public Scorebord() {
        getrokkenBallen = new ArrayList<Lottobal>();
    }

    public void maakLeeg() {
        getrokkenBallen.clear();
    }

    public void plaatsBal(Lottobal bal) {
        getrokkenBallen.add(bal);
    }

    public void plaatsBonusBal(Lottobal bal) {
        this.bonusBal = bal;
    }

    public void sorteerBallen() {
        getrokkenBallen.sort((bal1, bal2) -> bal1.isNummerGroterDan(bal2) ? 1 : -1);
    }

    public void printScorebord() throws InterruptedException {
        System.out.print("Getrokken ballen:");

        for (Lottobal bal : getrokkenBallen) {
            Thread.sleep(1000);
            System.out.append(" ").append(bal.toString());
        }

        System.out.println();
        System.out.println("Bonusbal: " + bonusBal);
    }
}
