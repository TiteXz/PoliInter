package principal;

import controlador.ControladorPrincipal;
import vista.PanelPrincipal;

public class App {

	public static void main(String [] args) {
		PanelPrincipal principal = new PanelPrincipal();
		
		ControladorPrincipal cp = new ControladorPrincipal(principal);
		cp.inicializar();
		principal.setVisible(true);
		
		
	}
}
