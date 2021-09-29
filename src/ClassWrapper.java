import java.util.function.DoubleUnaryOperator;

// Wrapper funcionam como conversor de numeros para strings, podendo atribuir a um tipo primitivo, desde que eles tenham o memso tamanho 

public class ClassWrapper {
    public static void main(String[] args) {

        Double preco = Double.parseDouble("12.45") ; 

        double d = preco.doubleValue();
        int i = preco.intValue();
        byte b = preco.byteValue();

        int i2 = Integer.valueOf("101011", 2); // converte um numero binario na sua base

        System.out.println(i2);
        System.out.println(preco);
    }
    
}
