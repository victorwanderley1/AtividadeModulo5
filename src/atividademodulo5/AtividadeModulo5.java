package atividademodulo5;

/**
 *
 * @author Victor
 */
public class AtividadeModulo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroInt = 48;
        Double numeroIntParaDouble = (double)numeroInt;
        System.out.println("Número inteiro: "+numeroInt+"\nNúmero double: " + numeroIntParaDouble);
        char letra  = 'a';
        String letraCharParaString = String.valueOf(letra);
        System.out.println("String do char: " + letraCharParaString);
        float numeroFloat = 4678.182838383f;
        Integer numeroFloatParaInteger = (int)numeroFloat;
        System.out.println("Número float: " + numeroFloat + "\nNúmero Inteiro: " + numeroFloatParaInteger);
    }
    
}
