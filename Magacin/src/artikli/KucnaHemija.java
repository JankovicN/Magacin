package artikli;

import java.util.Date;
import java.util.Objects;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) throws Exception{
		if(rokTrajanja.before(new Date())){
			throw new Exception("Rok tranja mora biti nakon danasnjeg datuma!");
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rokTrajanja);
		return Objects.hash(super.hashCode(), result);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return super.equals(obj) &&  Objects.equals(rokTrajanja, other.rokTrajanja);
	}
	
	
	
	
}
