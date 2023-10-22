/*
 * Autor: Jan V
 * Jahr: 2023
 * Aktuelle Version: 2023, V 1.0
 */
import java.util.Scanner; // Importieren des Scanner 

public class Taschenrechner {
    public static void main(String[] args){
        char operator; // hier kann zwischen +, -, * und / entschieden werden 
        double zahl1, zahl2, ausgabe; // könnten auch Dezimalzahlen sein mit einer Dezimalstelle

        Scanner eingabe = new Scanner(System.in); // Scanner - Implementation

        System.out.println("Hier Operator wählen: +, -, * oder /");
        operator = eingabe.next().charAt(0); // liest den Input aus der Konsole für den nächsten Char aus
        System.out.println("Hier die erste Zahl wählen:");
        zahl1 = eingabe.nextDouble(); // liest den Inhalt der Konsole für nächste Double aus
        System.out.println("Hier die zweite Zahl wählen:");
        zahl2 = eingabe.nextDouble();

        switch(operator){ // Je nach Operator werden versch. Sachen ausgeführt; hier: berechnet
            case '+': // Addieren
            ausgabe = zahl1 + zahl2;
            System.out.println("Das Ergebnis lautet: " + ausgabe);
            break;

            case '-': // Subtrahieren
            ausgabe = zahl1 - zahl2;
            System.out.println("Das Ergebnis lautet: " + ausgabe);
            break;

            case '*': // Multiplizieren
            ausgabe = zahl1 * zahl2;
            System.out.println("Das Ergebnis lautet: " + ausgabe);
            break;

            case '/': // Dividieren
            ausgabe = zahl1 / zahl2;
            System.out.println("Das Ergebnis lautet: " + ausgabe);
            break; // damit er nicht einfach so weiterrechnet

            default: // falls kein gültiger Operator eingegeben worden ist
            System.out.println("Ungültiger Operator!");
            break;
        }
        eingabe.close(); // Memory Leak Präventionsmaßnahme
        System.exit(1); // Java Programm beenden
    }
}