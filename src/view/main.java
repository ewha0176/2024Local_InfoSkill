package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.event.*;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700,500);
		frame.setPreferredSize(new Dimension(700,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("메인");
        
        //Frame 아이콘 변경
        Image img = kit.getImage("../asset/마이크.png");
        frame.setIconImage(img);
		
		JPanel TitlePanel = new JPanel();
		
		JPanel BtnPanel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
						.addComponent(TitlePanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
						.addComponent(BtnPanel, GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(BtnPanel, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
					.addContainerGap())
		);
		TitlePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel TitleLabel = new JLabel("SKILL MUSIC(OLD POP SONG)");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 25));
		TitlePanel.add(TitleLabel);
		
		JButton LoginBtn = new JButton("로그인");
		LoginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new LoginPage();
			}
		});
		BtnPanel.setLayout(new GridLayout(0, 5, 0, 0));
		BtnPanel.add(LoginBtn);
		
		JButton JoinBtn = new JButton("회원가입");
		BtnPanel.add(JoinBtn);
		
		JButton SearchBtn = new JButton("음원검색");
		BtnPanel.add(SearchBtn);
		SearchBtn.setEnabled(false);
		
		JButton MineBtn = new JButton("마이페이지");
		BtnPanel.add(MineBtn);
		MineBtn.setEnabled(false);
		
		JButton AnalBtn = new JButton("분석");
		BtnPanel.add(AnalBtn);
		frame.getContentPane().setLayout(groupLayout);
	}
}
