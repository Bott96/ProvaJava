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


	JButton B,B1,B2,B3,B4,B5;
	
	
	public myFrame() {
		super();

		P = new JPanel();
		B= new JButton("MiSeccaAggiugnereB5Ahahah");

		B1= new JButton("CliccaQuestoThomas");

		B2 = new JButton("CliccaQuestoSaso");
		B3 = new JButton("Vai qui");
		B4 = new JButton("Dopo di lei");
		B5 = new JButton("ok :-D");
		
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
			
				JOptionPane optionPane = new JOptionPane("Siiiii,Solo Convertire Java Swing",JOptionPane.WARNING_MESSAGE);
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
	
	B2.addActionListener(new ActionListener() {		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			JOptionPane optionPane = new JOptionPane("Intendi come progetto o per cazzi nostri?",JOptionPane.WARNING_MESSAGE);
			JDialog dialog = optionPane.createDialog("Warning!");
			dialog.setAlwaysOnTop(true); // to show top of all other application
			dialog.setVisible(true); // to visible the dialog
		}
	});
	
	
B3.addActionListener(new ActionListener() {		
		
		@Override
		public void actionPerformed(ActionEvent e) {
		
			JOptionPane optionPane = new JOptionPane("Cazzi Nostri, giusto per prendere confidenza con git  Ahahah",JOptionPane.WARNING_MESSAGE);
			JDialog dialog = optionPane.createDialog("Warning!");
			dialog.setAlwaysOnTop(true); // to show top of all other application
			dialog.setVisible(true); // to visible the dialog
		}
	});

B4.addActionListener(new ActionListener() {		
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		JOptionPane optionPane = new JOptionPane("Ok poi un giorno di questi a lezione cerchiamo come convertire swing in android\n senn� ci tocca impararlo e non so se riusciamo a trovare il tempo",JOptionPane.WARNING_MESSAGE);
		JDialog dialog = optionPane.createDialog("Warning!");
		dialog.setAlwaysOnTop(true); // to show top of all other application
		dialog.setVisible(true); // to visible the dialog
	}
});
B5.addActionListener(new ActionListener() {		
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		JOptionPane optionPane = new JOptionPane("This Button not fa nu cazz",JOptionPane.WARNING_MESSAGE);
		JDialog dialog = optionPane.createDialog("Warning!");
		dialog.setAlwaysOnTop(true); // to show top of all other application
		dialog.setVisible(true); // to visible the dialog
	}
});
	
	P.add(B);
	P.add(B1);
	P.add(B2);
	P.add(B3);
	P.add(B4);
	P.add(B5);
		
	}
	
}
