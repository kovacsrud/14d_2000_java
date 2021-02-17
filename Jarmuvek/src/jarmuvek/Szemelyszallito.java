package jarmuvek;

public class Szemelyszallito extends Gepjarmu {

	private int szallSzemelyek;
	private String alvazszam;
	private String motorszam;
	
	
	
	public Szemelyszallito(String eroforras, double tomeg, double hossz, double maxsebesseg, int szallSzemelyek,
			String alvazszam, String motorszam) {
		super(eroforras, tomeg, hossz, maxsebesseg);
		this.szallSzemelyek = szallSzemelyek;
		this.alvazszam = alvazszam;
		this.motorszam = motorszam;
	}
	public int getSzallSzemelyek() {
		return szallSzemelyek;
	}
	public void setSzallSzemelyek(int szallSzemelyek) {
		this.szallSzemelyek = szallSzemelyek;
	}
	public String getAlvazszam() {
		return alvazszam;
	}
	public void setAlvazszam(String alvazszam) {
		this.alvazszam = alvazszam;
	}
	public String getMotorszam() {
		return motorszam;
	}
	public void setMotorszam(String motorszam) {
		this.motorszam = motorszam;
	}
	
	
	
	
}
