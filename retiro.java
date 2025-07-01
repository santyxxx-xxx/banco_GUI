import javax.swing.*;

public class retiro extends JFrame {
    private JButton retirarButton;
    private JTextField textField1;
    private JPanel Principal;

    public retiro() {
        setContentPane(Principal);
        setTitle("Retiro");
        setSize(500, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        retirarButton.addActionListener(e -> {
            try {
                double monto = Double.parseDouble(textField1.getText());
                if (monto <= Datos.saldo) {
                    Datos.saldo -= monto;
                    JOptionPane.showMessageDialog(null, "Retiro exitoso. Saldo actual: $" + Datos.saldo);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el monto");
            }
        });
    }
}
