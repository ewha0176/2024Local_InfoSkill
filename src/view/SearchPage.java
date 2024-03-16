package view;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;

public class SearchPage {

	private JFrame frame;
	private JTextField SearchField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchPage window = new SearchPage();
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
	public SearchPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
        
		JPanel TitlePanel = new JPanel();
		
		JPanel SearchPanel = new JPanel();
		
		JPanel ResultPanel = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(ResultPanel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
						.addComponent(SearchPanel, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
						.addComponent(TitlePanel, GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SearchPanel, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(ResultPanel, GroupLayout.PREFERRED_SIZE, 346, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		SearchPanel.setLayout(null);
		
		JLabel SearchLabel = new JLabel("검색기준");
		SearchLabel.setBounds(0, 13, 48, 15);
		SearchPanel.add(SearchLabel);
		
		String[] standards = {"제목", "아티스트"};
		JComboBox<String> standardSelectBox = new JComboBox<>(standards);
		standardSelectBox.setBounds(53, 10, 75, 21);
		SearchPanel.add(standardSelectBox);
		
		SearchField = new JTextField();
		SearchField.setBounds(133, 10, 157, 21);
		SearchPanel.add(SearchField);
		SearchField.setColumns(10);
		
		JLabel SetStandardLabel = new JLabel("정렬기준");
		SetStandardLabel.setBounds(404, 32, 54, 15);
		SearchPanel.add(SetStandardLabel);
		
		String[] setStandards = {"오름차순", "내림차순"};
		JComboBox<String> SetStandardSelect = new JComboBox<>(setStandards);
		SetStandardSelect.setBounds(470, 29, 90, 21);
		SearchPanel.add(SetStandardSelect);
		
		JLabel SearchBtn = new JLabel("");
        SearchBtn.setIcon(new ImageIcon(new ImageIcon(SearchPage.class.getResource("/source/Search.png"))
            .getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
        SearchBtn.setBounds(291, 10, 20, 22);
		SearchPanel.add(SearchBtn);
		
		JLabel TitleLabel = new JLabel("음원검색");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 25));
		TitlePanel.add(TitleLabel);
		
		JList list = new JList();
		ResultPanel.add(list);
		frame.getContentPane().setLayout(groupLayout);
	}
}
