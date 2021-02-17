package osztalyok;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Osztaly {

	public static void main(String[] args) {
		
		Ember ember=new Ember("Nagy Elek",1999,178,"Orosh�za");
		
		ember.SetNev("Kiss Elek");
		
		System.out.println(ember.GetNev()+","+ember.getSzuletesihely());
		Ember uresember=new Ember();
		
		String[] nevek=new String[] {"Elek","G�za","Jol�n","�va","�gnes","K�roly"};
		String[] varosok=new String[] {"Elek","Gyula","Orosh�za","B�k�s","Kamut","Sopron"};
		List<Ember> emberek=new ArrayList<Ember>();
		
		Random rand=new Random();
		
		
		int db=100;
		for (int i = 0; i < db; i++) {
			String benev=nevek[rand.nextInt(nevek.length)];
			String bevaros=varosok[rand.nextInt(varosok.length)];
			int bemag=rand.nextInt(221-150)+150;
			int beszulev=rand.nextInt(2022-1921)+1921;
			Ember beember=new Ember(benev, beszulev, bemag, bevaros);
			emberek.add(beember);
						
		}
		
		System.out.println(emberek.size());
		
		for (var e: emberek) {
			System.out.println(e.GetNev()+","+e.getSzuletesihely()+","+e.getSzuletesiev()+","+e.getMagassag());
		}

		//170cm-n�l magasabbakat k�rdezz�k le egy �j list�ba
		System.out.println("Magasabbak");
		
		var magasabb=emberek.stream().filter(x->x.getMagassag()>200 && x.getSzuletesiev()>1990).collect(Collectors.toList());
		
		for (Ember e : magasabb) {
			System.out.println(e.GetNev()+","+e.getSzuletesihely()+","+e.getSzuletesiev()+","+e.getMagassag());
		}
		
	}

}
