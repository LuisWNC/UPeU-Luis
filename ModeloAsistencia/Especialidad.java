package ModeloAsistencia;

public class Especialidad {
	
	private String nombre;
	private String codigo;
	private Persona contador =new Persona();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	

}
