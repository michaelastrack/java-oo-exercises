package robot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Robotapp {

	private JFrame frmRobots;
	private DefaultListModel<Robot> listModel;
	public JList<Robot> RL;
	private JTextField textField;
	private JTextField DistField;
	private String S = "";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Robotapp window = new Robotapp();
					window.frmRobots.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Robotapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRobots = new JFrame();
		frmRobots.setTitle("Robots!");
		frmRobots.setBounds(100, 100, 687, 300);
		frmRobots.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		listModel = new DefaultListModel<Robot>();
		
		JButton btnCreateARobot = new JButton("Create a Robot");
		btnCreateARobot.setBounds(10, -3, 180, 30);
		btnCreateARobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//int selected = list.getSelectedIndex();
				int speed = (int)getPositiveValue ("What is the Robot's Speed?", "Speed Dialog");
				int xpos = (int)getPositiveValue ("What is the Robot's X-Position?", "X Position Dialog");
				int ypos = (int)getPositiveValue ("What is the Robot's Y-Position?", "Y Position Dialog");
				int[] pos = {xpos, ypos};
				int orient = (int)getPositiveValue ("What is the Robot's Orientation?", "Orientation Dialog");
				String name = (String)JOptionPane.showInputDialog(
						frmRobots,
						"What is the Robot's name?",
						"Name Dialog", JOptionPane.PLAIN_MESSAGE,
						null,
						null,
						""
						);
				Robot r = new Robot (name, speed, pos, orient);
				listModel.addElement(r);
			}
		});
		frmRobots.getContentPane().setLayout(null);
		frmRobots.getContentPane().add(btnCreateARobot);
		
		JButton btnMoveARobot = new JButton("Move a Robot");
		btnMoveARobot.setBounds(10, 22, 180, 30);
		btnMoveARobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(RL);
				int selected = RL.getSelectedIndex();
				System.out.println(selected);
				listModel.get(selected).move();
			}
			
		});
		frmRobots.getContentPane().add(btnMoveARobot);
		
		JButton btnRotateARobot = new JButton("Rotate a Robot");
		btnRotateARobot.setBounds(10, 51, 180, 30);
		btnRotateARobot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selected = RL.getSelectedIndex();
				int rotate = (int) getPositiveValue("How much do you want to rotate the Robot by?", "Rotation Dialogue");
				listModel.get(selected).rotate(rotate);
			}
		});
		frmRobots.getContentPane().add(btnRotateARobot);
		
		JButton btnComputeTheDistance = new JButton("Compute the distance between two Robots");
		btnComputeTheDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int first = RL.getSelectedIndex();
				int second = RL.getMaxSelectionIndex();
				Robot s = listModel.get(first);
				Robot t = listModel.get(second);
				int[] pos = {t.getXpos(), t.getYpos()};
				double dist = s.determineDist(pos);
				System.out.println(dist);
				S = Double.toString(dist);
				DistField.setText(S);
				
				
			}
		});
		btnComputeTheDistance.setBounds(10, 79, 180, 30);
		frmRobots.getContentPane().add(btnComputeTheDistance);
		
		RL = new JList<Robot>(listModel);
		RL.setBounds(200, 4, 461, 211);
		frmRobots.getContentPane().add(RL);
		
		DistField = new JTextField();
		DistField.setBounds(200, 226, 86, 20);
		frmRobots.getContentPane().add(DistField);
		DistField.setEditable(false);
		DistField.setText(S);
		DistField.setColumns(10);
		
	}
	
	private double getPositiveValue (String prompt, String title) {
		
		String s = (String)JOptionPane.showInputDialog(
				frmRobots,
				prompt,
				title, JOptionPane.PLAIN_MESSAGE,
				null,
				null,
				"");
		double sint = Double.parseDouble(s);
		/*
		while (sint < 0) {
			s = (String)JOptionPane.showInputDialog(
					frmRobots,
					prompt + "(Please enter a positive value)",
					title, JOptionPane.PLAIN_MESSAGE,
					null,
					null,
					"");
			sint = Double.parseDouble(s);
		} */
		return sint;
	}
}
