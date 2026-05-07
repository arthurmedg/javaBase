import javax.swing.*;

void main() {
    JFrame frame = new JFrame("Sistema de Login");
    frame.setSize(350, 400);
    frame.setLayout(null);

    JButton buttonEntrar = new JButton("Entrar");
    buttonEntrar.setBounds(20, 200, 100, 60);

    JButton buttonLimpar = new JButton("Limpar");
    buttonLimpar.setBounds(150, 200, 100, 60);

    JLabel labelEmail = new JLabel("E-mail:");
    labelEmail.setBounds(20, 10, 150, 40);
    JTextField inputEmail = new JTextField();
    inputEmail.setBounds(20, 40, 150, 40);

    JLabel labelSenha = new JLabel("Senha:");
    labelSenha.setBounds(20, 100, 150, 40);
    JTextField inputSenha = new JTextField();
    inputSenha.setBounds(20, 130, 150, 40);


    buttonEntrar.addActionListener(e -> {
                String email = inputEmail.getText();
                String senha = inputSenha.getText();

                if (email.equals("") || senha.equals("")) {
                    JOptionPane.showMessageDialog(null, "Nenhum campo de texto pode ficar vazio.");
                } else if (email.equals("admin@senai.com") && senha.equals("123456")) {
                        JOptionPane.showMessageDialog(null, "Login efetivado com sucesso, Bem-Vindo!");
                } else {
                    JOptionPane.showMessageDialog(null, "E-mail ou Senha incorretos, tente novamente.");
                }
                });




    buttonLimpar.addActionListener(e -> {
        inputEmail.setText("");
        inputSenha.setText("");

    });


    frame.add(labelEmail);
    frame.add(inputEmail);
    frame.add(labelSenha);
    frame.add(inputSenha);
    frame.add(buttonEntrar);
    frame.add(buttonLimpar);

    frame.setVisible(true);

}
