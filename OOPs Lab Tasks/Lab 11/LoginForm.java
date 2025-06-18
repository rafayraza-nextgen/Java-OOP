import java.awt.*;
import java.awt.event.*;
import java.util.*;


class LoginForm extends Frame implements ActionListener {
    Label lblUser, lblPass;
    TextField txtUser, txtPass;
    Button btnLogin;

    LoginForm() {
        setTitle("Login Form");
        setSize(300, 150);
        setLayout(new FlowLayout());

        lblUser = new Label("Username:");
        txtUser = new TextField(20);
        lblPass = new Label("Password:");
        txtPass = new TextField(20);
        txtPass.setEchoChar('*');

        btnLogin = new Button("Login");

        add(lblUser); add(txtUser);
        add(lblPass); add(txtPass);
        add(btnLogin);

        btnLogin.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = txtUser.getText();
        String pass = txtPass.getText();
        if (user.equals("admin") && pass.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Login");
        }
    }
}

