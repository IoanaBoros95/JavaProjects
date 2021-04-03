package lab10;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        //1
        printMyName();
        System.out.println("Suma celor doua numere este:" +suma(1,2));
        System.out.println("Rezultatul impartirii celor doua numere este:" +impartire(10,2));
        System.out.println("Rezultatul operatiei este:" +rez1(5,8,6));
        System.out.println("Rezultatul operatiei este:" +rez2(55,9,9));
        System.out.println("Rezultatul operatiei este:" +rez3(20,-3,5,8f));
        System.out.println("Rezultatul operatiei este:" +rez4(5,15,3,2,8,3));


        //2
        System.out.println("Rezultatul adunarii este: " + sum(2,3));
        System.out.println("Rezultatul scaderii este: " + decreased(5,1));
        System.out.println("Rezultatul imultirii este: " + multiplication(5,2));
        System.out.println("Rezultatul impartirii este: " + division(5,2));

        //3
        printModel1();

        //4
        System.out.println("Restul impartirii este: " + rest(19,2));

        //5
        printModel2();

        //6
        System.out.println("Media numerelor este: " + aritmetic(2,6,8));

        //7
        System.out.println("Temperatura in grade Celsius este: " + toCelsius(77.5));

        //8
        System.out.println("Distanta in metri este: " + distance(40));

        //9.Scrieti o metoda java, care primeste distanta (in metrii) si timpul (ca si 3 numere: ore, minute, secunde), si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)
        double distance = 2500;
        double hr = 5;
        double min = 56;
        double sec = 23;
        double timeSeconds;
        double mps, kph, mph;


        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;
        System.out.println("Viteza in metrii pe secunda este:" +mps);
        System.out.println("Viteza in km pe ora este:" +kph);
        System.out.println("Viteza in mile pe ora este:" +mph);
    }



    //1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare, tot in clasa Main.java, si apoi apelati-le in metoda main().

    public static void printMyName(){

        System.out.println("Hello \nIoana");

    }

    public static int suma(int x, int y) {
        int suma = x+y;
        return suma;
    }

    public static int impartire(int a, int b) {
        int c = a/b;
        return c;
    }

    public static int rez1(int x,int y, int z) {
        int rez1 = (-x+(y*z));
        return rez1;
    }
    public static double rez2(double x, double y, double z) {
        double rez2 = ((x+y) % z);
        return rez2;
    }

    public static double rez3(double x, double y, double z, double w) {
        double rez3 = (x+ (-y*z / w));
        return rez3;
    }

    public static double rez4(double x, double y, double z, double w, double q, double k){
        double rez4 = (x+ (y/ z * w) - (q % k));
        return rez4;
    }

    //2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.
    public static int sum(int first, int second){

        int sum = first + second;

        return sum;

    }

    public static int decreased(int first, int second){

        int decreased = first - second;

        return decreased;

    }

    public static int multiplication(int first, int second){

        int multiplication = first * second;

        return multiplication;

    }

    public static float division(float first, float second){

        float division = first / second;

        return division;

    }

    //3. Scrieti o metoda java, care sa afiseze urmatorul model:
    public static void printModel1() {
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    //4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor.

    public static float aritmetic(float first, float second, float third){

        float aritmetic = (first + second + third) / 3;

        return aritmetic;

    }

    //5.Scrieti o metoda java, care sa afiseze urmatorul model:
    public static void printModel2() {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
    }

    //6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere.
    public static double rest(double first, double second){

        double rest = (first % second);

        return rest;

    }

    //7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit, si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (F -32)
    public static double toCelsius(double f){
        double c;
        c= (5/9f * (f -32f));
        return c;
    }

    //8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real, care sa reprezinte distanta in inch, si sa returneze distanta in metrii
    public static double distance(double inch){
        double m;
        m= inch * 0.0254;
        return m;
    }
}