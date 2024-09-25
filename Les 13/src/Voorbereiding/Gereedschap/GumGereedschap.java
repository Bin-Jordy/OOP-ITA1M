package Voorbereiding.Gereedschap;

import Voorbereiding.Figuur.Figuur;
import Voorbereiding.TekenApp;

public class GumGereedschap implements IGereedschap {
    public String shortcurtToets = "g";

    public String getShortcutToets() {
        return shortcurtToets;
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        for (int i = app.getFigurenLijst().size() - 1; i >= 0; i--) {
            Figuur fig = app.getFigurenLijst().get(i);
            if (fig.isMuisBinnen(app.getMuisX(), app.getMuisY(), app)) {
                app.getFigurenLijst().remove(i);
            }
        }
    }
}
