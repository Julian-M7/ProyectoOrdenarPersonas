package model;
import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.Date;
	import java.util.List;
public class Test3 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("-----Ordenado cadenas de texto-----");
			List<String> nombres = new ArrayList<String>();
			nombres.add("Paco Perez");
			nombres.add("José Alvarado");
			nombres.add("Pepe Argeta");
			nombres.add("Ariel Anonitmo");
			nombres.add("Ariel Maldnoado");
			nombres.add("Zulma Estrada");
			
			//Si el arraylist es de objetos primitivos como, String, Integer, etc.
			//basta con llamar al metodo sort.
			Collections.sort(nombres);
			
			for(String nombre : nombres){
				System.out.println(nombre);
			}
			
		}
	}
