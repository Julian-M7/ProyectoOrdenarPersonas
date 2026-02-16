package co.edu.uptc.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DemoColeccion {
    public static void main(String[] args){
        ArrayList<String> listasNombre = new ArrayList();
        listasNombre.add("JJJJ");
        listasNombre.add("AAAA");
        listasNombre.add("MMMM");
        Collections.sort(listasNombre);

        for (String name : listasNombre) {
            System.out.println(name);
        }
    }
}
