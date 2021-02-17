package fajlok;

public class Hianyzo {

	private String nev;
	private String osztaly;
	private int elsonap;
	private int utolsonap;
	private int mulasztottorak;
	
	
	
	public Hianyzo(String sor) {
		
		var e=sor.split(";");
		nev=e[0];
		osztaly=e[1];
		elsonap=Integer.parseInt(e[2]);
		utolsonap=Integer.parseInt(e[3]);
		mulasztottorak=Integer.parseInt(e[4]);
		
		
	}
	
	public String getNev() {
		return nev;
	}
	public String getOsztaly() {
		return osztaly;
	}
	public int getElsonap() {
		return elsonap;
	}
	public int getUtolsonap() {
		return utolsonap;
	}
	public int getMulasztottorak() {
		return mulasztottorak;
	}
	
	
	
	
}
