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
		getContentPane().setBackground(Color.white);
		setResizable(false);
		setVisible(true);
		
		entrar = new JButton("Entrar");
		entrar.setBackground(Color.decode("#1E5128"));
		entrar.setForeground(Color.decode("#D8E9A8"));
		entrar.setBorderPainted(false);
		entrar.addActionListener(this);
		entrar.setFocusable(false);
		entrar.setFont(new Font("Roboto", Font.PLAIN, 24));
		
		bemvindo = new JLabel("Bem-Vindo");
		bemvindo.setFont(new Font("Roboto", Font.PLAIN, 48));
		bemvindo.setForeground(Color.decode("#1E5128"));
		
		icone = new JLabel(new ImageIcon(getClass().getResource("controle.jfif")));
		icone.setVisible(true);
		
		add(entrar);
		add(bemvindo);
		add(icone);
		entrar.setBounds(350, 550, 350, 50);
		bemvindo.setBounds(420, 100, 400, 50);
		icone.setBounds(350, 160, 350, 350);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==entrar) {
			
		}
	}

	public static void main(String[] args) {
		new TelaDeInicio();	
	}
}
