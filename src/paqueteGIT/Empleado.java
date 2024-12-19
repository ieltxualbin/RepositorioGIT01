package paqueteGIT;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;
	private float sueldo;
	private boolean hijos; // True si tiene hij@s, false en caso contrario
	private double ayuda; // Ayuda para los empleados en situación de necesidad
	
	/** CONSTRUCTORES **/
	/////////// Constructor COMPLETO ///////////
	public Empleado(String dni, String nombre, String apellidos, byte edad, float sueldo, boolean hijos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sueldo = sueldo;
		this.hijos = hijos;
		this.ayuda = hijos?sueldo*0.10:20;
	}
	
	/////////// Constructor VACIO ///////////
	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "********";
		this.apellidos = "******";
		this.edad = 0;
		this.sueldo = (float) 0.0;
		this.hijos = false;
		this.ayuda = hijos?sueldo*0.10:20;
	}
	
	/////////// Constructor PARCIAL (solo DNI y NOMBRE) ///////////
	public Empleado(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = "******";
		this.edad = 0;
		this.sueldo = (float) 0.0;
		this.hijos = false;
		this.ayuda = hijos?sueldo*0.10:20;
	}

	/////////// GETers y SETers ///////////
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public byte getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(byte edad) {
		this.edad = edad;
	}

	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return the hijos
	 */
	public boolean isHijos() {
		return hijos;
	}

	/**
	 * @param hijos the hijos to set
	 */
	public void setHijos(boolean hijos) {
		this.hijos = hijos;
	}

	/**
	 * @return the ayuda
	 */
	public double getAyuda() {
		return ayuda;
	}

	/**
	 * @param ayuda the ayuda to set
	 */
	public void setAyuda() {
		this.ayuda = hijos?sueldo*0.10:20;
	}
}
