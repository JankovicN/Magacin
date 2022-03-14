package magacin;

import java.util.ArrayList;
import java.util.List;

import artikli.Artikal;

public class Magacin implements InterfejsMagacin {
	
	List<Artikal> artikli = new ArrayList<>();

	@Override
	public void dodajArtikal(Artikal artikal) {

		if(artikal!=null)
			artikli.add(0, artikal);

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}

}
