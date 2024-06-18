import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App4 {

    /**
     * Esercizio 1: Conto alla rovescia
     * Argomenti trattati: variabili, primitivi, Scanner, syso, loop
     * 
     * Scrivi un programma che esegua un conto alla rovescia da un numero
     * specificato dall'utente a 0. Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire un numero intero positivo utilizzando la
     * classe Scanner.
     * Utilizzare un ciclo for per contare alla rovescia.
     * Stampare ogni numero durante il conto alla rovescia.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio 2: Tabelline
     * Argomenti trattati: variabili, primitivi, Scanner, syso, loop
     * 
     * Scrivi un programma che stampi la tabellina di u n numero specificato
     * dall'utente. Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire un numero intero utilizzando la classe
     * Scanner.
     * Utilizzare un ciclo for per stampare la tabellina del numero inserito
     * dall'utente.
     * Stampare i risultati della tabellina.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio 3: Ricerca in un array
     * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop
     * 
     * Scrivi un programma che cerchi un numero specificato dall'utente in un array
     * di numeri interi. Il programma dovrebbe:
     * 
     * Creare un array di numeri interi con valori random compresi tra 0 e 99
     * Chiedere all'utente di inserire un numero intero utilizzando la classe
     * Scanner.
     * Utilizzare un ciclo for per cercare il numero nell'array.
     * Stampare un messaggio che indica se il numero è presente nell'array.
     * 
     * N.B.: stampare l'array per effettuare il controllo manuale
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio 4: Conta caratteri specifici
     * Argomenti trattati: variabili, Scanner, syso, stringhe, loop
     * 
     * Scrivi un programma che conti il numero di volte che un carattere specificato
     * dall'utente appare in una stringa. Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire una stringa e un carattere utilizzando la
     * classe Scanner.
     * Utilizzare un ciclo for per contare le occorrenze del carattere nella
     * stringa.
     * Stampare il conteggio delle occorrenze.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio 5: Stampa caratteri alternativi
     * Argomenti trattati: variabili, Scanner, syso, stringhe, loop
     * 
     * Scrivi un programma che stampi solo i caratteri in posizione pari di una
     * stringa inserita dall'utente. Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
     * Utilizzare un ciclo for per iterare attraverso la stringa.
     * Stampare solo i caratteri in posizione pari.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio 6: Reverse di una stringa
     * Argomenti trattati: variabili, Scanner, syso, stringhe, loop
     * 
     * Scrivi un programma che inverta una stringa inserita dall'utente. Il
     * programma dovrebbe:
     * 
     * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
     * Utilizzare un ciclo for per costruire la stringa invertita.
     * Stampare la stringa invertita.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio 7: Somma dei numeri pari in un array
     * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop
     * 
     * Scrivi un programma che calcoli la somma dei numeri pari in un array di
     * numeri interi. Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire la dimensione dell'array e riempire l'array
     * di numeri random compresi tra 0 e 99.
     * Utilizzare un ciclo for per sommare solo i numeri pari nell'array.
     * Stampare la somma risultante.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * BONUS
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio Bonus 8: Validazione di una password
     * Argomenti trattati: variabili, Scanner, syso, stringhe, loop, if
     * 
     * Scrivi un programma che verifichi la validità di una password inserita
     * dall'utente secondo i seguenti criteri:
     * 
     * La password deve essere lunga almeno 8 caratteri.
     * La password deve contenere almeno un numero.
     * La password deve avere almeno una lettera maiuscola e una minuscola.
     * La password deve contenere almeno un carattere speciale (es. @, #, $, ecc.).
     * Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire una password utilizzando la classe Scanner.
     * Utilizzare un ciclo for e condizioni if per verificare la presenza di ciascun
     * requisito.
     * Stampare un messaggio che indica se la password è valida o meno e, in caso
     * negativo, quali criteri non sono stati soddisfatti.
     */

    public static void main(String[] args) {

        // es1();
        // es2();
        es3();
        // es4();
        // es5();
        // es6();
        // es7();
    }

    public static void es1() {

        /**
         * Esercizio 1: Conto alla rovescia
         * Argomenti trattati: variabili, primitivi, Scanner, syso, loop
         * 
         * Scrivi un programma che esegua un conto alla rovescia da un numero
         * specificato dall'utente a 0. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire un numero intero positivo utilizzando la
         * classe Scanner.
         * Utilizzare un ciclo for per contare alla rovescia.
         * Stampare ogni numero durante il conto alla rovescia.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero intero positivo: ");
        int value = Integer.valueOf(sc.nextLine());

        for (int x = value; x >= 0; x--) {
            System.out.println(x);
        }

        // for (int x = 0; x <= value; x++) {

        // System.out.println(value - x);
        // }

        sc.close();
    }

    public static void es2() {

        /**
         * Esercizio 2: Tabelline
         * Argomenti trattati: variabili, primitivi, Scanner, syso, loop
         * 
         * Scrivi un programma che stampi la tabellina di un numero specificato
         * dall'utente. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire un numero intero utilizzando la classe
         * Scanner.
         * Utilizzare un ciclo for per stampare la tabellina del numero inserito
         * dall'utente.
         * Stampare i risultati della tabellina.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero intero: ");
        int value = Integer.valueOf(sc.nextLine());

        for (int x = 1; x <= 10; x++) {

            System.out.println(value + " x " + x + " = " + value * x);
        }

        sc.close();
    }

    public static void es3() {

        /**
         * Esercizio 3: Ricerca in un array
         * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop
         * 
         * Scrivi un programma che cerchi un numero specificato dall'utente in un array
         * di numeri interi. Il programma dovrebbe:
         * 
         * Creare un array di numeri interi con valori random compresi tra 0 e 99
         * Chiedere all'utente di inserire un numero intero utilizzando la classe
         * Scanner.
         * Utilizzare un ciclo for per cercare il numero nell'array.
         * Stampare un messaggio che indica se il numero è presente nell'array.
         * 
         * N.B.: stampare l'array per effettuare il controllo manuale
         */

        // OPZIONE 1
        // Random rnd = new Random();
        // Scanner sc = new Scanner(System.in);

        // int dim = 10;
        // int[] rndValues = new int[dim];
        // for (int x = 0; x < dim; x++) {

        // rndValues[x] = rnd.nextInt(100);
        // }
        // System.out.println("Array: " + Arrays.toString(rndValues));

        // System.out.println("Inserisci un numero intero: ");
        // int value = Integer.valueOf(sc.nextLine());

        // boolean founded = false;
        // for (int rndValue : rndValues) {

        // if (value == rndValue) {
        // founded = true;
        // break;
        // }
        // }

        // System.out.println(founded
        // ? "Il numero è presente nell'array"
        // : "Il numero non è presente nell'array");

        // sc.close();

        // OPZIONE 2
        Scanner sc = new Scanner(System.in);

        int dim = 10;
        int[] rndValues = getRandomValues(dim);

        System.out.println("Inserisci un numero intero: ");
        int value = Integer.valueOf(sc.nextLine());

        System.out.println(findValue(rndValues, value)
                ? "Il numero è presente nell'array"
                : "Il numero non è presente nell'array");

        sc.close();
    }

    public static void es4() {
    }

    public static void es5() {
    }

    public static void es6() {
    }

    public static void es7() {
    }

    /**
     * Metodo che restituisce un array di dimensione dim con valori random compresi
     * 
     * @param dim dimensione dell'array
     * @return array di dimensione dim con valori random compresi tra 0 e 99
     */
    public static int[] getRandomValues(int dim) {

        Random rnd = new Random();

        int[] rndValues = new int[dim];
        for (int x = 0; x < dim; x++) {

            rndValues[x] = rnd.nextInt(100);
        }
        System.out.println("Array: " + Arrays.toString(rndValues));

        return rndValues;
    }

    public static boolean findValue(int[] values, int value) {

        for (int v : values)
            if (value == v)
                return true;

        return false;
    }
}
