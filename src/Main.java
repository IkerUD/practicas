import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static String saludo;

    public static void main(String[] args) {

        saludo = JOptionPane.showInputDialog("Dime el texto al que le quieres dar la vuelta");
        textoinvertido();
    }

    public static void textoinvertido() {

        StringBuilder invertirtexto = new StringBuilder(saludo);
        System.out.println( "tu frase invertida es asi: "+ invertirtexto.reverse());


    }



}
