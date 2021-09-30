
public class Operadores { 
    public static void main(String[] args) {
        int x = 6;
        int y = x++; // pós-incremento, y irá receber o valor de x (6) e irá incrementar + 1 somente em x
        // int y = ++x pré-incremento, y irá incrementar + 1 em x e ambos irão receber o valor alterado (7)

        System.out.println(x);
        System.out.println(y);

        int a = 6;
        int b = a--; // pos-incremento, a variavel b não recebe o valor alterado
        // int b = --a; pré-incremento, ambas as veriáveis recebem alteração no valor

        System.out.println(a);
        System.out.println(b);
    }

    

    
}