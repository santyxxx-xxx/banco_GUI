import javax.swing.*;

public class login extends JFrame {
    private JButton loginButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel Principal;

    public login() {
        setContentPane(Principal);
        setTitle("Login");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        loginButton.addActionListener(e -> {
            String usuario = textField1.getText();
            String clave = new String(passwordField1.getPassword());

            if (usuario.equals("cliente123") && clave.equals("clave456")) {
                banco ventanaBanco = new banco();
                ventanaBanco.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos");
            }
        });
    }
}
