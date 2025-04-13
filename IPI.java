import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class IPI {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            ArrayList<String> banco = new ArrayList<>(); //aqui é onde vamos guardar as peças
            Random sorte = new Random(); //isso serve pra gerar o código e preço aleatório
            String comando = ""; //o comando pra continuar ou sair
            double IPI = 0.10; //valor do IPI (10%)
            double valorIPI; //variável que vai guardar o valor calculado do IPI
            double somaTotal = 0; //pra somar tudo no final

            //formatador pra mostrar dinheiro no estilo do Brasil (R$ e vírgula)
            NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

            //enquanto a pessoa não digitar "sair", continua perguntando
            while (!comando.equalsIgnoreCase("sair")) {
                System.out.println("Liste seus produtos");

                //perguntando o nome da peça
                System.out.println("Qual será a peça?");
                String peca = entrada.next();
                int codigo = sorte.nextInt(999999); //código aleatório
                System.out.println("Código da peça: " + codigo);

                //sorteando o preço da peça
                int valorUnitario = sorte.nextInt(101);
                System.out.println("\nPreço unitário da peça: " + formatoBR.format(valorUnitario));

                //perguntando a quantidade
                System.out.println("Quantidade de peças: ");
                int quantidade = entrada.nextInt();

                //calculando o total sem o IPI
                int valorTotal = valorUnitario * quantidade;
                System.out.println("Valor total sem IPI: " + formatoBR.format(valorTotal));

                //calculando o valor do IPI (10% do total)
                valorIPI = IPI * valorTotal;
                System.out.println("\nValor do IPI: " + formatoBR.format(valorIPI));

                //somando o IPI no valor total
                double valorFinal = valorTotal + valorIPI;
                System.out.println("Valor total da compra com IPI: " + formatoBR.format(valorFinal));

                //guardando as infos no banco de dados (nossa listinha)
                banco.add("\n" + peca + ": Código: " + codigo + " | Quantidade: " + quantidade + " | Preço total: " + formatoBR.format(valorFinal));

                //perguntando se quer sair ou continuar
                System.out.println("\nDigite 'sair' para terminar ou apenas pressione Enter para continuar.");
                comando = entrada.next();

                //somando tudo
                somaTotal += valorFinal;
            }

            //mostrando tudo o que foi cadastrado
            System.out.println("\nProdutos cadastrados:");
            for (String produto : banco) {
                System.out.println(produto);
            }

            //mostrando o valor total final da compra
            System.out.println("\nValor total da compra: " + formatoBR.format(somaTotal));
        }
    }
}
