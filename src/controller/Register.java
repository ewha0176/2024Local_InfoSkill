package controller;
import javax.swing.JOptionPane;

public class Register {

    public static void registerAction(String name, String birth, String id, String pw) {
        if (name.isEmpty() || birth.isEmpty() || id.isEmpty() || pw.isEmpty()) {
            JOptionPane.showMessageDialog(null, "빈칸이 있습니다.", "경고", JOptionPane.WARNING_MESSAGE);
        } else if (!name.matches("[가-힣]+")) {
            JOptionPane.showMessageDialog(null, "이름은 한글만 가능합니다.", "경고", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.", "정보", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
