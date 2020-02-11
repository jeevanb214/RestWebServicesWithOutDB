package com.jeevan.RestWebservices;

import java.util.ArrayList;
import java.util.List;

import com.jeevan.model.Aliens;

public class AlienRepository {

	List<Aliens> al = new ArrayList<Aliens>();
	
	public List<Aliens> getAliens() {
		Aliens a = new Aliens();
		a.setId(1);
		a.setName("jeevan");
		al.add(a);

		Aliens a1 = new Aliens();
		a1.setId(2);
		a1.setName("karthik");
		al.add(a1);

		return al;
	}

	public void createAlien(Aliens alien) {
		
		System.out.println(alien);
		al.add(alien);
	}
	
	public Aliens getAlienById(int id) {
		List<Aliens> al = new ArrayList<Aliens>();
		al = getAliens();
		for (Aliens alien : al) {

			if (alien.getId() == id) {
				return alien;
			}
		}
		return null;//here we can also send the---> return new Aliens(); which is id and name will be 0
	}

}
