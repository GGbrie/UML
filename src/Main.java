import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Cómo te llamas? ");
        String name = scanner.nextLine();
        System.out.println("Hola, " + name + "! ¡Bienvenido a Java!");
    }
}
