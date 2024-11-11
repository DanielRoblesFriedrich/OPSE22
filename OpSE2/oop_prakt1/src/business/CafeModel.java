package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import fabrikMethode.ConcreteCreator;
import fabrikMethode.Creator;
import fabrikMethode.Product;

public class CafeModel {

	public Cafe cafe;
	
	
	public void leseCafeAusCsvDatei() throws IOException {
		Creator creator = new ConcreteCreator();
		
		Product reader = creator.factoryMethod();
		
		String[] zeile = reader.leseAusDatei();
		
		this.cafe = new Cafe(zeile[0], 
				zeile[1],
				zeile[2], zeile[3], zeile[4].split("_"));
		reader.schliesseDatei();
		
	}
	
	public void leseCafeAusTxtDatei() throws IOException {
		Creator creator = new ConcreteCreator();
		
		Product reader = creator.factoryMethod();
		
		String[] zeile = reader.leseAusDatei();
		
		this.cafe = new Cafe(zeile[0], 
				zeile[1],
				zeile[2], zeile[3], zeile[4].split("_"));
		reader.schliesseDatei();
		
	}
	
	
	public void schreibeCafeInCsvDatei() throws IOException{
		
		BufferedWriter aus = new BufferedWriter(new FileWriter("Cafe.csv", true));
		aus.write(this.getCafe().gibCafeZuruck(';'));
		aus.close();
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}
}
