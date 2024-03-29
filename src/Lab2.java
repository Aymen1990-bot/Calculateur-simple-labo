import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir deux nombres
        System.out.print("Entrez le premier nombre : ");
        double nombre1 = scanner.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double nombre2 = scanner.nextDouble();

        // Demander à l'utilisateur de choisir une opération
        System.out.print("Choisissez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        // Effectuer le calcul en fonction de l'opération choisie
        double resultat = 0.0;

        switch (operation) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                // Gérer la division par zéro
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                } else {
                    System.out.println("Erreur : Division par zéro n'est pas autorisée.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Erreur : Opération non valide.");
                System.exit(0);
        }

        // Afficher le résultat
        System.out.println("Résultat : " + resultat);

        // Fermer le scanner
        scanner.close();
    }
}




