package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.*;

public class RegisterPage {

	private JFrame frame;
	private JTextField BirthField;
	private JTextField NameField;
	private JTextField IdField;
	private JTextField PwField;

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

	public RegisterPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("회원가입");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
        
		frame.getContentPane().setLayout(new GridLayout(6, 1, 0, 0));
		
		JPanel HeaderPanel = new JPanel();
		frame.getContentPane().add(HeaderPanel);
		GridBagLayout gbl_HeaderPanel = new GridBagLayout();
		gbl_HeaderPanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_HeaderPanel.rowHeights = new int[]{0, 0};
		gbl_HeaderPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_HeaderPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		HeaderPanel.setLayout(gbl_HeaderPanel);
		
		JPanel TItlePanel = new JPanel();
		GridBagConstraints gbc_TItlePanel = new GridBagConstraints();
		gbc_TItlePanel.gridwidth = 11;
		gbc_TItlePanel.insets = new Insets(0, 0, 0, 5);
		gbc_TItlePanel.fill = GridBagConstraints.BOTH;
		gbc_TItlePanel.gridx = 0;
		gbc_TItlePanel.gridy = 0;
		HeaderPanel.add(TItlePanel, gbc_TItlePanel);
		TItlePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel TitleLabel = new JLabel("회원가입");
		TitleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		TitleLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		TItlePanel.add(TitleLabel);
		
		JPanel HomePanel = new JPanel();
		HomePanel.setLayout(null);
		GridBagConstraints gbc_HomePanel = new GridBagConstraints();
		gbc_HomePanel.gridwidth = 6;
		gbc_HomePanel.fill = GridBagConstraints.BOTH;
		gbc_HomePanel.gridx = 13;
		gbc_HomePanel.gridy = 0;
		HeaderPanel.add(HomePanel, gbc_HomePanel);
		
		JLabel HomeBtn = new JLabel("");
		HomeBtn.setHorizontalAlignment(SwingConstants.RIGHT);
		HomeBtn.setBounds(5, -3, 212, 81);
		HomeBtn.setIcon(new ImageIcon(new ImageIcon(RegisterPage.class.getResource("/source/Main.png"))
		    .getImage().getScaledInstance(120, 73, Image.SCALE_DEFAULT)));
		HomePanel.add(HomeBtn);

		HomeBtn.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        frame.setVisible(false);
		        new main();
		    }
		});

		
		JPanel NamePanel = new JPanel();
		frame.getContentPane().add(NamePanel);
		GridBagLayout gbl_NamePanel = new GridBagLayout();
		gbl_NamePanel.columnWidths = new int[]{30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0};
		gbl_NamePanel.rowHeights = new int[]{0, 0};
		gbl_NamePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_NamePanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		NamePanel.setLayout(gbl_NamePanel);
		
		JLabel NameLabel = new JLabel("이름");
		NameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_NameLabel = new GridBagConstraints();
		gbc_NameLabel.gridwidth = 3;
		gbc_NameLabel.insets = new Insets(0, 0, 0, 5);
		gbc_NameLabel.gridx = 0;
		gbc_NameLabel.gridy = 0;
		NamePanel.add(NameLabel, gbc_NameLabel);
		
		JPanel NameFieldPanel = new JPanel();
		GridBagConstraints gbc_NameFieldPanel = new GridBagConstraints();
		gbc_NameFieldPanel.fill = GridBagConstraints.BOTH;
		gbc_NameFieldPanel.gridwidth = 8;
		gbc_NameFieldPanel.insets = new Insets(0, 0, 0, 5);
		gbc_NameFieldPanel.gridx = 3;
		gbc_NameFieldPanel.gridy = 0;
		NamePanel.add(NameFieldPanel, gbc_NameFieldPanel);
		
		NameField = new JTextField();
		NameField.setColumns(10);
		GroupLayout gl_NameFieldPanel = new GroupLayout(NameFieldPanel);
		gl_NameFieldPanel.setHorizontalGroup(
			gl_NameFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_NameFieldPanel.createSequentialGroup()
					.addComponent(NameField, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_NameFieldPanel.setVerticalGroup(
			gl_NameFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_NameFieldPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(NameField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		NameFieldPanel.setLayout(gl_NameFieldPanel);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.gridx = 11;
		gbc_panel_1.gridy = 0;
		NamePanel.add(panel_1, gbc_panel_1);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel CalendarLabel_1 = new JLabel("");
		panel_1.add(CalendarLabel_1);
		
		JPanel BirthPanel = new JPanel();
		frame.getContentPane().add(BirthPanel);
		GridBagLayout gbl_BirthPanel = new GridBagLayout();
		gbl_BirthPanel.columnWidths = new int[]{30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0};
		gbl_BirthPanel.rowHeights = new int[]{0, 0};
		gbl_BirthPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_BirthPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		BirthPanel.setLayout(gbl_BirthPanel);
		
		JLabel BirthLabel = new JLabel("생년월일");
		BirthLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_BirthLabel = new GridBagConstraints();
		gbc_BirthLabel.gridwidth = 3;
		gbc_BirthLabel.insets = new Insets(0, 0, 0, 5);
		gbc_BirthLabel.gridx = 0;
		gbc_BirthLabel.gridy = 0;
		BirthPanel.add(BirthLabel, gbc_BirthLabel);
		
		JPanel BirthFieldPanel = new JPanel();
		GridBagConstraints gbc_BirthFieldPanel = new GridBagConstraints();
		gbc_BirthFieldPanel.fill = GridBagConstraints.BOTH;
		gbc_BirthFieldPanel.gridwidth = 8;
		gbc_BirthFieldPanel.insets = new Insets(0, 0, 0, 5);
		gbc_BirthFieldPanel.gridx = 3;
		gbc_BirthFieldPanel.gridy = 0;
		BirthPanel.add(BirthFieldPanel, gbc_BirthFieldPanel);
		
		BirthField = new JTextField();
		BirthField.setColumns(10);
		GroupLayout gl_BirthFieldPanel = new GroupLayout(BirthFieldPanel);
		gl_BirthFieldPanel.setHorizontalGroup(
			gl_BirthFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BirthFieldPanel.createSequentialGroup()
					.addComponent(BirthField, GroupLayout.PREFERRED_SIZE, 437, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_BirthFieldPanel.setVerticalGroup(
			gl_BirthFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BirthFieldPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(BirthField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		BirthFieldPanel.setLayout(gl_BirthFieldPanel);
		
		JPanel CalendarPanel = new JPanel();
		GridBagConstraints gbc_CalendarPanel = new GridBagConstraints();
		gbc_CalendarPanel.gridwidth = 3;
		gbc_CalendarPanel.insets = new Insets(0, 0, 0, 5);
		gbc_CalendarPanel.fill = GridBagConstraints.BOTH;
		gbc_CalendarPanel.gridx = 11;
		gbc_CalendarPanel.gridy = 0;
		BirthPanel.add(CalendarPanel, gbc_CalendarPanel);
		CalendarPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel BirthBtn = new JLabel("");
		BirthBtn.setIcon(new ImageIcon(RegisterPage.class.getResource("/source/Calendar.png")));
		CalendarPanel.add(BirthBtn);
		
		
		JPanel IdPanel = new JPanel();
		frame.getContentPane().add(IdPanel);
		GridBagLayout gbl_IdPanel = new GridBagLayout();
		gbl_IdPanel.columnWidths = new int[]{30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0};
		gbl_IdPanel.rowHeights = new int[]{0, 0};
		gbl_IdPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_IdPanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		IdPanel.setLayout(gbl_IdPanel);
		
		JLabel IdLabel = new JLabel("ID");
		IdLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_IdLabel = new GridBagConstraints();
		gbc_IdLabel.gridwidth = 3;
		gbc_IdLabel.insets = new Insets(0, 0, 0, 5);
		gbc_IdLabel.gridx = 0;
		gbc_IdLabel.gridy = 0;
		IdPanel.add(IdLabel, gbc_IdLabel);
		
		JPanel IdFieldPanel = new JPanel();
		GridBagConstraints gbc_IdFieldPanel = new GridBagConstraints();
		gbc_IdFieldPanel.fill = GridBagConstraints.BOTH;
		gbc_IdFieldPanel.gridwidth = 8;
		gbc_IdFieldPanel.insets = new Insets(0, 0, 0, 5);
		gbc_IdFieldPanel.gridx = 3;
		gbc_IdFieldPanel.gridy = 0;
		IdPanel.add(IdFieldPanel, gbc_IdFieldPanel);
		
		IdField = new JTextField();
		IdField.setColumns(10);
		GroupLayout gl_IdFieldPanel = new GroupLayout(IdFieldPanel);
		gl_IdFieldPanel.setHorizontalGroup(
			gl_IdFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IdFieldPanel.createSequentialGroup()
					.addComponent(IdField, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_IdFieldPanel.setVerticalGroup(
			gl_IdFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_IdFieldPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(IdField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		IdFieldPanel.setLayout(gl_IdFieldPanel);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridwidth = 3;
		gbc_panel_2.gridx = 11;
		gbc_panel_2.gridy = 0;
		IdPanel.add(panel_2, gbc_panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel CalendarLabel_2 = new JLabel("");
		panel_2.add(CalendarLabel_2);
		
		JPanel BirthPanel_3 = new JPanel();
		frame.getContentPane().add(BirthPanel_3);
		GridBagLayout gbl_BirthPanel_3 = new GridBagLayout();
		gbl_BirthPanel_3.columnWidths = new int[]{30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0};
		gbl_BirthPanel_3.rowHeights = new int[]{0, 0};
		gbl_BirthPanel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_BirthPanel_3.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		BirthPanel_3.setLayout(gbl_BirthPanel_3);
		
		JLabel PwLabel = new JLabel("PW");
		PwLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		GridBagConstraints gbc_PwLabel = new GridBagConstraints();
		gbc_PwLabel.gridwidth = 3;
		gbc_PwLabel.insets = new Insets(0, 0, 0, 5);
		gbc_PwLabel.gridx = 0;
		gbc_PwLabel.gridy = 0;
		BirthPanel_3.add(PwLabel, gbc_PwLabel);
		
		JPanel PwFieldPanel = new JPanel();
		GridBagConstraints gbc_PwFieldPanel = new GridBagConstraints();
		gbc_PwFieldPanel.fill = GridBagConstraints.BOTH;
		gbc_PwFieldPanel.gridwidth = 8;
		gbc_PwFieldPanel.insets = new Insets(0, 0, 0, 5);
		gbc_PwFieldPanel.gridx = 3;
		gbc_PwFieldPanel.gridy = 0;
		BirthPanel_3.add(PwFieldPanel, gbc_PwFieldPanel);
		
		PwField = new JTextField();
		PwField.setColumns(10);
		GroupLayout gl_PwFieldPanel = new GroupLayout(PwFieldPanel);
		gl_PwFieldPanel.setHorizontalGroup(
			gl_PwFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PwFieldPanel.createSequentialGroup()
					.addComponent(PwField, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_PwFieldPanel.setVerticalGroup(
			gl_PwFieldPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PwFieldPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(PwField, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		PwFieldPanel.setLayout(gl_PwFieldPanel);
		
		JPanel MicPanel = new JPanel();
		GridBagConstraints gbc_MicPanel = new GridBagConstraints();
		gbc_MicPanel.insets = new Insets(0, 0, 0, 5);
		gbc_MicPanel.fill = GridBagConstraints.BOTH;
		gbc_MicPanel.gridwidth = 3;
		gbc_MicPanel.gridx = 11;
		gbc_MicPanel.gridy = 0;
		BirthPanel_3.add(MicPanel, gbc_MicPanel);
		MicPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel PwBtn = new JLabel("");
		PwBtn.setIcon(new ImageIcon(RegisterPage.class.getResource("/source/Mic.png")));
		MicPanel.add(PwBtn);
		
		JPanel BirthPanel_4 = new JPanel();
		frame.getContentPane().add(BirthPanel_4);
		GridBagLayout gbl_BirthPanel_4 = new GridBagLayout();
		gbl_BirthPanel_4.columnWidths = new int[]{30, 30, 30, 0, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 0};
		gbl_BirthPanel_4.rowHeights = new int[]{0, 0};
		gbl_BirthPanel_4.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_BirthPanel_4.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		BirthPanel_4.setLayout(gbl_BirthPanel_4);
		
		JPanel BtnPanel = new JPanel();
		GridBagConstraints gbc_BtnPanel = new GridBagConstraints();
		gbc_BtnPanel.fill = GridBagConstraints.BOTH;
		gbc_BtnPanel.gridwidth = 8;
		gbc_BtnPanel.insets = new Insets(0, 0, 0, 5);
		gbc_BtnPanel.gridx = 3;
		gbc_BtnPanel.gridy = 0;
		BirthPanel_4.add(BtnPanel, gbc_BtnPanel);
		
		JButton RegisterBtn = new JButton("회원가입");
		RegisterBtn.setFont(new Font("굴림", Font.PLAIN, 30));
		GroupLayout gl_BtnPanel = new GroupLayout(BtnPanel);
		gl_BtnPanel.setHorizontalGroup(
			gl_BtnPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_BtnPanel.createSequentialGroup()
					.addGap(1)
					.addComponent(RegisterBtn, GroupLayout.PREFERRED_SIZE, 433, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE))
		);
		gl_BtnPanel.setVerticalGroup(
			gl_BtnPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_BtnPanel.createSequentialGroup()
					.addGap(16)
					.addComponent(RegisterBtn, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		BtnPanel.setLayout(gl_BtnPanel);
		RegisterBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	                String name = NameField.getText();
	                String birth = BirthField.getText();
	                String id = IdField.getText();
	                String password = PwField.getText();

	                if (name.isEmpty() || birth.isEmpty() || id.isEmpty() || password.isEmpty()) {
	                    JOptionPane.showMessageDialog(frame, "빈칸이 있습니다.", "경고", JOptionPane.WARNING_MESSAGE);
	                    return;
	                }

	                JOptionPane.showMessageDialog(frame, "회원가입이 완료되었습니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
	                frame.setVisible(false);
	                new main(); 
			}
		});
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.insets = new Insets(0, 0, 0, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridwidth = 3;
		gbc_panel_4.gridx = 11;
		gbc_panel_4.gridy = 0;
		BirthPanel_4.add(panel_4, gbc_panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel CalendarLabel_4 = new JLabel("");
		panel_4.add(CalendarLabel_4);
		BirthBtn.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        frame.setVisible(false);
		        new CalendarPage();
		    }
		});
		
	}
}
