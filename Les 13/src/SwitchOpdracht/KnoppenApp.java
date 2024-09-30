package SwitchOpdracht;

import java.util.ArrayList;
import processing.core.PApplet;

public class KnoppenApp extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] { "SwitchOpdracht.KnoppenApp" });
	}
	
	private ArrayList<Knop> knoppen = new ArrayList<>();

	private IDoelwit licht;
	private IDoelwit tekstraam;
	
	public void settings(){
		size(400, 400);	
	}
	
	public void setup() {

		licht = new Licht(this);
		tekstraam = new Tekstraam(this,"Uit",250,250);
		
		Switch eenSwitch=new Switch(this,100,20,50,50);
		
		eenSwitch.voegDoelwitToe(licht);
		eenSwitch.voegDoelwitToe(tekstraam);
		
		Switch nogEenSwitch=new Switch(this,200,20,50,50);

		nogEenSwitch.voegDoelwitToe(licht);
		nogEenSwitch.voegDoelwitToe(tekstraam);

		Switch derdeSwitch=new Switch(this,300,20,50,50);

		derdeSwitch.voegDoelwitToe(licht);
		derdeSwitch.voegDoelwitToe(tekstraam);

		//

		eenSwitch.voegDoelwitToe(nogEenSwitch);
		eenSwitch.voegDoelwitToe(derdeSwitch);

		nogEenSwitch.voegDoelwitToe(eenSwitch);
		nogEenSwitch.voegDoelwitToe(derdeSwitch);

		derdeSwitch.voegDoelwitToe(eenSwitch);
		derdeSwitch.voegDoelwitToe(nogEenSwitch);

		knoppen.add(eenSwitch);
		knoppen.add(nogEenSwitch);
		knoppen.add(derdeSwitch);
	}
	
	public void draw() {
		licht.teken();
		tekstraam.teken();
		for (Knop k : knoppen) {
			k.tekenKnop();
		}
	}
	
	public void mousePressed() {
		for (Knop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}
