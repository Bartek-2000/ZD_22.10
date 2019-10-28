import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie3 {
    String[] lista;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List lista = new ArrayList();
        lista.add(scanner.nextInt());
        lista.add(scanner.nextInt());
        lista.add(scanner.nextInt());
        System.out.println(lista);



    }
}
