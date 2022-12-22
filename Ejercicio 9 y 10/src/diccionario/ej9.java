package diccionario;
 
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		HashMap<String, String> palabrasTraducidas = new HashMap<>();
	
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
		palabrasTraducidas.put("sky", "cielo");
		palabrasTraducidas.put("gusano", "worm");
		palabrasTraducidas.put("carmesí", "crimson");
		palabrasTraducidas.put("nieve", "snow");
		palabrasTraducidas.put("hielo", "ice");
		palabrasTraducidas.put("arrecife", "reef");
		palabrasTraducidas.put("amanecer", "sunrise");
		palabrasTraducidas.put("enfermera", "nurse");
		
		
		System.out.println("Ingresa la palabra que quieres traducir: ");
		
		Scanner teclado = new Scanner(System.in);
		String palabra = teclado.nextLine().toLowerCase();
		
		teclado.close();
		
		try{
			String palabraIntroducida = palabrasTraducidas.get(palabra).toString();
			System.out.println("En inglés, esta palabra es: " + palabraIntroducida);
		}catch(NullPointerException e){
			System.out.println("¡Ups! Esta palabra no está en nuestro dicionario. Lo sentimos.");
		}
		
		
	
	}
}
