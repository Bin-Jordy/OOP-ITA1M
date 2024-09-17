package Voorbereiding;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lijst = new ArrayList<String>();

        for (int i = 0; i < 4; i++) {
            lijst.add("element: " + i);
        }

        for (String element : lijst) {
            System.out.println(element);
            //remove werkt niet, want dan wordt de lijst aangepast en dat mag niet in een for-each loop
            //in een normale for loop kan dat wel omdat je dan zelf de index bepaalt
            //lijst.remove(element);
        }
    }
}
