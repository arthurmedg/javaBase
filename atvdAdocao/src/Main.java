import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

void main() {
    Adocao marcos = new Adocao("Marcos", 17, "Chihuahua", Tipo.CACHORRO, "11935678324");

    JFrame tela = new JFrame("Tela de Cadastro");
    tela.setSize(400, 700);
    tela.setLayout(null);

//    Campo Nome
    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 50, 150, 40);
    tela.add(labelNome);

    JTextField nome = new JTextField();
    nome.setBounds(20, 80, 150, 40);
    tela.add(nome);

//    Campo Idade
    JLabel labelIdade = new JLabel("Idade");
    labelIdade.setBounds(20, 110, 150, 40);
    tela.add(labelIdade);

    JTextField idade = new JTextField();
    idade.setBounds(20, 140, 150, 40);
    tela.add(idade);


//    Campo Raça
    JLabel labelRaca = new JLabel("Raça");
    labelRaca.setBounds(20, 170, 150, 40);
    tela.add(labelRaca);

    JTextField raca = new JTextField();
    raca.setBounds(20, 200, 150, 40);
    tela.add(raca);

//    Campo Tipo
    JLabel labelTipo = new JLabel("Raça");
    labelTipo.setBounds(20, 230, 150, 40);
    tela.add(labelTipo);

    JComboBox escolhaTipo = new JComboBox(Tipo.values());
    escolhaTipo.setBounds(20, 260, 150, 40);
    tela.add(escolhaTipo);

    //    Campo Telefone
    JLabel labelTelefone = new JLabel("Telefone");
    labelTelefone.setBounds(20, 290, 150, 40);
    tela.add(labelTelefone);

    JTextField telefone = new JTextField();
    telefone.setBounds(20, 320, 150, 40);
    tela.add(telefone);

    //    Campo Endereço
    JLabel labelEndereco = new JLabel("Endereco");
    labelEndereco.setBounds(20, 350, 150, 40);
    tela.add(labelEndereco);

    JTextField endereco = new JTextField();
    endereco.setBounds(20, 380, 150, 40);
    tela.add(endereco);

//    Campo Botão
    JButton enviar = new JButton("Enviar");
    enviar.setBounds(20, 440, 150, 40);
    tela.add(enviar);


    enviar.addActionListener(e -> {
        String sql = "INSERT INTO Adocao (nome, idade, raca, tipo, telefone, endereco) VALUE(?, ?, ?, ?, ?, ?)";
        String nomeAnimal = nome.getText();
        String idadeAnimal = idade.getText();
        String racaAnimal = raca.getText();
        Tipo tipoAnimal = (Tipo) escolhaTipo.getSelectedItem();
        String telefoneTutor = telefone.getText();
        String enderecoTutor = endereco.getText();


        try {
            // conexao com o banco
            Connection conexao = Conexao.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql);

            ps.setString(1, nomeAnimal);
            ps.setString(2, idadeAnimal);
            ps.setString(3, racaAnimal);
            ps.setString(4, tipoAnimal.name());
            ps.setString(5, telefoneTutor);
            ps.setString(6, enderecoTutor);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro de adoção salvo com sucesso!");
            ps.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    });

    tela.setVisible(true);
}
