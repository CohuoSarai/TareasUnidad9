package ejerciciounidad9;


public class EmpleadoBaseMasComision extends EmpleadoPorComision 
{
	  private double SalarioBase;

public EmpleadoBaseMasComision(String PrimerNombre, String ApellidoPaterno, 
String NumeroSeguroSocial,double VentasBrutas, double TarifaPorComision, double SalarioBase)
 { 
 	  super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial, VentasBrutas,TarifaPorComision);

    this.SalarioBase = SalarioBase;
 }

public double Ingresos() 
 {
    return SalarioBase + super.Ingresos();
 }

public String toString()
{  return String.format("Empleado Con Salario Base Mas Comisión es de : %s%nsalario base:$%,.2f",
	 super.toString(), SalarioBase);}
}