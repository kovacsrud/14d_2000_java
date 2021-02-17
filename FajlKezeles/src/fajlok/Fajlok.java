package fajlok;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fajlok {

	public static void main(String[] args)  {
		
		File fajl=new File("g:\\temp\\szeptember.csv");
		List<Hianyzo> hianyzok=new ArrayList<Hianyzo>();
		
		try {
			Scanner scan=new Scanner(fajl);
			scan.nextLine();
			while (scan.hasNextLine()) {
				
				Hianyzo hianyzo=new Hianyzo(scan.nextLine());
				hianyzok.add(hianyzo);
				
			}
			
			System.out.println("Kész!");
			
		} catch (FileNotFoundException e) {
			System.out.println("Nem található a fájl!");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Hiba!");
			e.printStackTrace();
		}
		
		
		List<String> sorok=Collections.emptyList();
		
		System.out.println("--------------------------------");
		try {
			sorok=Files.readAllLines(Paths.get("g:\\temp\\szeptember_utf8.txt"),StandardCharsets.UTF_8);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String s : sorok) {
			//System.out.println(s);
		}
		
		File kiir=new File("g:\\temp\\szeptember_copy.txt");
		
		try {
			BufferedWriter wr=new BufferedWriter(new FileWriter(kiir));
			
			for (String s : sorok) {
				wr.write(s);
				wr.newLine();
			}
			
			wr.close();
			System.out.println("Írás kész");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ennyi hiányzó van:"+hianyzok.size());
		
		//Írassuk ki azokat, ahol a mulasztott órák száma több mint 5
		
		var tobbmint5=hianyzok.stream().filter(x->x.getMulasztottorak()>5).collect(Collectors.toList());
		

		var atlaghianyzas=hianyzok.stream().mapToDouble(x->x.getMulasztottorak()).average().getAsDouble();
		
		System.out.println("Átlagos hiányzás:"+atlaghianyzas);
		
		var atlagf=hianyzok.stream().filter(x->x.getMulasztottorak()>=5).mapToDouble(x->x.getMulasztottorak()).average().getAsDouble();

		System.out.println("5 óránál többet hiányzottak átlaga:"+atlagf);
		
		for (Hianyzo h : tobbmint5) {
			System.out.println(h.getNev()+","+h.getOsztaly()+","+h.getMulasztottorak());
		}
		
		
	}

}
