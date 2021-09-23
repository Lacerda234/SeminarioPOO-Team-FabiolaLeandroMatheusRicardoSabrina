import javax.swing.*;

public class testando {
    public static void main(String []args){

        float nota1=8, nota2=7, nota3=10, soma, media;

        soma= nota1 + nota2 + nota3;
        media = soma / 3;

        JOptionPane.showMessageDialog(null," A media eh: "+media);

    }
}
