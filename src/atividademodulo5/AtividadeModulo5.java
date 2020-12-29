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
        Integer numeroInt = 48;
        Double numeroIntParaDouble = (double)numeroInt;
        System.out.println("Número inteiro: "+numeroInt+"\nNúmero double: " + numeroIntParaDouble);
        
        Character letra  = 'a';
        String letraCharParaString = String.valueOf(letra);
        System.out.println("String do char: " + letraCharParaString);
        
        Float numeroFloat = 4678.182838383f;
        Integer numeroFloatParaInteger = numeroFloat.intValue();
        System.out.println("Número float: " + numeroFloat + "\nNúmero Inteiro: " + numeroFloatParaInteger);
    }
    
}
