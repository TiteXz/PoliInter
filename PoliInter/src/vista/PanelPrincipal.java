package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PanelPrincipal extends JFrame {

	private JPanel contentPane;
	
	public JButton btnPanelUsu;
	public JButton btnPanelActi;
	public JButton btnPanelInscip;

	

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PanelPrincipal frame = new PanelPrincipal();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public PanelPrincipal() {
		setForeground(new Color(0, 255, 255));
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 141, 166));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnPanelActi = new JButton("ACTIVIDADES");
		btnPanelActi.setForeground(new Color(255, 255, 255));
		btnPanelActi.setBackground(new Color(0, 0, 0));
		btnPanelActi.setBounds(157, 118, 127, 23);
		btnPanelActi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		
		btnPanelUsu = new JButton("USUARIOS");
		btnPanelUsu.setForeground(new Color(255, 255, 255));
		btnPanelUsu.setBackground(new Color(0, 0, 0));
		btnPanelUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanelUsu.setBounds(157, 27, 127, 23);
		contentPane.add(btnPanelUsu);
		contentPane.add(btnPanelActi);
		
		btnPanelInscip = new JButton("INSCRIPCIONES");
		btnPanelInscip.setForeground(new Color(255, 255, 255));
		btnPanelInscip.setBackground(new Color(0, 0, 0));
		btnPanelInscip.setBounds(157, 207, 127, 23);
		contentPane.add(btnPanelInscip);
	}
	
	public JButton getBtnPanelUsu() {
		return btnPanelUsu;
	}

	public void setBtnPanelUsu(JButton btnPanelUsu) {
		this.btnPanelUsu = btnPanelUsu;
	}

	public JButton getBtnPanelActi() {
		return btnPanelActi;
	}

	public void setBtnPanelActi(JButton btnPanelActi) {
		this.btnPanelActi = btnPanelActi;
	}

	public JButton getBtnPanelInscip() {
		return btnPanelInscip;
	}

	public void setBtnPanelInscip(JButton btnPanelInscip) {
		this.btnPanelInscip = btnPanelInscip;
	}
}
