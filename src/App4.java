import java.nio.charset.Charset;
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
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio Bonus 9: Conversione da numero a parola
     * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop, metodi
     * 
     * Scrivi un programma che converta un numero intero (da 0 a 999) in parole. Per
     * esempio, 123 dovrebbe essere convertito in "centoventitré".
     * Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire un numero intero tra 0 e 999 utilizzando la
     * classe Scanner.
     * Definire un metodo per la conversione delle centinaia, uno per le decine e
     * uno per le unità.
     * Combinare i risultati dei metodi per formare il numero completo in parole.
     * Stampare il numero in parole.
     * 
     * ------------------------------------------------------------------------------------------------
     * 
     * Esercizio Bonus 10: Gioco della morra cinese
     * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop, if,
     * metodi
     * 
     * Crea un programma che permetta a due giocatori di giocare a morra cinese
     * (carta, forbice, sasso). Il programma dovrebbe:
     * 
     * Chiedere a ciascun giocatore di scegliere tra carta, forbice e sasso,
     * utilizzando la classe Scanner. Assicurati che l'input sia valido (solo carta,
     * forbice o sasso).
     * Definire un metodo determinaVincitore che prenda le scelte dei due giocatori
     * come parametri e ritorni il vincitore basandosi sulle regole tradizionali del
     * gioco (carta batte sasso, sasso batte forbice, forbice batte carta).
     * Utilizzare un loop do-while per permettere ai giocatori di giocare più round
     * fino a quando non decidono di fermarsi.
     * Stampare il vincitore di ogni round e tenere traccia del punteggio
     * complessivo.
     * Questi esercizi bonus richiedono una comprensione più approfondita delle
     * logiche di programmazione e delle strutture di controllo in Java, offrendo
     * agli studenti una sfida maggiore e l'opportunità di applicare concetti
     * avanzati.
     */

    public static void main(String[] args) {

        // es1();
        // es2();
        // es3();
        // es4();
        // es5();
        // es6();
        // es7();
        // es8();
        es9();
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

        /**
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
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String userString = sc.nextLine();

        System.out.println("Inserisci un carattere: ");
        char c = sc.nextLine().charAt(0);

        int count = 0;
        for (char userStringC : userString.toCharArray()) {

            // if (c == userStringC)
            // count++;

            count += c == userStringC ? 1 : 0;
        }

        System.out.println("Il carattere " + c + " appare " + count + " volte nella stringa \"" + userString + "\"");

        sc.close();
    }

    public static void es5() {

        /**
         * Esercizio 5: Stampa caratteri alternativi
         * Argomenti trattati: variabili, Scanner, syso, stringhe, loop
         * 
         * Scrivi un programma che stampi solo i caratteri in posizione pari di una
         * stringa inserita dall'utente. Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
         * Utilizzare un ciclo for per iterare attraverso la stringa.
         * Stampare solo i caratteri in posizione pari.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String userString = sc.nextLine();

        for (int x = 1; x < userString.length(); x += 2) {

            System.out.print(userString.charAt(x));
        }

        sc.close();
    }

    public static void es6() {

        /**
         * Esercizio 6: Reverse di una stringa
         * Argomenti trattati: variabili, Scanner, syso, stringhe, loop
         * 
         * Scrivi un programma che inverta una stringa inserita dall'utente. Il
         * programma dovrebbe:
         * 
         * Chiedere all'utente di inserire una stringa utilizzando la classe Scanner.
         * Utilizzare un ciclo for per costruire la stringa invertita.
         * Stampare la stringa invertita.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String userString = sc.nextLine();

        for (int x = userString.length() - 1; x >= 0; x--) {

            System.out.print(userString.charAt(x));
        }

        sc.close();
    }

    public static void es7() {

        /**
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
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array: ");
        int dim = Integer.valueOf(sc.nextLine());

        int[] rndValues = getRandomValues(dim);

        int sum = 0;
        for (int x = 0; x < dim; x += 2) {

            sum += rndValues[x];
        }

        System.out.println("La somma dei numeri pari nell'array è: " + sum);

        sc.close();
    }

    // --------- BONUS ---------

    public static void es8() {

        /**
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
         * 
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci una password: ");
        String password = sc.nextLine();

        boolean flagLong = password.length() >= 8;

        boolean flagNumber = false;
        boolean flagUpper = false;
        boolean flagLower = false;
        boolean flagSpecial = false;

        for (char c : password.toCharArray()) {

            if (c >= '0' && c <= '9')
                flagNumber = true;
            else if (c >= 'A' && c <= 'Z')
                flagUpper = true;
            else if (c >= 'a' && c <= 'z')
                flagLower = true;
            else
                flagSpecial = true;
        }

        if (flagLong && flagNumber && flagUpper && flagLower && flagSpecial)
            System.out.println("Password valida");
        else {

            System.out.println("Password non valida");

            if (!flagLong)
                System.out.println("La password deve essere lunga almeno 8 caratteri");

            if (!flagNumber)
                System.out.println("La password deve contenere almeno un numero");

            if (!flagUpper)
                System.out.println("La password deve avere almeno una lettera maiuscola");

            if (!flagLower)
                System.out.println("La password deve avere almeno una lettera minuscola");

            if (!flagSpecial)
                System.out.println("La password deve contenere almeno un carattere speciale");
        }

        sc.close();
    }

    public static void es9() {

        /**
         * Esercizio Bonus 9: Conversione da numero a parola
         * Argomenti trattati: variabili, primitivi, Scanner, syso, array, loop, metodi
         * 
         * Scrivi un programma che converta un numero intero (da 0 a 999) in parole. Per
         * esempio, 123 dovrebbe essere convertito in "centoventitré".
         * Il programma dovrebbe:
         * 
         * Chiedere all'utente di inserire un numero intero tra 0 e 999 utilizzando la
         * classe Scanner.
         * Definire un metodo per la conversione delle centinaia, uno per le decine e
         * uno per le unità.
         * Combinare i risultati dei metodi per formare il numero completo in parole.
         * Stampare il numero in parole.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci un numero intero tra 0 e 999: ");
        String userStrValue = sc.nextLine();
        char[] userCharValue = userStrValue.toCharArray();
        int value = Integer.valueOf(userStrValue);

        sc.close();

        if (value < 0 || value > 999) {

            System.out.println("Out of bounds");
            return;
        }

        String[] unregularValues = {
                "zero", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove", "dieci",
                "undici", "dodici", "tredici", "quattordici", "quindici", "sedici", "diciassette", "diciotto",
                "diciannove"
        };

        if (value < 20) {

            System.out.println(unregularValues[value]);
            return;
        }

        String strValue = "";

        if (value >= 100) {

            String[] hundredsValues = {
                    "", "cento", "duecento", "trecento", "quattrocento", "cinquecento", "seicento", "settecento",
                    "ottocento", "novecento"
            };

            int hundred = value / 100;
            strValue += hundredsValues[hundred];
        }

        String[] tensValues = {
                "", "", "venti", "trenta", "quaranta", "cinquanta", "sessanta", "settanta", "ottanta", "novanta"
        };
        String[] units = { "", "uno", "due", "tre", "quattro", "cinque", "sei", "sette", "otto", "nove" };

        int ten = Integer.valueOf("" + userCharValue[userCharValue.length - 2]);
        int unit = Integer.valueOf("" + userCharValue[userCharValue.length - 1]);

        int fullSubValue = ten * 10 + unit;
        if (fullSubValue > 9 && fullSubValue < 20)
            strValue += unregularValues[fullSubValue];
        else
            strValue += tensValues[ten] + units[unit];

        System.out.println(value + ": " + strValue);

        return;

    }

    /**
     * Metodo che restituisce un array di dimensione dim con valori random compresi
     * tra 0 e 99
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
