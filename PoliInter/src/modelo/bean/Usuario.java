package modelo.bean;


public class Usuario {
	
	//atributos relacionados con campos
	int id;
	String nombre_apellido;
	String dni;
	String codigo;
	
		//atributos relacionados con relaciones
	
	public Usuario() {}
	
	public Usuario(int id, String nombre_apellido, String dni, String codigo) {
		super();
		this.id = id;
		this.nombre_apellido = nombre_apellido;
		this.dni = dni;
		this.codigo = codigo;
	}

	//metodos, getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_apellido() {
		return nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre_apellido=" + nombre_apellido + ", dni=" + dni + ", codigo=" + codigo
				+ "]";
	}
		
		

}
