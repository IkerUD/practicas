import java.util.Scanner;

public class Main {
    public static int numero(String saludo, int contador){
        saludo = saludo.toLowerCase();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu palabra o frase:");
        saludo = sc.nextLine();

        for (int i = 0; i < saludo.length(); i++) {
            char c = saludo.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }


    public static void main(String[] args) {
        String saludo = "";
        int contador = 0;
        contador = numero(saludo, contador);
        System.out.println("La cantidad de vocales es: " + contador);
    }
}


