public class SomaDeUmAQuinze {
    public static void main(String[] args) {
        int soma = 0;

        System.out.println("Somando os números de 1 a 15:\n");

        for (int i = 1; i <= 15; i++) {
            System.out.print(soma + " + " + i + " = ");
            soma += i;
            System.out.println(soma);
        }

        System.out.println("\nResultado final: A soma dos números de 1 a 15 é " + soma);
    }
}
