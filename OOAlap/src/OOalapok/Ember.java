package OOalapok;

public class Ember {

	String nev;
	String lakhely;
	int szulev;
	
	
	
	public Ember(String nev, String lakhely, int szulev) {
		super();
		this.nev = nev;
		this.lakhely = lakhely;
		this.szulev = szulev;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getLakhely() {
		return lakhely;
	}
	public void setLakhely(String lakhely) {
		this.lakhely = lakhely;
	}
	public int getSzulev() {
		return szulev;
	}
	public void setSzulev(int szulev) {
		this.szulev = szulev;
	}
	
	
	
}
