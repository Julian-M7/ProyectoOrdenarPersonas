package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> fruits = new ArrayList<String>();

		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		for(String temp: fruits){
			System.out.println(temp);
		}
		System.out.println("\n");

		Collections.sort(fruits);

		int i=0;
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}
		Comparator<String> comparador = Collections.reverseOrder();
	
		Collections.sort(fruits, comparador);
		i=0;
		System.out.println("\n");
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}
	}

}
