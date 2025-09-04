import java.util.Scanner;

public class OppgaveO2a { //oppgave for en student, løst ved string, if-else løkke og switch case.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Skriv inn poengsum: ");
        
        double skala = scanner.nextDouble();

        String liste;

        if (skala >= 0 && skala <= 39) {
            liste = "karakterF";
        } else if (skala >= 40 && skala <= 49) {
            liste = "karakterE";
        } else if (skala >= 50 && skala <= 59) {
            liste = "karakterD";
        } else if (skala >= 60 && skala <= 79) {
            liste = "karakterC";
        } else if (skala >= 80 && skala <= 89) {
            liste = "karakterB";
        } else if (skala >= 90 && skala <= 100) {
            liste = "karakterA";
        } else if (skala < 0  && skala < -100) {
            liste = "karakterG";
        } else {
            liste = "karakterH";
        }

        switch (liste) {
            case "karakterF":
                System.out.println("Karakter: F");
                break;
            case "karakterE":
                System.out.println("Karakter: E");
                break;
            case "karakterD":
                System.out.println("Karakter: D");
                break;
            case "karakterC":
                System.out.println("Karakter: C");
                break;
            case "karakterB":
                System.out.println("Karakter: B");
                break;
            case "karakterA":
                System.out.println("Karakter: A");
                break;
            case "karakterG":
                System.out.println("Ugyldig poengsum");
                break;
                
            default:
                System.out.println("Ugyldig poengsum");
        }

        scanner.close();
    }
}