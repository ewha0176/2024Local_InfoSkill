package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.*;

public class main {

    private JFrame frame;
    private JPanel contentPanel; // 추가된 코드
    private boolean isLoggedIn = false;

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

    public main() {
        initialize();
        loadMusic(); // 추가된 코드
    }

    private void initialize() {

        frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("메인");
        frame.setVisible(true);

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(main.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);

        JPanel TitlePanel = new JPanel();

        JPanel BtnPanel = new JPanel();

        // JScrollPane 생성
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

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
                isLoggedIn = true;
                new LoginPage();
            }
        });
        BtnPanel.setLayout(new GridLayout(0, 5, 0, 0));
        BtnPanel.add(LoginBtn);

        JButton RegisterBtn = new JButton(isLoggedIn ? "회원정보" : "회원가입");
        RegisterBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLoggedIn) {
                    frame.setVisible(false);
                    new EditPage();
                } else {
                    frame.setVisible(false);
                    new RegisterPage();
                }
            }
        });
        BtnPanel.add(RegisterBtn);

        JButton SearchBtn = new JButton("음원검색");
    	SearchBtn.setEnabled(false);
        SearchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLoggedIn) {
                	frame.setVisible(false);
                	new SearchPage();
                } else {
                	SearchBtn.setEnabled(false);
                }
            }
        });
        BtnPanel.add(SearchBtn);

        JButton MineBtn = new JButton("마이페이지");
    	MineBtn.setEnabled(false);
        MineBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLoggedIn) {
                    // 여기에 마이페이지로 이동하는 코드 추가
                } else {
                	MineBtn.setEnabled(false);
                }
            }
        });
        BtnPanel.add(MineBtn);

        JButton AnalBtn = new JButton("분석");
        AnalBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isLoggedIn) {
                    frame.setVisible(false);
                    new AnalysisPage();
                } else {
                    JOptionPane.showMessageDialog(frame, "로그인이 필요합니다.", "알림", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        BtnPanel.add(AnalBtn);

        frame.getContentPane().setLayout(groupLayout);

        contentPanel = new JPanel();
        scrollPane.setViewportView(contentPanel);
        contentPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    }

    private void loadMusic() {
        for (int i = 0; i < 20; i++) {
            String musicName = "노래 제목 " + (i + 1);
            String imagePath = "/album/" + (i + 1) + ".png";
            boolean ageLimit = i % 2 == 0;

            JPanel musicPanel = createMusicPanel(musicName, imagePath, ageLimit);
            contentPanel.add(musicPanel);
        }
    }

    private JPanel createMusicPanel(String musicName, String imagePath, boolean ageLimit) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100, 150));

        JLabel nameLabel = new JLabel(musicName.length() > 9 ? musicName.substring(0, 9) + "..." : musicName);
        panel.add(nameLabel);

        ImageIcon icon = new ImageIcon(main.class.getResource(imagePath));
        JLabel imageLabel = new JLabel(icon);
        panel.add(imageLabel);

        if (ageLimit) {
            ImageIcon limitIcon = new ImageIcon(main.class.getResource("/source/limit.png"));
            JLabel limitLabel = new JLabel(limitIcon);
            limitLabel.setPreferredSize(new Dimension(10, 10));
            panel.add(limitLabel);
        }

        return panel;
    }

    public void setIsLoggedIn(boolean value) {
        isLoggedIn = value;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }
}
