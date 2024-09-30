package Voorbereiding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import Voorbereiding.Figuur.Figuur;
import Voorbereiding.Gereedschap.*;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class TekenApp extends PApplet {
    private ArrayList<Figuur> figurenLijst = new ArrayList<>();
    private ArrayList<IGereedschap> gereedschapLijst = new ArrayList<>();
    private IGereedschap huidigGereedschap;
    private int muisX, muisY;

    public static void main(String[] args) {
        PApplet.main("Voorbereiding.TekenApp");
    }

    @Override
    public void setup() {
        gereedschapLijst.addAll(List.of(
                new SelecteerGereedschap(),
                new RechthoekGereedschap(),
                new CirkelGereedschap(),
                new GumGereedschap()
        ));

        huidigGereedschap = gereedschapLijst.get(0);
    }

    public void settings() {
        size(400, 400);
    }

    public void draw() {
        background(0);
        for (Figuur figuur : figurenLijst) {
            figuur.teken(this);
        }
    }

    public void mousePressed() {
        this.muisX = mouseX;
        this.muisY = mouseY;

        huidigGereedschap.pasGereedschapToe(this);
    }

    public ArrayList<Figuur> getFigurenLijst() {
        return figurenLijst;
    }

    public ArrayList<IGereedschap> getGereedschapLijst() {
        return gereedschapLijst;
    }

    public void keyReleased() {
        for (IGereedschap gereedschap : this.gereedschapLijst) {
            if (Objects.equals(gereedschap.getShortcutToets(), str(key))) {
                huidigGereedschap = gereedschap;
            }
        }
    }
}
