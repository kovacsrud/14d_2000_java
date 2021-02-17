package jarmuvek;

public class Gepjarmu {

	private String eroforras;
	private double tomeg;
	private double hossz;
	private double maxsebesseg;
	
	
	
	public Gepjarmu(String eroforras, double tomeg, double hossz, double maxsebesseg) {
		super();
		this.eroforras = eroforras;
		this.tomeg = tomeg;
		this.hossz = hossz;
		this.maxsebesseg = maxsebesseg;
	}
	
	public String getEroforras() {
		return eroforras;
	}
	public void setEroforras(String eroforras) {
		this.eroforras = eroforras;
	}
	public double getTomeg() {
		return tomeg;
	}
	public void setTomeg(double tomeg) {
		this.tomeg = tomeg;
	}
	public double getHossz() {
		return hossz;
	}
	public void setHossz(double hossz) {
		this.hossz = hossz;
	}
	public double getMaxsebesseg() {
		return maxsebesseg;
	}
	public void setMaxsebesseg(double maxsebesseg) {
		this.maxsebesseg = maxsebesseg;
	}
	
	
	
	
}
