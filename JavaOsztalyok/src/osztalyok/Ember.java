package osztalyok;

public class Ember {

	private String nev;
	private int szuletesiev;
	private int magassag;
	private String szuletesihely;
	
	public Ember(String nev, int szuletesiev, int magassag, String szuletesihely) {
		
		this.nev = nev;
		this.szuletesiev = szuletesiev;
		this.magassag = magassag;
		this.szuletesihely = szuletesihely;
	}
	
	public Ember() {

	}

	
	public void SetNev(String benev)
	{
		nev=benev;
	}
	
	public int getSzuletesiev() {
		return szuletesiev;
	}

	public void setSzuletesiev(int szuletesiev) {
		this.szuletesiev = szuletesiev;
	}

	public int getMagassag() {
		return magassag;
	}

	public void setMagassag(int magassag) {
		this.magassag = magassag;
	}

	public String getSzuletesihely() {
		return szuletesihely;
	}

	public void setSzuletesihely(String szuletesihely) {
		this.szuletesihely = szuletesihely;
	}

	public String GetNev()
	{
		return nev;
	}
	
}
