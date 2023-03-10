package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.AccesoBBDD;
import vista.PanelPrincipal;
import vista.PanelUsuarios;

public class ControladorPrincipal implements ActionListener{
	private PanelPrincipal ventanaPrincipal;
	
	
	public ControladorPrincipal(PanelPrincipal principal) {
		this.ventanaPrincipal = principal;
		
		//asignar escuchadores de eventos a elementos(botones, layouts...)
		ventanaPrincipal.getBtnPanelUsu().addActionListener(this);
		ventanaPrincipal.getBtnPanelActi().addActionListener(this);
		ventanaPrincipal.getBtnPanelInscip().addActionListener(this);
		
		
	}
	
	public void inicializar() {
		ventanaPrincipal.setTitle("Desktop");
		ventanaPrincipal.setLocationRelativeTo(null);
		ventanaPrincipal.setVisible(false);
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==ventanaPrincipal.btnPanelUsu) {
			System.out.println("boton gestor Usuario clicado");
			AccesoBBDD gb = new AccesoBBDD();
			vista.PanelUsuarios usuarios = new PanelUsuarios(ventanaPrincipal, true);
			
			ControladorUsuario usuariosC = new ControladorUsuario(gb, usuarios);
			usuariosC.inicializar();
			usuarios.setVisible(true);
		}else if(e.getSource()==ventanaPrincipal.btnPanelActi) {
			System.out.println("boton gestor Actividades clicado");
		}else if(e.getSource()==ventanaPrincipal.btnPanelInscip) {
			System.out.println("boton gestor Incripcion clicado");
			//crear el modelo necesario
			//crear la vista que tendrĂ¡ que abrir
			//crear el controlador pasandole el modelo y la vista que controlarĂ¡
			//inicializar y visualizar
		}
	}

}
