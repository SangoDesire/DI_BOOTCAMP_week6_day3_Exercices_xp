import java.util.Scanner;

public class Exercice3 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez un nombre entier svp");
        String input = scanner.nextLine();

        StringBuilder reverse = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse.append(input.charAt(i));
        }

        System.out.println("The reverse is " + reverse);
    }
}
