package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lista = new ArrayList();
		Empleado empleado=new Empleado();
		empleado.setCodigo(1);
		empleado.setNombre("Julio");
		empleado.setSalario(33.33);

		  lista.add("pedro");
		  lista.add("hugo");
		  lista.add("juan");
		  lista.add("yo");
		  lista.add(1, new Integer(78));
		  lista.add(empleado);
        
		  System.out.println(lista.get(1));
		  System.out.println(lista.indexOf("yo"));
		  
		  Iterator it = lista.iterator(); 
		  System.out.println("---------------------");
		  while(it.hasNext()){
	  	    System.out.println(it.next());
		  }
        //  it.remove();//  lista.remove(4);
		 it = lista.iterator(); 
		 System.out.println("\n---------------------");
		  while(it.hasNext()){
			  Object obj=it.next();
			  if(obj.equals(empleado)){
				  empleado=(Empleado)obj;
				  System.out.println(empleado.getCodigo()+" "+empleado.getNombre()+" "+empleado.getSalario());
			  }
			  else  
        	     System.out.println(obj);
          }  
	}
}

