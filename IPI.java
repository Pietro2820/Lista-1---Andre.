import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class IPI {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            ArrayList<String> banco = new ArrayList<>();
            Random sorte = new Random();
            String comando = "";
            Double IPI = 0.10;
            Double valorIPI;
            double somaTotal = 0;
            
            // O while vai continuar até o usuário digitar "sair"
            while (!comando.equalsIgnoreCase("sair")) {
                
                System.out.println("Liste seus produtos");
                
                // Qual será a peça
                System.out.println("Qual será a peça?");
                String peca = entrada.next();
                int codigo = sorte.nextInt(999999);
                System.out.println("Código da peça: " + codigo);
                
                // Preço das peças
                int valor = sorte.nextInt(101);
                System.out.println("\nPreço das peças: R$ " + valor);
                
                // Quantidade de peças
                System.out.println("Quantidade de peças: ");
                int quantidade = entrada.nextInt();
                
                valor *= quantidade;
                System.out.println("Valor total: " + valor);
                valorIPI = IPI * valor;
                System.out.println("\nO valor do IPI: R$ " + valorIPI);
                valor += valorIPI;
                System.out.println("Valor total da compra: R$ " + valor);
                
                
                // Adicionando a peça no banco de dados (ArrayList)
                banco.add("\n" + peca + ": " + "Código: " + codigo + " | Quantidade: " + quantidade + " | Preço total: R$ " + valor);
                
                // Perguntar se o usuário quer sair
                System.out.println("\nDigite 'sair' para terminar ou acrecente um '.' e aperte Enter para continuar.");
                comando = entrada.next();
                
                somaTotal += valor;
            }
            
            // Exibindo todos os produtos adicionados
            System.out.println("\nProdutos cadastrados:");
            for (String produto : banco) {
                System.out.println(produto);
            }
            
            // Total da compra:
            System.out.println("\nValor total da compra: R$ " + somaTotal);
        }
    }
}
