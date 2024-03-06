package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;


public class LoginPage {

	private JFrame frame;
	private JTextField PwField;
	private JTextField IdField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
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
	public LoginPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setPreferredSize(new Dimension(500,300));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("로그인");
		frame.setIconImage(new ImageIcon("/information_technology/src/asset/마이크.png").getImage());
		
		JPanel TitlePanel = new JPanel();
		
		JPanel FormPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(FormPanel, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(FormPanel, GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
		);
		FormPanel.setLayout(null);
		
		JLabel IdLabel = new JLabel("ID");
		IdLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 23));
		IdLabel.setBounds(65, 10, 57, 46);
		FormPanel.add(IdLabel);
		
		JLabel PwLabel = new JLabel("PW");
		PwLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 23));
		PwLabel.setBounds(65, 66, 57, 46);
		FormPanel.add(PwLabel);
		
		IdField = new JTextField();
		IdField.setText("");
		IdField.setColumns(10);
		IdField.setBounds(122, 10, 269, 46);
		FormPanel.add(IdField);
		
		PwField = new JTextField();
		PwField.setText("");
		PwField.setBounds(122, 66, 269, 46);
		FormPanel.add(PwField);
		PwField.setColumns(10);
		
		JButton LoginBtn = new JButton("로그인");
		LoginBtn.setBounds(122, 122, 269, 45);
		FormPanel.add(LoginBtn);
		TitlePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel LoginLabel = new JLabel("로그인");
		LoginLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 35));
		TitlePanel.add(LoginLabel);
		frame.getContentPane().setLayout(groupLayout);
	}
}