package model;
public class Empleado {
   private int codigo;
   private String nombre;
   private double salario;
   public int getCodigo() {
	return codigo;
   }
   public void setCodigo(int codigo) {
	this.codigo = codigo;
   }
   public String getNombre() {
	return nombre;
   }
   public void setNombre(String nombre) {
	this.nombre = nombre;
   }
   public double getSalario() {
	return salario;
   }
   public void setSalario(double salario) {
	this.salario = salario;
  }

    @Override
    public String toString() {
        return "Codigo ='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", salario='" + getSalario() + "'";
    }

}