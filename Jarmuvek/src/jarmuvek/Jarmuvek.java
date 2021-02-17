package jarmuvek;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Jarmuvek {

	public static void main(String[] args) {
		
		List<Munkagep> munkagepek=new ArrayList<Munkagep>();
		List<Szemelyszallito> szemelyszallitok=new ArrayList<Szemelyszallito>();
		
		Munkagep gep1=new Munkagep("diesel", 3500, 10, 25, "markol�", true);
		Munkagep gep2=new Munkagep("diesel", 3800, 12, 10, "bulld�zer", false);
		
		munkagepek.add(gep1);
		munkagepek.add(gep2);
		
		Szemelyszallito sz1=new Szemelyszallito("benzin", 1100, 4, 160,4, "A12345", "M12345");
		Szemelyszallito sz2=new Szemelyszallito("diesel", 1200, 5, 170,7, "A22345", "M22345");
		
		szemelyszallitok.add(sz1);
		szemelyszallitok.add(sz2);
		
			
		
		//20-n�l gyorsabb munkag�pek
		
		var gep20=munkagepek.stream().filter(x->x.getMaxsebesseg()>20).collect(Collectors.toList());
		
		for (Munkagep m : gep20) {
			System.out.println(m.getMaxsebesseg()+","+m.getAlkalmazas()+","+m.getTomeg());
		}
		
			
		
		//4 szem�lyn�l t�bbet sz�ll�tani k�pes szem�lysz�ll�t�k
		
		var tobbmint4=szemelyszallitok.stream().filter(x->x.getSzallSzemelyek()>4).collect(Collectors.toList());
		
		for (Szemelyszallito sz : tobbmint4) {
			System.out.println(sz.getSzallSzemelyek()+","+sz.getEroforras()+","+sz.getMaxsebesseg());
		}

	}

}
