import java.util.Scanner;

public class OppgaveO2b { //oppgave utvidet slik at den leser inn input fra 10 studenter og inkluderer feilmelding for ugyldig poengsum
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Skriv inn poengsum for student " + i + ": ");
            int poeng = input.nextInt();

            if (poeng < 0 || poeng > 100) {
                System.out.println("Ugyldig poengsum!");
            } else if (poeng >= 90) {
                System.out.println("Karakter: A");
            } else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } else if (poeng >= 60) {
                System.out.println("Karakter: C");
            } else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }
        }

        input.close();
    }
}