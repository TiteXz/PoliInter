package modelo.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import modelo.Conector;
import modelo.bean.Actividad;
import modelo.bean.Inscripcion;
import modelo.bean.Usuario;
/**
 * 
 * @author irakasle
 *	todos los métodos que accedan a la BBDD estarán aqui
 *	en esta clase no tiene que haber ningun Scanner ni System.ou.println
 */
public class AccesoBBDD extends Conector{


	public void insertarUsuario(Usuario usuario) {
		try {
			PreparedStatement pst = conexion.prepareStatement("INSERT INTO usuarios (id,nombre_apellido,dni,codigo) VALUES (?,?,?,?)");
			pst.setInt(1, usuario.getId());
			pst.setString(2, usuario.getNombre_apellido());
			pst.setString(3, usuario.getDni());
			pst.setString(4, usuario.getCodigo());
			
			pst.execute();
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
//	public void MostrarUsuarios(Usuario usuario) {
//		try {
//			PreparedStatement pst = conexion.prepareStatement("SELECT * FROM usuarios WHERE id = ?");
//			pst.setInt(1, usuario.getId());
//			
//			
//			ResultSet resultado = pst.executeQuery();
//			
//			while(resultado.hasNextLine()) {
//				System.out.println(usuario.toString());
//			}
//			
//		
//		} catch (SQLException e) {
//			e.printStackTrace();
//			}
//		
//	}
	
	public void DarDeBaja(Actividad actividad, Usuario usuario) {
		
		try {
			PreparedStatement pst = conexion.prepareStatement("DELETE FROM usuarios WHERE codigo = ?");
			pst.setString(1, usuario.getCodigo());
			
			pst.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void cogerDatosActividad(Actividad actividad) {
		
		try {
			PreparedStatement pst = conexion.prepareStatement("SELECT id=?, nombre=?, fecha_inicio=?, dias_semana=?, horas=?, max_participantes=?, precio=? FROM actividades WHERE id = ?");
			pst.setInt(1, actividad.getId());
			pst.setString(2, actividad.getNombre());
			pst.setDate(3,  (Date) actividad.getFecha_inicio());
			pst.setString(4, actividad.getDias_semana());
			pst.setInt(5, actividad.getHoras());
			pst.setInt(6, actividad.getMax_participantes());
			pst.setDouble(7, actividad.getPrecio());
			pst.setInt(8, actividad.getId());
			
			pst.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void CambiarDias(Actividad actividad) {
		try {
			PreparedStatement pst = conexion.prepareStatement("UPDATE actividades SET dias_semana=? WHERE id=?");
			pst.setString(1, actividad.getDias_semana());
			pst.setInt(2, actividad.getId());
			
			
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
//	public void comparador1() {
//	ArrayList<Actividad> actividad = new ArrayList();
//	ArrayList<Actividad> here = new ArrayList();
//	
//	for (Actividad actividad2 : here) {
//		
//	}
//	
//		Iterator<Actividad> (Actividad)here.next();
//	
//		if(codigo1() > codigo2()){
//		i = 1;
//	}
//		if(codigo1() < codigo2()){
//		i = -1;
//		
//	}
//		if(codigo1() == codigo2()){
//		i = 0;
//	}

}
