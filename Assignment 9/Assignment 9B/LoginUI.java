package Assignment9B;

import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginUI extends JFrame {

    // list of valid usernames and passwords
    private final String[] validUsernames = {"admin", "user1", "guest"};
    private final String[] validPasswords = {"admin123", "pass1", "guest123"};

    public LoginUI() {
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(240, 240, 240));

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 100, 30);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(150, 50, 200, 30);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 100, 100, 30);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(150, 100, 200, 30);
        panel.add(passwordText);

        JButton loginButton = new JButton("Sign In");
        loginButton.setBounds(150, 150, 100, 30);
        panel.add(loginButton);

        // New JLabel for login result messages
        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(50, 200, 300, 30);
        resultLabel.setForeground(Color.RED); // Default to red for incorrect login
        panel.add(resultLabel);

        // Action listener for login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText().trim();
                String password = new String(passwordText.getPassword()).trim();

                boolean matchFound = false;
                for (int i = 0; i < validUsernames.length; i++) {
                    if (username.equals(validUsernames[i]) && password.equals(validPasswords[i])) {
                        matchFound = true;
                        break;
                    }
                }

                if (matchFound) {
                    resultLabel.setText("Successfully logged in.");
                    resultLabel.setForeground(new Color(0, 128, 0)); // Green for success
                } else {
                    resultLabel.setText("Incorrect username/password.");
                    resultLabel.setForeground(Color.RED); // Red for failure
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LoginUI());
    }
}
