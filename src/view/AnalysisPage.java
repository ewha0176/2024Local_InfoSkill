package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
public class AnalysisPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnalysisPage window = new AnalysisPage();
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
	public AnalysisPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 550);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("통계");
        frame.setVisible(true);
        
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
		
		JPanel TitlePanel = new JPanel();
		
		JPanel SelectPanel = new JPanel();
		
		JPanel panel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
						.addComponent(SelectPanel, GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
						.addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SelectPanel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		String[] ages = {"10대", "20대", "30대", "40대", "50대", "60대", "70대 이상"};
		JComboBox<String> RangeSelectBox = new JComboBox<>(ages);
		GroupLayout gl_SelectPanel = new GroupLayout(SelectPanel);
		gl_SelectPanel.setHorizontalGroup(
			gl_SelectPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_SelectPanel.createSequentialGroup()
					.addContainerGap(463, Short.MAX_VALUE)
					.addComponent(RangeSelectBox, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
		);
		gl_SelectPanel.setVerticalGroup(
			gl_SelectPanel.createParallelGroup(Alignment.LEADING)
				.addComponent(RangeSelectBox, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
		);
		SelectPanel.setLayout(gl_SelectPanel);
		TitlePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel TitleLabel = new JLabel("연령별 TOP 5");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("굴림", Font.BOLD, 35));
		TitlePanel.add(TitleLabel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
