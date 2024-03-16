package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginPage {

    private JFrame frame;
    private JTextField PwField;
    private JTextField IdField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginPage window = new LoginPage();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginPage() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 510, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("로그인");

        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage(LoginPage.class.getResource("/source/Mic.png"));
        frame.setIconImage(img);

        JPanel TitlePanel = new JPanel();

        JPanel FormPanel = new JPanel();
        FormPanel.setLayout(null);

        JLabel IdLabel = new JLabel("ID");
        IdLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 23));
        IdLabel.setBounds(65, 10, 57, 46);
        FormPanel.add(IdLabel);

        JLabel PwLabel = new JLabel("PW");
        PwLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 23));
        PwLabel.setBounds(65, 66, 57, 46);
        FormPanel.add(PwLabel);

        IdField = new JTextField();
        IdField.setText("");
        IdField.setColumns(10);
        IdField.setBounds(122, 10, 269, 46);
        FormPanel.add(IdField);

        PwField = new JTextField(); 
        PwField.setText("");
        PwField.setBounds(122, 66, 269, 46);
        FormPanel.add(PwField);
        PwField.setColumns(10);
        PwField.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				new PwPage();
			}
		});

        JButton LoginBtn = new JButton("로그인");
        LoginBtn.setBounds(122, 122, 269, 45);
        FormPanel.add(LoginBtn);
        TitlePanel.setLayout(null);

        JLabel LoginLabel = new JLabel("로그인");
        LoginLabel.setBounds(0, 0, 299, 61);
        LoginLabel.setVerticalAlignment(SwingConstants.BOTTOM);
        LoginLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        LoginLabel.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 35));
        TitlePanel.add(LoginLabel);
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(TitlePanel, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FormPanel, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 484, GroupLayout.PREFERRED_SIZE))
                    .addGap(10))
        );
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addComponent(TitlePanel, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(FormPanel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
        );

        JPanel HomePanel = new JPanel();
        HomePanel.setBounds(311, 0, 173, 73);
        TitlePanel.add(HomePanel);
        HomePanel.setLayout(new GridLayout(0, 1, 0, 0));

        JLabel HomeLabel = new JLabel("");
        HomeLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        HomeLabel.setIcon(new ImageIcon(new ImageIcon(LoginPage.class.getResource("/source/Main.png"))
            .getImage().getScaledInstance(120, 73, Image.SCALE_DEFAULT)));
        HomePanel.add(HomeLabel);
        frame.getContentPane().setLayout(groupLayout);

        HomeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                new main();
            }
        });

        // 로그인 버튼 클릭 이벤트 처리
        LoginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = IdField.getText();
                String password = PwField.getText();

                // 입력값이 비어있는지 확인
                if (id.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "빈칸이 있습니다.", "경고", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // 로그인 정보가 일치하는지 확인 (여기에서는 임의로 'admin'/'password'로 설정함)
                if (id.equals("admin") && password.equals("password")) {
                    // 로그인 성공
                    JOptionPane.showMessageDialog(frame, "로그인 성공!", "알림", JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose(); // 현재 창 닫기
                    new main(); // 메인 페이지 열기
                } else {
                    // 로그인 실패
                    JOptionPane.showMessageDialog(frame, "로그인 정보가 일치하지 않습니다.", "경고", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
