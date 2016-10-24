package javagram;

import java.awt.EventQueue;
import javagram.filters.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JavagramApp {

	private JFrame frame;
	private JTextField textField;
	String[] baseParts = {System.getProperty("user.dir"), "images"};
	String dir = String.join(File.separator, baseParts);
	String filename = "";
	String imagePath;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavagramApp window = new JavagramApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavagramApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 621, 343);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 605, 10);
		frame.getContentPane().add(panel);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 276, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBlueFilter = new JButton("Blue Filter");
		btnBlueFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				filename = textField.getText();
				//System.out.println(filename);
				imagePath = (dir + "\\" + filename);
				//System.out.println(imagePath);
				Picture p = new Picture(imagePath);
				Filter BFilter = new BlueFilter();
				Picture out = BFilter.process(p);
				out.show();
			}
		});
		btnBlueFilter.setBounds(0, 34, 141, 28);
		frame.getContentPane().add(btnBlueFilter);
		
		JButton btnRedFilter = new JButton("Red Filter");
		btnRedFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				imagePath = (dir + "\\" + filename);
				Picture p = new Picture(imagePath);
				Filter RFilter = new RedFilter();
				Picture out = RFilter.process(p);
				out.show();
				
			}
		});
		btnRedFilter.setBounds(0, 61, 141, 28);
		frame.getContentPane().add(btnRedFilter);
		
		JButton btnGreenFilter = new JButton("Green Filter");
		btnGreenFilter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				imagePath = (dir + "\\" + filename);
				Picture p = new Picture(imagePath);
				Filter GFilter = new GreenFilter();
				Picture out = GFilter.process(p);
				out.show();			
				
			}
		});
		btnGreenFilter.setBounds(0, 89, 141, 34);
		frame.getContentPane().add(btnGreenFilter);
		
		JButton btnMirrorHorizontal = new JButton("Mirror Horizontal");
		btnMirrorHorizontal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				imagePath = (dir + "\\" + filename);
				Picture p = new Picture(imagePath);
				Filter FHFilter = new FlipHorizontal();
				Picture out = FHFilter.process(p);
				out.show();
			}
		});
		btnMirrorHorizontal.setBounds(0, 123, 141, 34);
		frame.getContentPane().add(btnMirrorHorizontal);
		
		JButton btnMirrorVertical = new JButton("Mirror Vertical");
		btnMirrorVertical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				imagePath = (dir + "\\" + filename);
				Picture p = new Picture(imagePath);
				Filter FVFilter = new FlipVertical();
				Picture out = FVFilter.process(p);
				out.show();
			}
		});
		btnMirrorVertical.setBounds(0, 156, 141, 34);
		frame.getContentPane().add(btnMirrorVertical);
		
		JButton btnRotateDegrees = new JButton("Rotate 180 degrees ");
		btnRotateDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				imagePath = (dir + "\\" + filename);
				Picture p = new Picture(imagePath);
				Filter FDFilter = new FlipDiagnol();
				Picture out = FDFilter.process(p);
				out.show();
			}
		});
		btnRotateDegrees.setBounds(0, 189, 141, 34);
		frame.getContentPane().add(btnRotateDegrees);
		
		JButton btnBrighten = new JButton("Brighten");
		btnBrighten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				filename = textField.getText();
				imagePath = (dir + "\\" + filename);
				Picture p = new Picture(imagePath);
				Filter BRFilter = new BrightFilter();
				Picture out = BRFilter.process(p);
				out.show();
			}
		});
		btnBrighten.setBounds(0, 224, 141, 28);
		frame.getContentPane().add(btnBrighten);

	}
}
