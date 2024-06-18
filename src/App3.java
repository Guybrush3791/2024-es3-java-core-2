import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App3 {

    public static void main(String[] args) {

        // es7();
        // es8();
        // es9();
        es10();
    }

    public static void es7() {
        /**
         * Esercizio 7: Verifica del palindromo
         * Argomenti trattati: variabili, Scanner, syso, stringhe, loop, metodi
         *
         * Scrivi un programma che verifichi se una stringa è un palindromo. Il
         * programma dovrebbe:
         *
         * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
         * Definire un metodo isPalindromo che prenda una stringa come parametro e
         * ritorni true se la stringa è un palindromo e false altrimenti.
         * Utilizzare il metodo isPalindromo per verificare se la stringa inserita
         * dall'utente è un palindromo.
         * Stampare un messaggio che indica se la stringa è un palindromo o meno.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String s = sc.nextLine();

        boolean isPal = isPalindromo(s);

        System.out.println("La stringa " + s + " è un palindromo? " + isPal);

        sc.close();
    }

    public static void es8() {

        /**
         * Esercizio 8: Media di un array
         * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop, metodi
         * 
         * Scrivi un programma che calcoli la media dei numeri in un array. Il programma
         * dovrebbe:
         * 
         * Chiedere all'utente di inserire la dimensione dell'array utilizzando la
         * classe Scanner
         * Riempire l'array di numeri random compresi tra 0 e 99
         * Definire un metodo calcolaMedia che prenda un array di numeri interi come
         * parametro e ritorni la media dei numeri.
         * Utilizzare il metodo calcolaMedia per calcolare la media dell'array inserito
         * dall'utente.
         * Stampare la media risultante.
         */

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Inserisci la dimensione dell'array: ");
        int dim = Integer.valueOf(sc.nextLine());

        // int rndValue = rnd.nextInt(100); // [0, 100)
        int[] arr = new int[dim];
        for (int x = 0; x < dim; x++) {

            arr[x] = rnd.nextInt(10);
        }
        System.out.println("Array: " + Arrays.toString(arr));

        int media = calcoloMedia(arr);
        System.out.println("La media dell'array è: " + media);

        sc.close();
    }

    public static void es9() {
        /**
         * Esercizio 9: Contare le parole in una stringa
         * Argomenti trattati: variabili, Scanner, syso, stringhe, metodi
         * 
         * Scrivi un programma che conti il numero di parole in una stringa inserita
         * dall'utente. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
         * Definire un metodo contaParole che prenda una stringa come parametro e
         * ritorni il numero di parole nella stringa.
         * Utilizzare il metodo contaParole per contare le parole nella stringa inserita
         * dall'utente.
         * Stampare il numero di parole.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String s = sc.nextLine();

        int wordsCount = contaParole(s);
        System.out.println("Il numero di parole nella stringa è: " + wordsCount);

        sc.close();
    }

    public static void es10() {

        /**
         * Esercizio 10: Numeri primi in un intervallo
         * Argomenti trattati: variabili, primitivi, Scanner, syso, loop, metodi
         * 
         * Scrivi un programma che trovi tutti i numeri primi in un intervallo
         * specificato dall'utente. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire l'inizio e la fine dell'intervallo
         * utilizzando la classe Scanner.
         * Definire un metodo isPrimo che prenda un intero come parametro e ritorni true
         * se il numero è primo e false altrimenti.
         * Utilizzare un ciclo for per iterare attraverso l'intervallo e utilizzare il
         * metodo isPrimo per verificare se ciascun numero è primo.
         * Stampare tutti i numeri primi nell'intervallo specificato.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci l'inizio dell'intervallo: ");
        int start = Integer.valueOf(sc.nextLine());

        System.out.println("Inserisci la fine dell'intervallo: ");
        int end = Integer.valueOf(sc.nextLine());

        System.out.println("\nSequenza di numeri primi: ");
        for (int x = start; x <= end; x++) {

            if (isPrimo(x))
                System.out.println(x);
        }

        sc.close();
    }

    public static boolean isPalindromo(String s) {

        char[] charSeq = s.toCharArray(); // [a, d, r, e, a]

        for (int x = 0; x < charSeq.length / 2; x++) {

            char c = charSeq[x]; // 0: a, 1: d, 2: r, 3: e, 4: a
            char invC = charSeq[charSeq.length - x - 1]; // 0: a, 1: e, 2: r, 3: d, 4: a

            if (c != invC)
                return false;
        }

        return true;
    }

    public static int calcoloMedia(int[] values) {

        int sum = 0;
        for (int value : values) {

            sum += value;
        }

        return sum / values.length;
    }

    public static int contaParole(String str) {

        String[] words = str.split(" ");

        int count = 0;
        for (String word : words) {

            // if (word.trim().length() > 0)
            // count++;

            if (!word.isEmpty())
                count++;
        }

        return count;
    }

    public static boolean isPrimo(int value) {

        if (value <= 2)
            return false;

        for (int x = 2; x < value / 2 + 1; x++) {

            if (value % x == 0)
                return false;
        }

        return true;
    }
}