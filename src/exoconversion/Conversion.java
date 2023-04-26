package exoconversion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Conversion extends JFrame {

	private JPanel contentPane;
	private JTextField textSommeEuros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversion frame = new Conversion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversion() {
		setTitle("Conversion de monnaie");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 433, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSommeEuros = new JLabel("Somme en euros :");
		lblSommeEuros.setBounds(34, 57, 101, 14);
		contentPane.add(lblSommeEuros);
		
		JLabel lblResultat = new JLabel("Résultat");
		lblResultat.setBounds(179, 353, 118, 14);
		contentPane.add(lblResultat);
		
		JLabel lblTitre = new JLabel("Conversion de monnaie");
		lblTitre.setBounds(137, 29, 142, 14);
		contentPane.add(lblTitre);
		
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});	
		
		JButton btnDollars = new JButton("Dollars");
        btnDollars.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double dollars = Double.parseDouble(textSommeEuros.getText());
                 double dollartotal = dollars*1.1669;
                 lblResultat.setText(Double.toString(dollartotal));
            }});
        
        JButton btnLivre_Sertling = new JButton("Livre Sertling");
        btnLivre_Sertling.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double sertling = Double.parseDouble(textSommeEuros.getText());
                 double sertlingtotal = sertling*0.8768;
                 lblResultat.setText(Double.toString(sertlingtotal));

            }});
        
        JButton btnRouble = new JButton("Rouble");
        btnRouble.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double rouble = Double.parseDouble(textSommeEuros.getText());
                 double roubletotal = rouble*72.5970 ;
                 lblResultat.setText(Double.toString(roubletotal));

            }});
        
        JButton btnSucre = new JButton("Sucre");
        btnSucre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double sucre = Double.parseDouble(textSommeEuros.getText());
                 double sucretotal = sucre*26.800;
                 lblResultat.setText(Double.toString(sucretotal));

            }});
        
		btnDollars.setIcon(new ImageIcon("D:\\Cours_SIO\\SLAM_JAVA_M.Perart\\Images pour graphique java\\drapeaux-americains50.png"));
		btnDollars.setBounds(10, 143, 188, 94);
		contentPane.add(btnDollars);
		
		
		btnRouble.setIcon(new ImageIcon("D:\\Cours_SIO\\SLAM_JAVA_M.Perart\\Images pour graphique java\\drapeaux-russie50.png"));
		btnRouble.setBounds(10, 248, 188, 94);
		contentPane.add(btnRouble);
		
		
		btnLivre_Sertling.setIcon(new ImageIcon("D:\\Cours_SIO\\SLAM_JAVA_M.Perart\\Images pour graphique java\\drapeaux-angleterere50.gif"));
		btnLivre_Sertling.setBounds(230, 143, 178, 98);
		contentPane.add(btnLivre_Sertling);
		
		
		btnSucre.setIcon(new ImageIcon("D:\\Cours_SIO\\SLAM_JAVA_M.Perart\\Images pour graphique java\\drapeau_equateur50.gif"));
		btnSucre.setBounds(230, 248, 178, 94);
		contentPane.add(btnSucre);
		
		
		btnQuitter.setIcon(new ImageIcon("D:\\Cours_SIO\\SLAM_JAVA_M.Perart\\Images pour graphique java\\quitter50.png"));
		btnQuitter.setBounds(220, 378, 142, 59);
		contentPane.add(btnQuitter);
		
		JLabel lblImageDollars = new JLabel("");
		lblImageDollars.setIcon(new ImageIcon("D:\\Cours_SIO\\SLAM_JAVA_M.Perart\\Images pour graphique java\\billets.png"));
		lblImageDollars.setBounds(60, 365, 109, 71);
		contentPane.add(lblImageDollars);
		
		textSommeEuros = new JTextField();
		textSommeEuros.setBounds(145, 54, 96, 20);
		contentPane.add(textSommeEuros);
		textSommeEuros.setColumns(10);
	}
}