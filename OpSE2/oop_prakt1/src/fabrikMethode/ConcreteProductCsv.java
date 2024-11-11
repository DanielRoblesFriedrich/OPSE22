package fabrikMethode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteProductCsv extends Product{
	BufferedReader ein;
	@Override
	public String[] leseAusDatei() throws IOException {
		ein = new BufferedReader(new FileReader("Cafe.txt"));
		
		String zeile[] = ein.readLine().split(";");
		
		
		return zeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
