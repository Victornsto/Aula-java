import javax.swing.JOptionPane;

// COMO CRIAR CAIXAS DE DIALOGO COM O USUARIO

public class EntradaGrafico {
    public static void main(String[] args) {
        String nome =  JOptionPane.showInputDialog("Escreva Seu nome"); // Mostra em uma janela um entrada que preencherá uma variavel

        JOptionPane.showMessageDialog(null, "Bem vindo " + nome); // mostra uma janela com uma saida

    }
    
}
