package com.lambdas.main;

import java.util.*;
import java.util.stream.Stream;

import com.lambdas.interfaces.AMayus3;
import com.lambdas.interfaces.Meses;
import com.lambdas.interfaces.NumParInpar;
import com.lambdas.interfaces.Pi;
import com.lambdas.interfaces.Reverse;
import com.lambdas.interfaces.StringO;

public class Main {

	public static void main(String[] args) {
		
		List<String> nombres = Arrays.asList("Juan","Pepe","Federico","Miguel","Raul","David","Ana","Rodrigo","Rocio");
		List<Integer> numeros = Arrays.asList(3,22,50,41,76,11,7,5,6,9);
		List<String> meses = Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
				
		AMayus3 mayus = (List<String> nombre) -> {
			
			char letra;
			int total = 0;
			
			for(String n : nombre) {
				
				letra = n.charAt(0); // guardamos la primera letra de la cadena
				
				if(Character.isUpperCase(letra) && letra == 'A' && n.length() == 3 ) { //comprobamos si es minuscula o mayucula el tamaño
					System.out.println(n);
					total++;
				}
				
			}
			
			if(total == 0) {
				System.out.println("No hemos encontrado, ingresa nuevos nombres :)");
			}
			
			System.out.println("***************************************************************");
						
		};
		
		mayus.mayus3(nombres);
		
		/******************************************************************************************************/
		
		Stream<Integer> par = numeros.stream().filter(n -> n % 2 == 0);
		Stream<Integer> inpar = numeros.stream().filter(n -> n % 2 != 0);
		
		par.forEach(n -> System.out.println("e"+n));
		inpar.forEach(n -> System.out.println("o"+n));
		
		/*NumParInpar parInpar = (List<Integer> num) -> {
			
			for(int n : num) {
				if(n % 2 == 0) { //comprobamos si el numero es para
					System.out.println("e"+n);
				}else {
					System.out.println("o"+n);
				}
			}
			
			
			
		};
		
		parInpar.parInpar(numeros);*/
		
		System.out.println("***************************************************************");
		
		/******************************************************************************************************/
		
		StringO letraO = (List<String> cadenas) -> {
			
			int total = 0;
			int num = 0;
			
			for(String n : cadenas) {
				
				num=0;
				
				for(int i=0; i<n.length();i++) { // recorremos letra por letra para en la cadena para encontrar la "o"
					
					if(n.charAt(i)=='o' || n.charAt(i)=='O') {
						
						if(num == 0) { // Controlamos los nombres que tinene mas de un "o" y solo lo mastramos una vez
							System.out.println(n);
							total++;
							num++;
						}
						
					}
					
				}
				
			}
			
			if(total == 0) {
				System.out.println("No hemos encontrado, ingresa nuevos nombres :)");
			}
			
			System.out.println("***************************************************************");
						
		};
		
		letraO.letraO(nombres);
		
		/******************************************************************************************************/
		
		StringO letraO5 = (List<String> cadenas) -> {
			
			int total = 0;
			int num = 0;
			
			for(String n : cadenas) {
				
				num=0;
				
				if(n.length() > 5){
					
					for(int i=0; i<n.length();i++) { // recorremos letra por letra para en la cadena para encontrar la "o"
						
						if(n.charAt(i)=='o' || n.charAt(i)=='O') {
							
							if(num == 0) { // Controlamos los nombres que tinene mas de un "o" y solo lo mastramos una vez
								System.out.println(n);
								total++;
								num++;
							}
							
						}
						
					}
					
				}
				
			}
			
			if(total == 0) {
				System.out.println("No hemos encontrado, ingresa nuevos nombres :)");
			}
			
			System.out.println("***************************************************************");
						
		};
		
		letraO5.letraO(nombres);
		
		/******************************************************************************************************/

		meses.forEach(m -> System.out.println("** "+m+" **"));
		System.out.println("***************************************************************");
		
		/******************************************************************************************************/
		
		meses.forEach(System.out::println);
		System.out.println("\r\n***************************************************************");
		
		System.out.println("******************************* FASE 2 ****************************");
		
		Pi valores = (int valor) -> {return valor;};
		System.out.println("El valor es: "+valores.getPiValue((int) 3.1415));
		
		System.out.println("\r\n***************************************************************");
		System.out.println("******************************* FASE 3 ****************************");
		
		String palabra = "Fonografo";
		
		Reverse rever = (String r) -> {
			
			String cadena = "";
			
			for(int i=r.length()-1;i>=0;i--) {
				cadena += r.charAt(i);
			}
			
			return cadena;
			
		};
		
		System.out.println("Palabra original: "+palabra+" parala al reves: "+rever.reverse(palabra));
		
	}

}
