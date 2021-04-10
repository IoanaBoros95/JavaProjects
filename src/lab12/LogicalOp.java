package lab12;

public class LogicalOp {
    //FOR LOOP

    //1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void printToHundred(int number)  {
        for(int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void getDescending(int number)  {
        for(int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void getCount(int x, int y) {
        for(int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void getIncreasingCounters(int x, int y) {
        if (x > y) {
            for (int i = x; i >= y; y++)
                System.out.println(y);
        }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void getEvenNumbers(int number) {
        for(int i = number; i<= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void getOddNumbers(int number) {
        for(int i = number; i<= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public float getSum(int number, int sum) {
        for(int i = number; i<= 100; i++) {
            sum += i;
        }
        return sum;
    }

    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor.
    // La final, metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float sumAndAverage (int number, int sum) {
        for(int i = number; i<= 100; i++) {
            sum += i;
        }
        float average = sum / 100f;
        return average;
    }

    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    public void printStars(){
        int i,j;
        for(i=0;i<=6;i++){
            for(j=1;j<=7-i;j++) System.out.print("*");
            System.out.println("");
        }
    }

    //WHILE LOOP
    //1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void printToHundred2(int number) {
        while (number <= 100) {
            System.out.println(number);
            number++;
        }
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
    // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void getDescending2(int number)  {
        while (number >= -100) {
            System.out.println(number);
            number--;
        }
    }

    //3.Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
    public void getCount2(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }

    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void getIncreasingCounters2(int x, int y) {
        if (x > y) {
            do {
                System.out.println(y);
                y++;
            } while (x >= y);
        }
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void getEvenNumbers2(int number) {
        while( number <= 100 )
        {
            if( (number % 2) == 0 )
            {
                System.out.println(number);
            }
            number++;
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void getOddNumbers2(int number) {
        while( number <= 100 )
        {
            if( (number % 2) != 0 )
            {
                System.out.println(number);
            }
            number++;
        }
    }

    //7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899.
    // Sa se afiseze suma totala, iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval.
    // Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public void sumAndAverage2() {
        int number = 8899;
        int i = 111;
        int sum = 0;
        double count = 0;
        while(i <= number) {
            sum += i;
            i++;
            count++;
        }
        System.out.println("Suma numerelor este:" +sum);
        System.out.println("Media numerelor este:" + (float) (sum / count));
    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float getAverageDiv7(int x, int y) {
        double sum = 0;
        double count = 0;
        while (x <= y) {
            sum += x % 7;
            x++;
            count++;
        }
        return (float) (+sum/count);
    }


    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.
     public void getFibonacci() {
        int count = 20;
        int i = 1;
        int num1 = 0;
        int num2 = 1;
         while (i <= count)
         {
             System.out.println(num1);
             int sum = num1 + num2;
             num1 = num2;
             num2 = sum;
             i++;
         }
     }

     //10. Creati o metoda numita CozaLozaWoza. Metoda va afisa:
    //
    //- numerele de la 1 la 110
    //
    //- 11 numere pe linie
    //
    //- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
    //
    //- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
    //
    //- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
    //
    //- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
    //
    //- se va afisa CozaWoza pentru multiplu de 3 SI 7
    //
    //- se va afisa WozaLoza pentru multiplu de 5 SI 7
    //
    //- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7

    public void printCozaLozaWoza(int number)
    {
        int i = number;
        while (i <= 110) {
            boolean test = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                test = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                test = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                test = true;
            }
            if (!test) {
                System.out.print(i);
            }
            System.out.print(" ");
            if (i % 11 == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
