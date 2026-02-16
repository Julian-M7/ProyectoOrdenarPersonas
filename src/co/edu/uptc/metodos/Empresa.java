package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Empresa {
	private ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
	public void agregaEmpleado(int codigo,String nombre,double salario){
		Empleado empleado=new Empleado();
		empleado.setCodigo(codigo);
		empleado.setNombre(nombre);
		empleado.setSalario(salario);
		listaEmpleados.add(empleado);
	}
	public String muestraListaEmpleados(){
		String salida="";
		int i=0;
		Iterator<Empleado> itrListaEmpleados = listaEmpleados.iterator();
	    while(itrListaEmpleados.hasNext()){
	    	Empleado empleado=itrListaEmpleados.next();
	    	salida+=empleado.getCodigo()+" "+empleado.getNombre()+" "+empleado.getSalario()+" | ";
	    }	
		return salida;
	}
	
	public String muestraListaEmpleados2(){
    	StringBuilder text = new StringBuilder();
    	for (Empleado emp : listaEmpleados) {
            if (emp != null) {
                text.append(emp.getCodigo()+" "+emp.getNombre()+" "+emp.getSalario());
                text.append("\n");
            }
        }
    	return(text.toString());
    }

	
	public int cantidadEmpleados(){
		return listaEmpleados.size();
	}	
}