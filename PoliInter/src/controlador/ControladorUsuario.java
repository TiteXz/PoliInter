package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import modelo.dao.AccesoBBDD;
import vista.PanelUsuarios;

public class ControladorUsuario  implements ActionListener, MouseListener{
	private vista.PanelUsuarios panelUsuarios;
	
	
public ControladorUsuario(AccesoBBDD gb, PanelUsuarios usuarios) {
		// TODO Auto-generated constructor stub
	}

public void inicializar() {
	this.panelUsuarios.setTitle("Usuarios");
	panelUsuarios.setLocationRelativeTo(null);
	panelUsuarios.setVisible(false);
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
	}
	
}
