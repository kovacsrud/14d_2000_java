package jarmuvek;

public class Munkagep extends Gepjarmu {

	private String alkalmazas;
	private boolean iskozforgalom;
	
	
	
	public Munkagep(String eroforras, double tomeg, double hossz, double maxsebesseg, String alkalmazas,
			boolean iskozforgalom) {
		super(eroforras, tomeg, hossz, maxsebesseg);
		this.alkalmazas = alkalmazas;
		this.iskozforgalom = iskozforgalom;
	}
	
	public String getAlkalmazas() {
		return alkalmazas;
	}
	public void setAlkalmazas(String alkalmazas) {
		this.alkalmazas = alkalmazas;
	}
	public boolean isIskozforgalom() {
		return iskozforgalom;
	}
	public void setIskozforgalom(boolean iskozforgalom) {
		this.iskozforgalom = iskozforgalom;
	}
	
	
	
	
}
