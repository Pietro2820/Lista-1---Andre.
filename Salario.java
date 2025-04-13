import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            double SMB = 1518.00; // Salário mínimo brasileiro
            double resultado;
            
            System.out.print("Escreva um salário: R$ ");
            double salario = entrada.nextDouble();
            
            if (salario >= SMB) {
                resultado = salario / SMB;
                
                NumberFormat formatoBR = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
                formatoBR.setMaximumFractionDigits(2);
                formatoBR.setMinimumFractionDigits(2);
                
                System.out.println("Esse salário equivale a " + formatoBR.format(resultado) + " salários mínimos.");
            } else {
                System.out.println("Esse salário é menor que um salário mínimo.");
            }
        } // Salário mínimo brasileiro
    }
}
