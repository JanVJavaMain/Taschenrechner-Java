import java.util.Scanner;

public class Taschenrechner { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char operator;
        double zahl1, zahl2, ergebnis, ergebnis2;

        System.out.println("Bitte Operator eingeben: (Ausnahmen - s fuer Wurzel / p fuer Potenz - erste Zahl ist Basis, zweite Exponent / l fuer Logarithmus; hier zwei Zahlen eingeben)");
        operator = sc.next().charAt(0);
        System.out.println("Bitte erste Zahl eingeben: ");
        zahl1 = sc.nextDouble();
        System.out.println("Bitte zweite Zahl eingeben: ");
        zahl2 = sc.nextDouble();

        switch(operator) {
        default: 
            System.out.println("Keinen validen Operator gegeben.");
            break;

        case '+':
            ergebnis = zahl1 + zahl2;
            System.out.println("Das Ergebnis lautet: " + ergebnis);
            break;

        case '-':
            ergebnis = zahl1 - zahl2;
            System.out.println("Das Ergebnis lautet: " + ergebnis);
            break;
        
        case '*':
            ergebnis = zahl1 * zahl2;
            System.out.println("Das Ergebnis lautet: " + ergebnis);
            break;

        case '/':
            ergebnis = zahl1 / zahl2;
            System.out.println("Das Ergebnis lautet: " + ergebnis);
            break;

        case 's':
            ergebnis = Math.sqrt(zahl1);
            System.out.println("Die Wurzel der ersten Zahl lautet:" + ergebnis);
            ergebnis2 = Math.sqrt(zahl2);
            System.out.println("Die Wurzel der zweiten Zahl lautet:" + ergebnis2);
            break;

        case 'p':
            ergebnis = Math.pow(zahl1, zahl2);
            System.out.println("Das Ergebnis lautet: " + ergebnis);
            break;
        
        case 'l':
            ergebnis = Math.log(zahl1);
            System.out.println("Der Logarithmus der ersten Zahl lautet:" + ergebnis);
            ergebnis2 = Math.log(zahl2);
            System.out.println("Der Logarithmus der zweiten Zahl lautet:" + ergebnis2);
            break;
        }

        sc.close();
        System.exit(1);
    }
}
