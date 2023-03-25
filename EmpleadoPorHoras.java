package ejerciciounidad9;

public class EmpleadoPorHoras extends EmpleadoBase
{
	private double Horas;
	private double Sueldo;

public EmpleadoPorHoras(String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial, double Sueldo, double Horas) 
	{
		super(PrimerNombre, ApellidoPaterno, NumeroSeguroSocial);
		
		this.Sueldo=Sueldo;
        this.Horas=Horas;
	}
	
	public void establecerHoras(double Horas) 
	{
		if (Horas >= 0 && Horas <= 168) 
		{			
		  this.Horas = Horas;
		}	
		else 
		{
		  throw new IllegalArgumentException("Las Horas trabajadas deben ser >= 0 y <= 168");
		}
	}
   public double obtenerHoras()
   {
	   return Horas;
   }
   public void establecerSueldo(double Sueldo)
   {
	   if (Sueldo >= 0) 
	    {
		 this.Sueldo = Sueldo;
	    } 
	   else 
	    {
		  throw new IllegalArgumentException("El Sueldo sera de >= 0");
		}
	}
	public double obtenerSueldo() 
	{
		return Sueldo;
	}
	public double Ingresos() 
	{
		if (Horas <= 40)
		 {
		   return Sueldo * Horas;
		 }
		
		else
		 {
		   return 40 * Sueldo + (Horas - 40) * Sueldo * 1.5;
		 }
	}
	@Override
	public String toString() 
	{
		
	   return String.format("Empleado Por Horas es : %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "Sueldo Por Hora", obtenerSueldo(), 
			   "Horas Trabajadas", obtenerHoras());
	}

}