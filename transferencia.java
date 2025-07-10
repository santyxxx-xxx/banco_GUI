import javax.swing.*;

public class transferencia extends JFrame {
    private JButton transferirButton;
    private JTextField textField1; // monto
    private JTextField textField2; // destinatario
    private JPanel Principal;

    public transferencia() {
        setContentPane(Principal);
        setTitle("Transferencia");
        setSize(500, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        transferirButton.addActionListener(e -> {
            try {
                double monto = Double.parseDouble(textField1.getText());
                String destinatario = textField2.getText();

                if (monto <= Datos.saldo) {
                    Datos.saldo -= monto;
                    JOptionPane.showMessageDialog(null, "Transferencia exitosa a " + destinatario + ". Saldo: $" + Datos.saldo);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error en el monto");
            }
        });
    }
}
//

