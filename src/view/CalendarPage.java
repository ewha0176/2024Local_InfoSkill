package view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;

public class CalendarPage {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarPage window = new CalendarPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalendarPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("날짜 선택");
		frame.setVisible(true);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
        
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_4 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_1.setLayout(null);
		
		JComboBox<String> YearSelectBox = new JComboBox<>();
		 for (int year = 1950; year <= 2024; year++) {
	            YearSelectBox.addItem(String.valueOf(year));
	        }
		YearSelectBox.setBounds(231, 10, 77, 23);
		panel_1.add(YearSelectBox);
		
		JLabel YearLabel = new JLabel("년     ");
		YearLabel.setBounds(313, 14, 32, 15);
		YearLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(YearLabel);
		
		JLabel MonthLabel = new JLabel("4월");
		MonthLabel.setBounds(350, 14, 18, 15);
		MonthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(MonthLabel);
		
		JButton PreviousBtn = new JButton("<");
		PreviousBtn.setBounds(373, 10, 41, 23);
		PreviousBtn.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(PreviousBtn);
		
		JButton NextBtn = new JButton(">");
		NextBtn.setBounds(419, 10, 41, 23);
		NextBtn.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(NextBtn);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.gridwidth = 6;
		gbc_panel_5.insets = new Insets(0, 0, 0, 5);
		gbc_panel_5.fill = GridBagConstraints.BOTH;
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 0;
		panel.add(panel_5, gbc_panel_5);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 6;
		gbc_panel_3.insets = new Insets(0, 0, 0, 5);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 6;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("날짜 선택");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 12;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		frame.getContentPane().setLayout(groupLayout);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel HomeLabel = new JLabel("");
        HomeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        HomeLabel.setIcon(new ImageIcon(new ImageIcon(LoginPage.class.getResource("/source/Main.png"))
            .getImage().getScaledInstance(120, 73, Image.SCALE_DEFAULT)));
        panel_2.add(HomeLabel);
        frame.getContentPane().setLayout(groupLayout);

        HomeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new main();
            }
        });
	}
}
