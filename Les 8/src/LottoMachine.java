public class LottoMachine {
    public void voerTrekkingUit() throws InterruptedException {
        Glazenbol glazenbol = new Glazenbol();
        Scorebord scorebord = new Scorebord();

        glazenbol.verZamelAlleBallen();

        for (int i = 0; i < 6; i++) {
            scorebord.plaatsBal(glazenbol.schepBal());
        }

        scorebord.plaatsBonusBal(glazenbol.schepBal());

        scorebord.sorteerBallen();
        scorebord.printScorebord();
    }
}
