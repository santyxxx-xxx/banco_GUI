import javax.swing.*;

public class deposito extends JFrame {
    private JButton DEPOSITARButton;
    private JTextField textField1;
    private JPanel Principal;

    public deposito() {
        setContentPane(Principal);
        setTitle("Depósito");
        setSize(500, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        DEPOSITARButton.addActionListener(e -> {
            try {
                double monto = Double.parseDouble(textField1.getText());
                Datos.saldo += monto;
                JOptionPane.showMessageDialog(null, "Depósito realizado. Nuevo saldo: $" + Datos.saldo);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al ingresar el monto");
            }
        });
    }
}
//
