package aplicativo;

import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class TelaDeRemocao{
	
	private JFrame frame;
	private JTextField txtmaterial;
	private JTextField txtQuant;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					TelaDeRemocao window = new TelaDeRemocao();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	 
	public TelaDeRemocao() {
		initialize();
	}
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		 
		JLabel lblNewLabel = new JLabel("Remover Materiais");
		lblNewLabel.setBounds(191, 24, 118, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(76, 49, 345, 4);
		frame.getContentPane().add(separator_1);
		
		JLabel lblremove = new JLabel("Insira o que será removido");
		lblremove.setBounds(170, 71, 200, 40);
		frame.getContentPane().add(lblremove);
		
		JLabel lblqnt = new JLabel("Qnt");
		lblqnt.setBounds(100, 71, 200, 40);
		frame.getContentPane().add(lblqnt);
		
		txtmaterial = new JTextField();
		txtmaterial.setBounds(146, 100, 210, 20);
		frame.getContentPane().add(txtmaterial);
		txtmaterial.setColumns(10);
		
		txtQuant = new JTextField();
		txtQuant.setBounds(100, 100, 40, 20);
		frame.getContentPane().add(txtQuant);
		txtQuant.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(205, 198, 89, 23);
		frame.getContentPane().add(btnRemover);
		
		btnRemover.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				
				JOptionPane.showMessageDialog(null, "Removido com sucesso !!!");
			}
			
		});
	 
	}
	
}

