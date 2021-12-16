import javax.swing.*;

public class MercadoUI {

    public static void main(String[] args){

        String[] produtos = {"Macarrão", "Arroz", "Batata", "Café", "Leite", "Feijão"};
        float[] precos = {1.99f, 2.75f, 3.80f, 4.00f, 2.99f, 3.50f};

        String codigoProdutoStr = JOptionPane.showInputDialog(null, "Informe o código do prouto: ");
        int codigoProduto = Integer.parseInt(codigoProdutoStr);

        if (codigoProduto > 1 && codigoProduto < produtos.length){

            String QuantidadeStr = JOptionPane.showInputDialog(null, "Informe a quantidade do produto: ");
            int quantidade = Integer.parseInt(QuantidadeStr);

            float total = precos[codigoProduto] * quantidade;
            JOptionPane.showMessageDialog(null,
                    "Produto: " + produtos[codigoProduto] + "\n"
                 + "Valor unitário: R$" + precos[codigoProduto] + "\n"
                 + "Qauntidade: " + quantidade + "\n"
                 +"------------------------------------------" + "\n"
                 + "TOTAL: R$" + total);

        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado!");
        }

    }
}
