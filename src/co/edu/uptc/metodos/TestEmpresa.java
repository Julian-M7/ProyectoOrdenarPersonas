package model;

public class TestEmpresa {

  public static void main(String[] args) {

     Empresa empresa=new Empresa();
     empresa.agregaEmpleado(1, "Hugo", 10);
     empresa.agregaEmpleado(2, "Paco", 20);
     empresa.agregaEmpleado(3, "Luis", 30);
     System.out.println(empresa.muestraListaEmpleados());
     System.out.println(empresa.muestraListaEmpleados2());
     System.out.println("Cantidad empleados=" + empresa.cantidadEmpleados());
	}
}