import java.util.ArrayList;
import java.util.Random;

public class Glazenbol {
    ArrayList<Lottobal> ballen;

    public Glazenbol() {
        ballen = new ArrayList<Lottobal>();
    }

    public void verZamelAlleBallen() {
        for (int i = 1; i <= 45; i++) {
            ballen.add(new Lottobal(i));
        }
    }

    public Lottobal schepBal() {
        int randomBal = new Random().nextInt(ballen.size());
        Lottobal bal = ballen.get(randomBal);
        ballen.remove(randomBal);
        return bal;
    }
}
