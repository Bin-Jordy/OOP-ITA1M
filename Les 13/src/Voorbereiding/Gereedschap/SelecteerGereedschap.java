package Voorbereiding.Gereedschap;

import Voorbereiding.TekenApp;

public class SelecteerGereedschap implements IGereedschap {
    public String shortcurtToets = "s";

    public String getShortcutToets() {
        return shortcurtToets;
    }

    @Override
    public void pasGereedschapToe(TekenApp app) {
        System.out.println("s");
    }
}
