package diccionario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import utiles.Teclado;

public class ej10 {

	public static void main(String[] args) throws IOException{
		HashMap<String, String> palabrasTraducidas = new HashMap<>();
		
		ArrayList<String> copiaDiccionario = new ArrayList<String>();

		ArrayList<String> palabrasAleatorias = new ArrayList<String>();
		
		int traduccionesCorrectas = 0;
		int traduccionesErroneas = 0;
		
		palabrasTraducidas.put("zapato", "shoe");
		palabrasTraducidas.put("árbol", "tree");
		palabrasTraducidas.put("lluvia", "rain");
		palabrasTraducidas.put("oro", "gold");
		palabrasTraducidas.put("furia", "rage");
		palabrasTraducidas.put( "fantasma", "ghost");
		palabrasTraducidas.put("garra", "claw");
		palabrasTraducidas.put("luciérnaga", "firefly");
		palabrasTraducidas.put("libélula", "drafonfly");
		palabrasTraducidas.put("espada", "sword");
		palabrasTraducidas.put("violeta", "purple");
		palabrasTraducidas.put("siervo", "deer");
		palabrasTraducidas.put("cielo", "sky");
		palabrasTraducidas.put("gusano", "worm");
		palabrasTraducidas.put("carmesí", "crimson");
		palabrasTraducidas.put("nieve", "snow");
		palabrasTraducidas.put("hielo", "ice");
		palabrasTraducidas.put("arrecife", "reef");
		palabrasTraducidas.put("amanecer", "sunrise");
		palabrasTraducidas.put("enfermera", "nurse");
		
		copiaDiccionario.addAll(palabrasTraducidas.keySet());
		Collections.shuffle(copiaDiccionario); 
		
		for (int i = 1; i < 6; i++) {
			palabrasAleatorias.add(copiaDiccionario.remove(0));
		}

		for (String i : palabrasAleatorias) {

			String respuesta = "";
			respuesta = Teclado.leerCadena("Introduzca la traducción de la palabra " + i + ": ");
			if (respuesta.contains(palabrasTraducidas.get(i))) {
				traduccionesCorrectas++;
			} else {
				traduccionesErroneas++;
			}
		}
		System.out.println("Has acertado " + traduccionesCorrectas + " palabras y has fallado " + traduccionesErroneas + " palabras.");

}
}

