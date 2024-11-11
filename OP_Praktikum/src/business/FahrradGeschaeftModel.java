package business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import readers.*;

public class FahrradGeschaeftModel {

	private Fahrrad fahrrad;

	public Fahrrad getFahrrad() {
		return this.fahrrad;
	}

	public void setFahrrad(Fahrrad fahrrad) {
		this.fahrrad = fahrrad;
	}

	public void schreibeFahrradInCsvDatei() throws IOException {
		BufferedWriter aus = new BufferedWriter(new FileWriter("Fahrrad.csv", true));
		aus.write(this.fahrrad.gibFahrradZurueck(';'));
		aus.close();
	}

	public void leseFahrradAusDatei() throws IOException{
			Creator creator = new ConcreteCsvCreator();
			Product reader = creator.factoryMethod();
			String[] zeile = reader.leseAusDatei();
			this.fahrrad = new Fahrrad(zeile[0], Integer.parseInt(zeile[1]), zeile[2], zeile[3], zeile[4].split("_"));
		}
	
	
	public void leseFahrradAusDateiTxt() throws IOException {
		Creator creator = new ConcreteTxtCreator();
		Product reader = creator.factoryMethod();
		String[] zeile = reader.leseAusDatei();
		this.fahrrad = new Fahrrad(zeile[0], Integer.parseInt(zeile[1]), zeile[2], zeile[3], zeile[4].split("_"));
	}
}

