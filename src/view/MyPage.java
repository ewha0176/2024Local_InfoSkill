package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;

public class MyPage { 

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPage window = new MyPage();
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
	public MyPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
        
		JPanel TitlePanel = new JPanel();
		
		JPanel EdiPanel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
						.addComponent(TitlePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
						.addComponent(EdiPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(EdiPanel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel NameLabel = new JLabel("홍길동 님");
		NameLabel.setBounds(209, 5, 109, 34);
		NameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		NameLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		NameLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		
		JButton btnNewButton = new JButton("회원 정보수정");
		btnNewButton.setBounds(323, 7, 127, 29);
		btnNewButton.setHorizontalAlignment(SwingConstants.RIGHT);
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		EdiPanel.setLayout(null);
		EdiPanel.add(NameLabel);
		EdiPanel.add(btnNewButton);
		
		JLabel TitleLabel = new JLabel("마이페이지");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("맑은 고딕 Semilight", Font.PLAIN, 30));
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon(MyPage.class.getResource("/source/Main.png"))
			    .getImage().getScaledInstance(120, 80, Image.SCALE_DEFAULT)));

		panel.add(lblNewLabel);
		GroupLayout gl_TitlePanel = new GroupLayout(TitlePanel);
		gl_TitlePanel.setHorizontalGroup(
			gl_TitlePanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_TitlePanel.createSequentialGroup()
					.addComponent(TitleLabel, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
		);
		gl_TitlePanel.setVerticalGroup(
			gl_TitlePanel.createParallelGroup(Alignment.LEADING)
				.addComponent(TitleLabel, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
		);
		TitlePanel.setLayout(gl_TitlePanel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
