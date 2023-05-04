import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static char getoperatore(char operatore){
        return operatore;
    }
    public static int getop2(int op2){
        return op2;
    }

    public static int getop1(int op1){
        return op1;
    }
    public static char operatore() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Operatore: ");
        char operatore = reader.next().charAt(0);
        System.out.println();

        return operatore;
    }

    public static int secondo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Secondo operando: ");
        int op2 = input.nextInt();
        System.out.println();

        return op2;
    }

    public static int primo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Primo operando: ");
        int op1 = input.nextInt();
        System.out.println();

        return op1;
    }

    public static double divisione(int op1, int op2) {
        double quoziente = op1 / op2;
        return quoziente;
    }

    public static int moltiplicazione(int op1, int op2) {
        int prodotto = op1 * op2;
        return prodotto;
    }

    public static int sottrazione(int op1, int op2) {
        int differenza = op1 - op2;
        return differenza;
    }

    public static int somma(int op1, int op2) {
        int somma = op1 + op2;
        return somma;
    }

    public static void main(String[] args) throws InputMismatchException, ArithmeticException {

        Scanner input = new Scanner(System.in);
        boolean controllo = false;

        int op1 = 0;
        int op2 = 0;
        char operatore = 0;

        try {
             op1 = primo();
             op2 = secondo();
             operatore = operatore();

        } catch (Exception e) {
            System.out.println("Il tipo deve essere un INTERO, reinseriscilo");
            main(args);
        }

        try {
            getop1(op1);
            getop2(op2);
            getoperatore(operatore);

            switch (operatore) {

                case '+':
                    System.out.println(somma(op1, op2));
                    break;

                case '-':
                    System.out.println(sottrazione(op1, op2));
                    break;

                case '*':
                    System.out.println(moltiplicazione(op1, op2));
                    break;

                case '/':
                    System.out.println(divisione(op1, op2));
                    break;
            }
        } catch (Exception e) {
            System.out.println("L'operazione non è matematicamente possibile, immetti di nuovo i valori");
            main(args);
        }
    }

}
