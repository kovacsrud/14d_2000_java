package osszesites;

import java.util.HashMap;
import java.util.Map.Entry;

public class Szotar {

	public static void main(String[] args) {
		
		//A sz�t�r adatszerkezet kulcs-�rt�k p�rok t�rol�s�ra
		//alkalmas. Egy kulcs csak egyszer szerepelhet a sz�t�rban, 
		//teh�t a kulcs �rt�ke egyedi
		//pl. oszt�lyok hi�nyz�sai
		
		HashMap<String, Integer> osztalyok=new HashMap<String,Integer>();
		
		//A sz�t�ron v�gzett m�veletek
		//�j elem berak�sa a sz�t�rba
		osztalyok.put("10a", 10);
		osztalyok.put("11b", 30);
		osztalyok.put("12d", 26);
		osztalyok.put("13z", 32);
		
		//tartalmaz�s vizsg�lata
		
		String kulcs="10a";
		
		if (osztalyok.containsKey(kulcs)) {
			System.out.println("Szerpel a sz�t�rban:"+kulcs);
			System.out.println("A kulcshoz tartoz� �rt�k:"+osztalyok.get(kulcs));
			
		} else {
			System.out.println("Nem szerepel a sz�t�rban:"+kulcs);
		}
		
		//A kulcshoz tartoz� �rt�k m�dos�t�sa
		kulcs="13x";
		
		if (osztalyok.containsKey(kulcs)) {
			//M�dos�tani kell a kulcshoz tartoz� �rt�ket
			osztalyok.put(kulcs, osztalyok.get(kulcs)+10);
		} else {
			osztalyok.put(kulcs, 1);	
		}
		
		System.out.println(osztalyok.get("11b"));
		System.out.println(osztalyok.get("13x"));
		
		//A sz�t�r �sszes elem�nek ki�rat�sa
		for (Entry<String,Integer> i : osztalyok.entrySet() ) {
			System.out.println(i.getKey()+":"+i.getValue());
		}

	}

}
