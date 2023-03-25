
package ejerciciounidad9;


public class EmpleadoBase {
	private String PrimerNombre; 
	private String ApellidoPaterno; 
	private String NumeroSeguroSocial;

	public EmpleadoBase (String PrimerNombre, String ApellidoPaterno, String NumeroSeguroSocial)
	{
	this.PrimerNombre = PrimerNombre; 
	this.ApellidoPaterno = ApellidoPaterno; 
	this.NumeroSeguroSocial = NumeroSeguroSocial;
	}

	public String obtenerPrimerNombre() 
	{
		return PrimerNombre;
	}

	public String obtenerApellidoPaterno() 
	{ 
		return ApellidoPaterno;
	}

	public String obtenerNumeroSeguroSocial() 
	{
		return NumeroSeguroSocial;
	}

	public String toString() 
	{
	 
	return String.format("%s %s%Numero de Seguro Social: %s", obtenerPrimerNombre(), obtenerApellidoPaterno(),obtenerNumeroSeguroSocial());
	}

}