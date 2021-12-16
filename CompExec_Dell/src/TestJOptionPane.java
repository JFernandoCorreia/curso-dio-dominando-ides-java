import javax.swing.*;

public class TestJOptionPane {

    public static void main(String[] args){

        String texto = JOptionPane.showInputDialog("Digite o texto. ");

        JOptionPane.showMessageDialog(null, "Você digitou: " + texto);
    }
}
