package aplicativo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TelaDeInicio extends JFrame implements ActionListener{
	
	private JLabel bemvindo, icone;
	private JButton entrar;
	TelaDeLogin login = new TelaDeLogin();	
	public TelaDeInicio() {
		setLayout(null);
		setSize(1080, 720);
		setTitle("Início");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setBackground(Color.decode("#1E5128"));
		setResizable(false);
		setVisible(true);
		
		entrar = new JButton("Entrar");
		entrar.setBounds(350, 550, 350, 50);
		entrar.setBackground(Color.decode("#4E9F3D"));
		entrar.setForeground(Color.decode("#D8E9A8"));
		entrar.setBorderPainted(false);
		entrar.addActionListener(this);
		entrar.setFocusable(false);
		entrar.setFont(new Font("Roboto", Font.PLAIN, 24));
		
		bemvindo = new JLabel("Bem-Vindo");
		bemvindo.setBounds(420, 100, 400, 50);
		bemvindo.setFont(new Font("Roboto", Font.PLAIN, 48));
		bemvindo.setForeground(Color.decode("#D8E9A8"));
		
		icone = new JLabel();
		icone.setBounds(0, 0, WIDTH, HEIGHT);
		
		add(entrar);
		add(bemvindo);
		add(icone);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==entrar) {
			
		}
	}

	public static void main(String[] args) {
		new TelaDeInicio();	
	}
}
