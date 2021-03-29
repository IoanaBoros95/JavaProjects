public class Main {

    public static void main(String[] args) {
        // 1.Printati "Hello" in consola, iar pe rand nou, printati numele vostru.
        System.out.println("Hello");
        System.out.println("Ioana");

        // 2.Printati rezultatul sumei a doua numere(orice numere)

        int x = 1;
        int y = 2;
        int sum = x+y;
        System.out.println("Suma celor doua numere este:" +sum);

        // 3.Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.

        int a = 10;
        int b = 2;
        int c = a/b;
        System.out.println("Rezultatul impartirii celor doua numere este:" +c);

        // 4.Printati rezultatul urmatoarelor operatiuni:

        // a
        int d = -5+8*6;
        System.out.println("Rezultatul operatiei de la punctul a este:" +d);

        //b
        double e = (55+9) % 9;
        System.out.println("Rezultatul operatiei de la punctul b este:" +e);

        //c
        double f = 20 + -3*5 / 8;
        System.out.println("Rezultatul operatiei de la punctul c este:" +f);

        //d
        double g = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println("Rezultatul operatiei de la punctul d este:" +g);
    }
}
