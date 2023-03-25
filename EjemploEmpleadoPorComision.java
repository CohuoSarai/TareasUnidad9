package ejerciciounidad9;

public class EjemploEmpleadoPorComision {

	public static void main(String[] args) 
	{

	EmpleadoPorComision Empleado1=new EmpleadoPorComision("Chavo ", "Del 8", 
	"12345678901", 40, 15);
		
		System.out.print("Empleado Por Comision.\n"
        	+ "Primer Nombre: "+Empleado1.obtenerPrimerNombre()+"\n"
            + "Primer Apellido: "+Empleado1.obtenerApellidoPaterno()+"\n"
        	+ "Numero Seguro Social: "+Empleado1.obtenerNumeroSeguroSocial()+"\n"
            + "Tarifa Por Comision: "+Empleado1.Ingresos());
	}
}