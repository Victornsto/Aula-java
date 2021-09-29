import java.util.Scanner;
// Como criar uma interação com o sistema

public class Entrada {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in); // é usado para receber uma informação (entrada)
        
        System.out.println("Qual o seu nome??");
        String nome = s.nextLine(); // 's' vai receber o valor digitado na tela e salvar na variavel "nome"
        System.out.println("Bem vindo, " + nome);
        
    }
    
}
