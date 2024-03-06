 package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;

public class RegisterPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage window = new RegisterPage();
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
	public RegisterPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel TitlePanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(TitlePanel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(194, Short.MAX_VALUE))
		);
		TitlePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel TitleLabel = new JLabel("회원가입");
		TitleLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 35));
		TitleLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitlePanel.add(TitleLabel);
		frame.getContentPane().setLayout(groupLayout);
	}

}
