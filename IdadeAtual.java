import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class IdadeAtual {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner (System.in)) {
            LocalDate dataAtual = LocalDate.now();
            
            System.out.println("Olá, nesse programa você saberá sua idade atual.");
            System.out.println("Informe sua data de nascimento (yyyy-MM-dd):");
            String dataNascimentoTexto = entrada.nextLine();
            
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoTexto);
            Period idade = Period.between(dataNascimento, dataAtual);
            
            if (dataNascimento.isBefore(dataAtual)) {
                System.out.println("Você tem " + idade.getYears() + " anos, " + idade.getMonths() + " meses e " + idade.getDays() + " dias.");
                
            }
        }
    }
    
}
