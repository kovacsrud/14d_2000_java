package osszesites;

import java.util.HashMap;
import java.util.Map.Entry;

public class Szotar {

	public static void main(String[] args) {
		
		//A szótár adatszerkezet kulcs-érték párok tárolására
		//alkalmas. Egy kulcs csak egyszer szerepelhet a szótárban, 
		//tehát a kulcs értéke egyedi
		//pl. osztályok hiányzásai
		
		HashMap<String, Integer> osztalyok=new HashMap<String,Integer>();
		
		//A szótáron végzett mûveletek
		//Új elem berakása a szótárba
		osztalyok.put("10a", 10);
		osztalyok.put("11b", 30);
		osztalyok.put("12d", 26);
		osztalyok.put("13z", 32);
		
		//tartalmazás vizsgálata
		
		String kulcs="10a";
		
		if (osztalyok.containsKey(kulcs)) {
			System.out.println("Szerpel a szótárban:"+kulcs);
			System.out.println("A kulcshoz tartozó érték:"+osztalyok.get(kulcs));
			
		} else {
			System.out.println("Nem szerepel a szótárban:"+kulcs);
		}
		
		//A kulcshoz tartozó érték módosítása
		kulcs="13x";
		
		if (osztalyok.containsKey(kulcs)) {
			//Módosítani kell a kulcshoz tartozó értéket
			osztalyok.put(kulcs, osztalyok.get(kulcs)+10);
		} else {
			osztalyok.put(kulcs, 1);	
		}
		
		System.out.println(osztalyok.get("11b"));
		System.out.println(osztalyok.get("13x"));
		
		//A szótár összes elemének kiíratása
		for (Entry<String,Integer> i : osztalyok.entrySet() ) {
			System.out.println(i.getKey()+":"+i.getValue());
		}

	}

}
