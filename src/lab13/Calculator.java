package lab13;

public class Calculator {
    //In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului.
    // Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
    //Spre exemplu, pentru metoda de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri, o data cu 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!
    //Apelati metodele in Main pentru a testa daca functioneaza.

    //SUM
    public static int sum(int x, int y){
        return x+y;
    }

    public static float sum(float x, float y){
        return x+y;
    }

    public static float sum(float x, float y, float z){
        return x+y+z;
    }

    public static int sum(int x, int y, int z, int w){
        return x+y+z+w;
    }

    //DECREASED
    public static int decreased(int x, int y){
        return x-y;
    }

    public static float decreased(float x, float y){
        return x-y;
    }

    public static float decreased(float x, float y, float z){
        return x-y-z;
    }

    public static int decreased(int x, int y, int z, int w){
        return x-y-z-w;
    }

    //MULTIPLICATION
    public static int multiplication(int x, int y){
        return x*y;
    }

    public static float multiplication(float x, float y){
        return x*y;
    }

    public static float multiplication(float x, float y, float z){
        return x*y*z;
    }

    public static int multiplication(int x, int y, int z, int w){
        return x*y*z*w;
    }

    //DIVISION
    public static int division(int x, int y){
        return x/y;
    }

    public static float division(float x, float y){
        return x/y;
    }

    public static float division(float x, float y, float z){
        return x/y/z;
    }

    public static int division(int x, int y, int z, int w){
        return x/y/z/w;
    }
}
