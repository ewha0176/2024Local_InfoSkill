package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PwPage {

	private JFrame frame;
	private JTextField SearchField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PwPage window = new PwPage();
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
	public PwPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 550);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(PwPage.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
        
		JPanel HeaderPanel = new JPanel();
		
		JPanel SearchPanel = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(HeaderPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
							.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE))
						.addComponent(SearchPanel, GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(HeaderPanel, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(SearchPanel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addContainerGap())
		);
		GridBagLayout gbl_SearchPanel = new GridBagLayout();
		gbl_SearchPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_SearchPanel.rowHeights = new int[]{0, 0};
		gbl_SearchPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_SearchPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		SearchPanel.setLayout(gbl_SearchPanel);
		
		JLabel ChooseLabel = new JLabel("선택");
		GridBagConstraints gbc_ChooseLabel = new GridBagConstraints();
		gbc_ChooseLabel.insets = new Insets(0, 0, 0, 5);
		gbc_ChooseLabel.gridx = 0;
		gbc_ChooseLabel.gridy = 0;
		SearchPanel.add(ChooseLabel, gbc_ChooseLabel);
		ChooseLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		SearchField = new JTextField("");
		GridBagConstraints gbc_SearchField = new GridBagConstraints();
		gbc_SearchField.insets = new Insets(0, 0, 0, 5);
		gbc_SearchField.gridx = 1;
		gbc_SearchField.gridy = 0;
		SearchPanel.add(SearchField, gbc_SearchField);
		SearchField.setHorizontalAlignment(SwingConstants.LEFT);
		SearchField.setColumns(10);
		
		JLabel ResetBtn = new JLabel("");
		GridBagConstraints gbc_ResetBtn = new GridBagConstraints();
		gbc_ResetBtn.insets = new Insets(0, 0, 0, 5);
		gbc_ResetBtn.gridx = 2;
		gbc_ResetBtn.gridy = 0;
		SearchPanel.add(ResetBtn, gbc_ResetBtn);
		ResetBtn.setIcon(new ImageIcon(new ImageIcon(PwPage.class.getResource("/source/Reset.png"))
	            .getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		
		JButton SelectBtn = new JButton("선택");
		SelectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_SelectBtn = new GridBagConstraints();
		gbc_SelectBtn.gridwidth = 4;
		gbc_SelectBtn.insets = new Insets(0, 0, 0, 5);
		gbc_SelectBtn.gridx = 3;
		gbc_SelectBtn.gridy = 0;
		SearchPanel.add(SelectBtn, gbc_SelectBtn);
		GridBagLayout gbl_HeaderPanel = new GridBagLayout();
		gbl_HeaderPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_HeaderPanel.rowHeights = new int[]{0, 0};
		gbl_HeaderPanel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_HeaderPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		HeaderPanel.setLayout(gbl_HeaderPanel);
		
		JPanel Blank = new JPanel();
		GridBagConstraints gbc_Blank = new GridBagConstraints();
		gbc_Blank.gridwidth = 2;
		gbc_Blank.insets = new Insets(0, 0, 0, 5);
		gbc_Blank.fill = GridBagConstraints.BOTH;
		gbc_Blank.gridx = 0;
		gbc_Blank.gridy = 0;
		HeaderPanel.add(Blank, gbc_Blank);
		
		JPanel TitlePanel = new JPanel();
		GridBagConstraints gbc_TitlePanel = new GridBagConstraints();
		gbc_TitlePanel.gridwidth = 9;
		gbc_TitlePanel.insets = new Insets(0, 0, 0, 5);
		gbc_TitlePanel.fill = GridBagConstraints.BOTH;
		gbc_TitlePanel.gridx = 2;
		gbc_TitlePanel.gridy = 0;
		HeaderPanel.add(TitlePanel, gbc_TitlePanel);
		TitlePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel TitleLabel = new JLabel("선호 POP SONG");
		TitleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		TitleLabel.setFont(new Font("굴림", Font.BOLD, 25));
		TitlePanel.add(TitleLabel);
		
		JPanel HomePanel = new JPanel();
		GridBagConstraints gbc_HomePanel = new GridBagConstraints();
		gbc_HomePanel.gridwidth = 2;
		gbc_HomePanel.fill = GridBagConstraints.BOTH;
		gbc_HomePanel.gridx = 11;
		gbc_HomePanel.gridy = 0;
		HeaderPanel.add(HomePanel, gbc_HomePanel);
		HomePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel HomeLabel = new JLabel("");
		HomeLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		HomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HomeLabel.setIcon(new ImageIcon(new ImageIcon(LoginPage.class.getResource("/source/Main.png"))
		    .getImage().getScaledInstance(100, 50, Image.SCALE_DEFAULT)));
		frame.getContentPane().setLayout(groupLayout);
		HomePanel.add(HomeLabel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
