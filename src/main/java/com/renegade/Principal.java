package com.renegade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Principal {

	public void ordenar(){
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Tres");
		lista.add("Cuatro");

		// Clase Anónima. Ordena la lista por orden alfabético.
		Collections.sort(lista, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(String e: lista){
			System.out.println(e);
		}
		
	}
	
	
	
	public static void main(String[] args) {

		Principal p = new Principal();
		p.ordenar();
	}

}
