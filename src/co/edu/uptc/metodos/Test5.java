package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
public class Test5 {	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Empleado> emp = new ArrayList<Empleado>();
			emp.add(new Empleado(3,"Martha", 20));
			emp.add(new Empleado(1,"Zulma",23));
			emp.add(new Empleado(2,"Ana",21));
			
			System.out.println("\n");
			for (Empleado empAp:emp){
				System.out.println(empAp);
			}
			
			System.out.println("-----Ordenado codigo-----");
			Collections.sort(emp, new Comparator<Empleado>(){
           //@Override
				public int compare(Empleado o1, Empleado o2) {
        	        if (o1.getCodigo()>o2.getCodigo())
					   return 1;
        	        else if (o1.getCodigo()<o2.getCodigo())
        	        	     return -1;
        	             else
        	        	     return 0;
				}							
			});
			
			for(Empleado empAp : emp){
				System.out.println(empAp);
			}
			System.out.println("-----Ordenado por nombre-----");
			Collections.sort(emp, new Comparator<Empleado>(){

//			@Override
				public int compare(Empleado o1, Empleado o2) {
					return o1.getNombre().compareTo(o2.getNombre());
				}
			});
			
			for(Empleado empAp : emp){
				System.out.println(empAp);
			}
			System.out.println("-----Ordenado Salario-----");
			Collections.sort(emp, new Comparator<Empleado>(){
           //@Override
				public int compare(Empleado o1, Empleado o2) {
        	        if (o1.getSalario()>o2.getSalario())
					   return 1;
        	        else if (o1.getSalario()<o2.getSalario())
        	        	     return -1;
        	             else
        	        	     return 0;
				}							
			});
			
			for(Empleado empAp : emp){
				System.out.println(empAp);
			}
			
		}
	}
