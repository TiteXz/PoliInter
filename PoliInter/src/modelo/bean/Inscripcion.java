package modelo.bean;

public class Inscripcion {
	
	//atributos relacionados con campos
	int dni;
	int id_usuario;
	int id_actividad;
	
	
		//atributos relacionados con relaciones
		
	public Inscripcion() {}
	
	public Inscripcion(int dni, int id_usuario, int id_actividad) {
		super();
		this.dni = dni;
		this.id_usuario = id_usuario;
		this.id_actividad = id_actividad;
	}

	
		//metodos, getters y setters
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_actividad() {
		return id_actividad;
	}

	public void setId_actividad(int id_actividad) {
		this.id_actividad = id_actividad;
	}
	
}
