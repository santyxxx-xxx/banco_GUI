import javax.swing.*;

public class banco extends JFrame {
    private JButton RETIRARButton;
    private JButton TRANSFERIRButton;
    private JButton SALIRButton;
    private JButton DEPOSITARButton;
    private JPanel Principal;

    public banco() {
        setContentPane(Principal);
        setTitle("Banco");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        DEPOSITARButton.addActionListener(e -> new deposito().setVisible(true));
        RETIRARButton.addActionListener(e -> new retiro().setVisible(true));
        TRANSFERIRButton.addActionListener(e -> new transferencia().setVisible(true));
        SALIRButton.addActionListener(e -> System.exit(0));
    }
}

