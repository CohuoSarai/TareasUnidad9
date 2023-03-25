package ejerciciounidad9;

public class EjemploEmpleadoPorHoras {

	   public static void main(String[] args) {
			
	EmpleadoPorHoras Empleado1=new EmpleadoPorHoras ("Chavo", "Del 8", "123456789", 40, 60);
			
	System.out.print("Empleado Por Horas.\n"
	       + "Primer Nombre:  "+Empleado1.obtenerPrimerNombre()+"\n"
	       + "Primer Apellido:  "+Empleado1.obtenerApellidoPaterno()+"\n"
	       + "Numero Seguro Social:   "+Empleado1.obtenerNumeroSeguroSocial()+"\n"
	       + "Sueldo Por Horas:  "+Empleado1.obtenerSueldo()+"\n"
	       + "Horas Trabajadas:  "+Empleado1.obtenerHoras()+"\n"
	       + "Sueldo Total:   "+Empleado1.Ingresos());
			
		Empleado1.establecerHoras(40); 
		Empleado1.establecerSueldo(60);
System.out.printf("%n%s:%n%n%s%n", "La Información del empleado a sido actualizada por toString", Empleado1.toString());

	System.out.printf("Los ingresos del empleado son : $%,.2f%n", Empleado1.Ingresos());

		}
	}