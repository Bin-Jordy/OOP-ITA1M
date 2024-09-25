package Voorbereiding.Gereedschap;

import Voorbereiding.Figuur.Rechthoek;
import Voorbereiding.TekenApp;

public class RechthoekGereedschap implements IGereedschap {
    public String shortcurtToets = "r";

    public String getShortcutToets() {
        return shortcurtToets;
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        Rechthoek r = new Rechthoek(app.getMuisX(), app.getMuisY(), 50, 50);
        app.getFigurenLijst().add(r);
    }
}
