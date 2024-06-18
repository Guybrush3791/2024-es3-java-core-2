import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        // es1();
        // es2();
        // es3();
        es5();

        System.out.println("The end");
    }

    public static void es1() {

        /**
         * Esercizio 1: Calcolatore di area
         * Argomenti trattati: variabili, primitivi, Scanner, syso
         *
         * Scrivi un programma che calcoli l'area di un rettangolo. Il programma
         * dovrebbe:
         *
         * Chiedere all'utente di inserire la lunghezza e la larghezza del rettangolo
         * utilizzando la classe Scanner.
         * Calcolare l'area utilizzando le variabili.
         * Stampare l'area risultante.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza del rettangolo: ");
        int l = Integer.valueOf(sc.nextLine());

        System.out.println("Inserisci l'altezza del rettangolo: ");
        int a = Integer.valueOf(sc.nextLine());

        int area = l * a;

        System.out.println("L'area del rettangolo è: " + area);

        sc.close();
    }

    public static void es2() {

        /**
         * Esercizio 2: Numero pari o dispari
         * Argomenti trattati: variabili, primitivi, Scanner, syso, if
         * 
         * Scrivi un programma che determini se un numero inserito dall'utente è pari o
         * dispari. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire un numero intero utilizzando la classe
         * Scanner.
         * Utilizzare un'istruzione if per verificare se il numero è pari o dispari.
         * Stampare un messaggio che indica se il numero è pari o dispari.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int userValue = Integer.valueOf(sc.nextLine());

        System.out.println(
                userValue % 2 == 0
                        ? "Il numero e' pari"
                        : "Il numero e' dispari");

        sc.close();
    }

    public static void es3() {

        /**
         * Esercizio 3: Somma dei numeri da 1 a N
         * Argomenti trattati: variabili, primitivi, Scanner, syso, loop
         * 
         * Scrivi un programma che calcoli la somma di tutti i numeri interi da 1 a N.
         * Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire un numero intero positivo N utilizzando la
         * classe Scanner.
         * Utilizzare un ciclo for per calcolare la somma di tutti i numeri da 1 a N.
         * Stampare la somma risultante.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero intero positivo: ");
        int value = Integer.valueOf(sc.nextLine());

        int sum = 0;
        for (int x = 1; x <= value; x++) {

            sum += x;
        }

        System.out.println("La somma dei numeri da 1 a " + value + " e': " + sum);

        sc.close();
    }

    public static void es5() {

        /**
         * Esercizio 5: Conteggio delle vocali in una stringa
         * Argomenti trattati: variabili, Scanner, syso, stringhe, loop
         * 
         * Scrivi un programma che conti il numero di vocali in una stringa inserita
         * dall'utente. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
         * Utilizzare un ciclo for per iterare attraverso la stringa e contare il numero
         * di vocali (a, e, i, o, u).
         * Stampare il conteggio delle vocali.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String userString = sc.nextLine();

        int vouelCount = 0;
        for (char c : userString.toCharArray()) {

            if (isVouel(c)) {
                vouelCount++;
            }

            // vouelCount += isVouel(c) ? 1 : 0;
        }

        System.out.println("Il numero di vocali nella stringa e': " + vouelCount);

        sc.close();
    }

    public static boolean isVouel(char c) {

        char[] vouels = { 'a', 'e', 'i', 'o', 'u' };

        for (char vouel : vouels) {
            if (c == vouel) {
                return true;
            }
        }

        return false;

        // return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
