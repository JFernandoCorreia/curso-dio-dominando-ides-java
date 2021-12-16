import java.util.Scanner;

public class MercadinhoScanner {

    public static void main(String[] args){

        String produtos[] = {"Macarrão", "Arroz", "Batata", "Café", "Leite", "Feijão"};
        float precos [] = {1.99f, 2.75f, 3.80f, 4.00f, 2.99f, 3.50f};

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Informe o código dos produtos: ");
        int codigoProduto = entradaTeclado.nextInt();

        if (codigoProduto > 0 && codigoProduto < produtos.length) {
            System.out.println("Produto: " + produtos[codigoProduto]);

            System.out.println("Informe a quantidade do produto: ");
            int quantidade = entradaTeclado.nextInt();

            float total = precos[codigoProduto] * quantidade;
            System.out.println("TOTAL: R$" + total);
        } else {
            System.out.println("Produto não encontrado!");
        }
    }
}
