package artikli;

import java.util.Objects;

public abstract class Artikal {

	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) throws Exception{
		
		if(naziv==null || naziv.isEmpty()){
			throw new Exception("Naziv mora biti definisan!");
		}
		this.naziv = naziv;
	}
	
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) throws Exception{
		if(sifra<0){
			throw new Exception("Sifra ne sme biti manja od 0!");
		}
		this.sifra = sifra;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public void setOpis(String opis) throws Exception{
		if(opis==null || opis.isEmpty()){
			throw new Exception("Opis mora biti definisan!");
		}
		this.opis = opis;
	}
	
	public int getKolicina() {
		return kolicina;
	}
	
	public void setKolicina(int kolicina) throws Exception{
		if(kolicina<0){
			throw new Exception("Kolicina ne sme biti manja od 0!");
		}
		this.kolicina = kolicina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& sifra == other.sifra;
	}
	
	
	
}
