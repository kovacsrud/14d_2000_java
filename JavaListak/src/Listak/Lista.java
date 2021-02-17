package Listak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lista {
	
	public static void main(String[] args) {
		
		//Listák használata
		List<Integer> szamok=new ArrayList();
		
		szamok.add(1);
		szamok.add(23);
		szamok.add(0, 15);
		
		System.out.println(szamok.get(0));
		
		for (Integer i : szamok) {
			System.out.println(i);
		}
			
		if (szamok.contains(1)) {
			System.out.println("benne van");
		}
		
		
	
		
		
		//Készítsen egy listát, töltse fel valamennyi véletlen számmal.
		
		Random rand=new Random();
		
		int elemszam=rand.nextInt(51-10)+10;
		
		List<Integer> vszamok=new ArrayList<>();
		
		for (int i = 0; i < elemszam; i++) {
			vszamok.add(rand.nextInt(51-10)+10);
		}
		
		for (Integer i : vszamok) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		var szurt=vszamok.stream().filter(x->x>20).toArray();
		
		for (int  i= 0;  i< szurt.length; i++) {
			System.out.println(szurt[i]);
		}
		
		var szurt2=vszamok.stream().filter(x->x>20).collect(Collectors.toList());
		
		for (Integer i : szurt2) {
			System.out.print(i+" ");
		}
	}
}
