import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string, stringInvertida;
        string = sc.nextLine();
        char [] vetorDeLetras = separaString(string);
        stringInvertida = inverteString(vetorDeLetras);
        System.out.println("A string invertida ficou assim: " + stringInvertida);
        sc.close();
    }
    
    public static char[] separaString(String string){
        String aux = string;
        char [] vet = new char[string.length()];
        for (int i = 0; i < vet.length; i++) {
           char letra = aux.charAt(i);
           vet[i] = letra;
        }
        return vet;
    }

    public static String inverteString(char[] vet){
        String palavra = "";
        for (int i = vet.length-1; i >= 0; i--) {
           palavra += vet[i];
        }
        return palavra;
    }
}