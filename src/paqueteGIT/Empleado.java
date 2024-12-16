package paqueteGIT;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;
	private float sueldo;
	private boolean hijos; // True si tiene hij@s, false en caso contrario
	
	/// CONSTRUCTORES ///
	public Empleado(String dni, String nombre, String apellidos, byte edad, float sueldo, boolean hijos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sueldo = sueldo;
		this.hijos = hijos;
	}
}
