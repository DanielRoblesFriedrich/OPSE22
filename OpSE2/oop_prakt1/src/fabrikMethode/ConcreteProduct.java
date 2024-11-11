package fabrikMethode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProduct extends Product {

	private BufferedReader ein;
	
	@Override
	public String[] leseAusDatei() throws IOException {
		// TODO Auto-generated method stub
		ein = new BufferedReader(new FileReader("Cafe.csv"));
		
		String zeile[] = ein.readLine().split(";");
		
		
		return zeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
