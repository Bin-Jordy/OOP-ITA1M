package Voorbereiding.Gereedschap;

import Voorbereiding.Figuur.Cirkel;
import Voorbereiding.TekenApp;

public class CirkelGereedschap implements IGereedschap {
    private String shortcurtToets = "c";

    public String getShortcutToets() {
        return shortcurtToets;
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        Cirkel c = new Cirkel(app.getMuisX(), app.getMuisY(), 50);
        app.getFigurenLijst().add(c);
    }
}
