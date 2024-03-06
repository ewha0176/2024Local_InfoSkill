package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.ComponentPlacement;

public class InfoPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoPage window = new InfoPage();
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
	public InfoPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700,500);
		frame.setPreferredSize(new Dimension(700,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("메인");
		
		JPanel panel = new JPanel();
		
		JProgressBar PlayBar = new JProgressBar();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(PlayBar, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 343, Short.MAX_VALUE)
					.addComponent(PlayBar, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel TitleLabel = new JLabel("음원상세정보");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 35));
		panel.add(TitleLabel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
