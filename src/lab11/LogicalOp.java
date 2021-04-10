package lab11;

import java.sql.SQLOutput;

public class LogicalOp {

    //3.In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    //4.Creati o metoda de tip String, care sa primeasca un parametru de tip String. Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”. Daca da, atunci metoda sa returneze “Learning text comparison”. Daca nu, atunci metoda sa returneze “Got to try some more”.
    public String compareTexts(String first, String second) {
        if ( first.equals(second) ) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    //5.Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.
    public String checkNumberAndText( String text, int number)
    {
        if (text.equals("FastTrackIT") && number <= 3) {
           return (text + number);
        }else if (!text.equals("FastTrackIT") && number >= 4) {
           return  (number + text);
        }else {
            return "";
        }
    }

    //6. Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.
    public String checkNumbers( int number) {
        if (number > 8 || number == 6) {
            return ("The amount of snow this winter was(cm): " + number);
        } else if (!(number > 8 || number == 6)) {
            return ("The forecast snow is(cm):" + number);
        } else {
            return "";
        }
    }

    //7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar. Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.
     public String verifyNumber (int number) {
        if(number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if(number == 4) {
            return "The number is equal to 4";
        } else if( number < 3) {
            return "The number is lower than 3";
        } else {
            return "";
        }
     }

     //8.Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
    // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public void displayNumber (int x) {
        switch (x) {
            case 0:
                System.out.println("The number os 0!");
                break;
            case 1:
                System.out.println("The number is 1!");
                break;
            case 2:
                System.out.println("The number is 2!");
                break;
            case 3:
                System.out.println("The number is 3!");
                break;
            case 4:
                System.out.println("The number is 4!");
                break;
            case 5:
                System.out.println("The number is 5!");
                break;
            case 6:
                System.out.println("The number is 6!");
                break;
            case 7:
                System.out.println("The number is 7!");
                break;
            case 8:
                System.out.println("The number is 8!");
                break;
            case 9:
                System.out.println("The number is 9!");
                break;
            default:
                System.out.println("Not is a number!");
        }
    }

    //9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
    // Daca numarul e par sa returneze true iar daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.
    public boolean isNumberEven( int number) {
        if (number % 2 == 0 ) {
            return true;
        } else {
            return false;
        }
    }

    //10.Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
    // Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.
    public boolean isEligibleToVote(int number){
        if(number > 18) {
            return true;
        } else {
            return false;
        }
    }

    //11.Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int bigNumber (int first, int second, int third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third){
            return second;
        } else if (third > first && third > second) {
            return third;
        } else {
            return 0;
        }
    }
}
