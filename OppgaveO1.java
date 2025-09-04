import java.util.Scanner;

public class OppgaveO1 { //løst ved hjelp av switch case, en string, og if-else løkke

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn bruttoinntekt: ");
        double inntekt = scanner.nextDouble();

        String skatteListe;

        if (inntekt < 217400) {
            skatteListe = "trinn1";
        } else if (inntekt >= 217401 && inntekt < 306050) {
            skatteListe = "trinn2";
        } else if (inntekt >= 306051 && inntekt < 697150) {
            skatteListe = "trinn3";
        } else if (inntekt >= 697151 && inntekt < 942400) {
            skatteListe = "trinn4";
        } else if (inntekt >= 942401 && inntekt < 1410750) {
            skatteListe = "trinn5";
        } else if (inntekt > 1410751) {
            skatteListe = "trinn6";
        } else {
            skatteListe = "trinn7";
        }

        switch (skatteListe) {
            case "trinn1":
                System.out.println("Du betaler ingen skatt");
                
                break;
            case "trinn2":
                System.out.println("Du betaler 1,7% skatt: " + inntekt*0.017 + "kr i aaret");
                
                break;
            case "trinn3":
                System.out.println("Du betaler 4,0% skatt: " + inntekt*0.04 + "kr i aaret");
                
                break;
            case "trinn4":
                System.out.println("Du betaler 13,7% skatt: " + inntekt*0.137 + "kr i aaret");
                
                break;
            case "trinn5":
                System.out.println("Du betaler 16,7% skatt: " + inntekt*0.167 + "kr i aaret");
                break;
            case "trinn6":
                System.out.println("Du betaler 17,7% skatt: " + inntekt*0.177 + "kr i aaret");
                
                break;
            case "trinn7":
                System.out.println("Kunne ikke beregne skatt, prøv igjen");
                
                break;
            default:
                System.out.println("Kunne ikke beregne skatt, prøv igjen");
        }

        scanner.close();
    }
}