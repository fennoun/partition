package com.nfe;

import java.util.ArrayList;
import java.util.List;

public class Partition {

	/**
	 * Une fonction qui partionne une liste en des sous listes selon une taille
	 * donnée.
	 * 
	 * @param liste
	 * @param taille
	 * @return Une liste contenant les sous listes de taille maximum "taille"
	 */
	public List<List<Integer>> partition(List<Integer> liste, int taille) {
		List<List<Integer>> partitions = new ArrayList<>();
		
		//Si la taille est non significative ou la liste est nulle on retourne une partition vide
		if(taille <= 0 || liste == null)
			return partitions;
		
		int j = 1;
		List<Integer> element = new ArrayList<>();
		
		for (int i = 0; i < liste.size(); i++) {
			if (j <= taille) {
				element.add(liste.get(i));
				j++;
			} else {
				partitions.add(element);
				element = new ArrayList<>();
				element.add(liste.get(i));
				j = 2;
			}
		}

		if (element.size() > 0)
			partitions.add(element);

		return partitions;
	}
}
