import java.math.*;
import java.util.Scanner;

public class OppgaveO3 {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Beregne fakultet: \nSkriv inn et tall: ");
        int tall = scanner.nextInt();

        if (tall < 0) {
            System.out.println("Ugyldig tall, prøv på nytt ved å skrive et tall som er større enn 0!");
        } else {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 1; i <= tall; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println("Verdi av " + tall + "!" + " = " + factorial);
        }
        scanner.close();
    }
}