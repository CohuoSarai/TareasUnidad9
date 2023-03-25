package ejerciciounidad9;

public class EjemploEmpleadoBaseMasComision {

	public static void main(String[] args)
	{
		
    EmpleadoBaseMasComision Empleado1=new EmpleadoBaseMasComision("Chavo", "Del 8", 
    		"12345678901", 40 , 15 , 2700 );
    		
        System.out.print("Empleado Por Comision Mas Base.\n"
        		+ "Primer Nombre:   "+Empleado1.obtenerPrimerNombre()+"\n"
        		+ "Primer apellido: "+Empleado1.obtenerApellidoPaterno()+"\n"
        		+ "Numero Seguro Social: "+Empleado1.obtenerNumeroSeguroSocial()+"\n"
                + "Sueldo Base Mas Comision:  "+Empleado1.Ingresos());
	
	}
}