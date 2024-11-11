package readers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConcreteTxtProduct extends Product{
	
	private BufferedReader br;
	
	public ConcreteTxtProduct() throws FileNotFoundException {
		this.br = new BufferedReader(new FileReader("Fahrrad.txt"));
	}
	

	@Override
	public String[] leseAusDatei() throws IOException {
		String[] ergebnisZeile = new String[5];
		String zeile = br.readLine();
		int i = 0;
		while(i < ergebnisZeile[i].length()) {
			ergebnisZeile[i] = zeile;
			zeile = br.readLine();
			i++;
		}
		return ergebnisZeile;
	}

	@Override
	public void schliesseDatei() throws IOException {
		// TODO Auto-generated method stub
		
	}

}
