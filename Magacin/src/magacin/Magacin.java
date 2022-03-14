package magacin;

import java.util.ArrayList;
import java.util.List;

import artikli.Artikal;

public class Magacin implements InterfejsMagacin {
	
	List<Artikal> artikli = new ArrayList<>();
	
	@Override
	public void dodajArtikal(Artikal artikal) {

		if (artikal!=null) {
			artikli.add(artikal);
		}

	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal!=null) {
			artikli.remove(artikal);
		}

	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for (Artikal a : artikli) {
			if(a.getSifra()==sifra)
				return a;
		}
		return null;
	}

}
