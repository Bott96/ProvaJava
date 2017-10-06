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
	
	
	public myFrame() {
		super();

		P = new JPanel();
		B= new JButton("CliccamiThomas");
		
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
			
				JOptionPane optionPane = new JOptionPane("FACCIAMO QUALCOSA DI SIMPATICO",JOptionPane.WARNING_MESSAGE);
				JDialog dialog = optionPane.createDialog("TATATATAAAAAAAAAAA");
				dialog.setAlwaysOnTop(true); // to show top of all other application
				dialog.setVisible(true); // to visible the dialog
			}
		});
		P.add(B);
		
	}
	
}
