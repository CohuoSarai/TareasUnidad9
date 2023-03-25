package ejerciciounidad9;


public class EmpleadoPorComision extends EmpleadoBase 
{
   private double VentasBrutas;
   private double TarifaPorComision;

public EmpleadoPorComision(String PrimerNombre, String ApellidoPaterno, 
		String NumeroSeguroSocial,double VentasBrutas, double TarifaPorComision) 
{ 
	super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial);
	this.VentasBrutas = VentasBrutas;
    this.TarifaPorComision = TarifaPorComision;
}

public double Ingresos() 
{
  return TarifaPorComision * VentasBrutas;
}

public String toString() 
{
return String.format("Empleado Por Comisión : %s%nVentas Brutas son : $%,.2f; "
+ "Tarifa de Comisión es : %.2f", super.toString(), VentasBrutas, TarifaPorComision);
}
}
