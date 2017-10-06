package Casa;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class myFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2889065122470823581L;

	
	
	JPanel P;
	JButton B;

	JButton B1;
	
	
	public myFrame() {
		super();

		P = new JPanel();
		B= new JButton("CliccamiSaso");

		B1= new JButton("CliccaQuestoThomas");
		
		this.setTitle("Checcah");
		
		this.setLocation(300, 300);
		
		Toolkit TK = Toolkit.getDefaultToolkit();
		
		Dimension d= TK.getScreenSize();
		this.setSize(d.width/2,d.height/2);
		
		Color c= new Color(10,100,100);
		
		this.setBackground(c);
		this.setContentPane(P);
		
		B.addActionListener(new ActionListener() {
			
		
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane optionPane = new JOptionPane("TIPO COSAAAAAA?!?!?!?!?",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Warning!");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog
			}
		});
		
		
		
	B1.addActionListener(new ActionListener() {
			
		
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				JOptionPane optionPane = new JOptionPane("Qualcosa di carino per usare java swing su android",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("Warning!");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog
			}
		});
	P.add(B);
	P.add(B1);
		
	}
	
}
