package ModeloAsistencia;

public class Persona {
	
	private static String nombre;
	private static String apelPaterno;
	private static String apelMaterno;
	private static String dni;
	private static String direccion;
	private static String celular;
	private static String estadoCiivil;
	
	public static void main(String[] args) {
		nombre = "luis";
		apelPaterno= "ninacondo";
		apelMaterno = "condori";
		dni= "46785529";
		direccion = "jr huancane";
		celular = " ";
		estadoCiivil ="soltero" ;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelPaterno() {
		return apelPaterno;
	}
	public void setApelPaterno(String apelPaterno) {
		this.apelPaterno = apelPaterno;
	}
	public String getApelMaterno() {
		return apelMaterno;
	}
	public void setApelMaterno(String apelMaterno) {
		this.apelMaterno = apelMaterno;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
}
