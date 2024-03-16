package view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;

public class InfoPage {

	private JFrame frame;

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

	public InfoPage() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 779,530);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("메인");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);
        
		JPanel panel = new JPanel();
		
		JProgressBar PlayBar = new JProgressBar();
		
		JPanel NamePanel = new JPanel();
		
		JLabel lblNewLabel_2 = new JLabel("img");
		lblNewLabel_2.setIcon(new ImageIcon(InfoPage.class.getResource("/album/1.jpg")));
		
		JPanel panel_3 = new JPanel();
		
		JPanel BtnPanel = new JPanel();
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(InfoPage.class.getResource("/source/Stop.png")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(PlayBar, GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_5))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(NamePanel, GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)))
					.addGap(43))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addComponent(BtnPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 496, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(83, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(NamePanel, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(30)
					.addComponent(BtnPanel, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_5)
						.addComponent(PlayBar, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
		);
		BtnPanel.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(276, 0, 122, 31);
		BtnPanel.add(panel_9);
		panel_9.setLayout(new CardLayout(0, 0));
		
		JButton FavorPanel = new JButton("담기");
		panel_9.add(FavorPanel, "name_745179395586100");
		
		JPanel PlayPanel = new JPanel();
		PlayPanel.setBounds(403, 0, 150, 31);
		BtnPanel.add(PlayPanel);
		PlayPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton PlayBtn = new JButton("듣기");
		PlayPanel.add(PlayBtn);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JPanel ArtistPanel = new JPanel();
		GridBagConstraints gbc_ArtistPanel = new GridBagConstraints();
		gbc_ArtistPanel.insets = new Insets(0, 0, 5, 5);
		gbc_ArtistPanel.fill = GridBagConstraints.BOTH;
		gbc_ArtistPanel.gridx = 0;
		gbc_ArtistPanel.gridy = 0;
		panel_3.add(ArtistPanel, gbc_ArtistPanel);
		ArtistPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ArtistLabel = new JLabel("아티스트");
		ArtistPanel.add(ArtistLabel);
		
		JPanel ArtistNamePanel = new JPanel();
		GridBagConstraints gbc_ArtistNamePanel = new GridBagConstraints();
		gbc_ArtistNamePanel.gridwidth = 6;
		gbc_ArtistNamePanel.insets = new Insets(0, 0, 5, 0);
		gbc_ArtistNamePanel.fill = GridBagConstraints.BOTH;
		gbc_ArtistNamePanel.gridx = 1;
		gbc_ArtistNamePanel.gridy = 0;
		panel_3.add(ArtistNamePanel, gbc_ArtistNamePanel);
		ArtistNamePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel AristNameLabel = new JLabel("The Beatles(비틀스)");
		ArtistNamePanel.add(AristNameLabel);
		
		JPanel LyricPanel = new JPanel();
		GridBagConstraints gbc_LyricPanel = new GridBagConstraints();
		gbc_LyricPanel.insets = new Insets(0, 0, 5, 5);
		gbc_LyricPanel.fill = GridBagConstraints.BOTH;
		gbc_LyricPanel.gridx = 0;
		gbc_LyricPanel.gridy = 1;
		panel_3.add(LyricPanel, gbc_LyricPanel);
		LyricPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel LyricLabel = new JLabel("작사");
		LyricPanel.add(LyricLabel);
		
		JPanel LyricNamePanel = new JPanel();
		GridBagConstraints gbc_LyricNamePanel = new GridBagConstraints();
		gbc_LyricNamePanel.gridwidth = 6;
		gbc_LyricNamePanel.insets = new Insets(0, 0, 5, 0);
		gbc_LyricNamePanel.fill = GridBagConstraints.BOTH;
		gbc_LyricNamePanel.gridx = 1;
		gbc_LyricNamePanel.gridy = 1;
		panel_3.add(LyricNamePanel, gbc_LyricNamePanel);
		LyricNamePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel LyricNameLabel = new JLabel("");
		LyricNamePanel.add(LyricNameLabel);
		
		JPanel ComposerPanel = new JPanel();
		GridBagConstraints gbc_ComposerPanel = new GridBagConstraints();
		gbc_ComposerPanel.insets = new Insets(0, 0, 5, 5);
		gbc_ComposerPanel.fill = GridBagConstraints.BOTH;
		gbc_ComposerPanel.gridx = 0;
		gbc_ComposerPanel.gridy = 2;
		panel_3.add(ComposerPanel, gbc_ComposerPanel);
		ComposerPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ComposerLabel = new JLabel("작곡");
		ComposerPanel.add(ComposerLabel);
		
		JPanel ComposerNamePanel = new JPanel();
		GridBagConstraints gbc_ComposerNamePanel = new GridBagConstraints();
		gbc_ComposerNamePanel.gridwidth = 6;
		gbc_ComposerNamePanel.insets = new Insets(0, 0, 5, 0);
		gbc_ComposerNamePanel.fill = GridBagConstraints.BOTH;
		gbc_ComposerNamePanel.gridx = 1;
		gbc_ComposerNamePanel.gridy = 2;
		panel_3.add(ComposerNamePanel, gbc_ComposerNamePanel);
		ComposerNamePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel ComposerNameLabel = new JLabel("RedOne");
		ComposerNamePanel.add(ComposerNameLabel);
		
		JPanel AlbumPanel = new JPanel();
		GridBagConstraints gbc_AlbumPanel = new GridBagConstraints();
		gbc_AlbumPanel.insets = new Insets(0, 0, 5, 5);
		gbc_AlbumPanel.fill = GridBagConstraints.BOTH;
		gbc_AlbumPanel.gridx = 0;
		gbc_AlbumPanel.gridy = 3;
		panel_3.add(AlbumPanel, gbc_AlbumPanel);
		AlbumPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel AlbumLabel = new JLabel("앨범");
		AlbumPanel.add(AlbumLabel);
		
		JPanel AlbumNamePanel = new JPanel();
		GridBagConstraints gbc_AlbumNamePanel = new GridBagConstraints();
		gbc_AlbumNamePanel.gridwidth = 6;
		gbc_AlbumNamePanel.insets = new Insets(0, 0, 5, 0);
		gbc_AlbumNamePanel.fill = GridBagConstraints.BOTH;
		gbc_AlbumNamePanel.gridx = 1;
		gbc_AlbumNamePanel.gridy = 3;
		panel_3.add(AlbumNamePanel, gbc_AlbumNamePanel);
		AlbumNamePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel AlbumNameLabel = new JLabel("1 (Remastered)");
		AlbumNamePanel.add(AlbumNameLabel);
		
		JPanel TimePanel = new JPanel();
		GridBagConstraints gbc_TimePanel = new GridBagConstraints();
		gbc_TimePanel.insets = new Insets(0, 0, 5, 5);
		gbc_TimePanel.fill = GridBagConstraints.BOTH;
		gbc_TimePanel.gridx = 0;
		gbc_TimePanel.gridy = 4;
		panel_3.add(TimePanel, gbc_TimePanel);
		TimePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel TimeLabel = new JLabel("재생시간");
		TimePanel.add(TimeLabel);
		
		JPanel TimeNamePanel = new JPanel();
		GridBagConstraints gbc_TimeNamePanel = new GridBagConstraints();
		gbc_TimeNamePanel.gridwidth = 6;
		gbc_TimeNamePanel.insets = new Insets(0, 0, 5, 0);
		gbc_TimeNamePanel.fill = GridBagConstraints.BOTH;
		gbc_TimeNamePanel.gridx = 1;
		gbc_TimeNamePanel.gridy = 4;
		panel_3.add(TimeNamePanel, gbc_TimeNamePanel);
		TimeNamePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel TimeLinePanel = new JLabel("04:19:00");
		TimeNamePanel.add(TimeLinePanel);
		
		JPanel SoundPanel = new JPanel();
		GridBagConstraints gbc_SoundPanel = new GridBagConstraints();
		gbc_SoundPanel.insets = new Insets(0, 0, 0, 5);
		gbc_SoundPanel.fill = GridBagConstraints.BOTH;
		gbc_SoundPanel.gridx = 0;
		gbc_SoundPanel.gridy = 5;
		panel_3.add(SoundPanel, gbc_SoundPanel);
		SoundPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel SoundLabel = new JLabel("음질");
		SoundPanel.add(SoundLabel);
		
		JPanel SoundNamePanel = new JPanel();
		GridBagConstraints gbc_SoundNamePanel = new GridBagConstraints();
		gbc_SoundNamePanel.gridwidth = 6;
		gbc_SoundNamePanel.fill = GridBagConstraints.BOTH;
		gbc_SoundNamePanel.gridx = 1;
		gbc_SoundNamePanel.gridy = 5;
		panel_3.add(SoundNamePanel, gbc_SoundNamePanel);
		SoundNamePanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel SoundNameLabel = new JLabel("FLAC 44.1khz 16bit");
		SoundNamePanel.add(SoundNameLabel);
		GridBagLayout gbl_NamePanel = new GridBagLayout();
		gbl_NamePanel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_NamePanel.rowHeights = new int[]{0, 0};
		gbl_NamePanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_NamePanel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		NamePanel.setLayout(gbl_NamePanel);
		
		JLabel NameLabel = new JLabel("All You Need Is Love (Remastered 2015)");
		NameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		NameLabel.setFont(new Font("굴림", Font.BOLD, 25));
		GridBagConstraints gbc_NameLabel = new GridBagConstraints();
		gbc_NameLabel.gridwidth = 18;
		gbc_NameLabel.insets = new Insets(0, 0, 0, 5);
		gbc_NameLabel.gridx = 1;
		gbc_NameLabel.gridy = 0;
		NamePanel.add(NameLabel, gbc_NameLabel);
		
		JPanel HomePanel = new JPanel();
		GridBagConstraints gbc_HomePanel = new GridBagConstraints();
		gbc_HomePanel.fill = GridBagConstraints.BOTH;
		gbc_HomePanel.gridx = 19;
		gbc_HomePanel.gridy = 0;
		NamePanel.add(HomePanel, gbc_HomePanel);
		HomePanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel HomeLabel = new JLabel("");
		HomeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		HomeLabel.setIcon(new ImageIcon(new ImageIcon(InfoPage.class.getResource("/source/Main.png"))
		    .getImage().getScaledInstance(120, 70, Image.SCALE_DEFAULT)));
		HomePanel.add(HomeLabel);
		HomeLabel.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseClicked(MouseEvent e) {
		        frame.setVisible(false);
		        new main();
		    } 
		});
		
		JLabel TitleLabel = new JLabel("음원상세정보");
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TitleLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(TitleLabel, GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(TitleLabel, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
