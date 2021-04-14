package lab13;

public class LogicalOp {
    //2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    // Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.
    public void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }
    }

    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
    public void printEventNumbers(int[] array) {
       for  (int i = 0; i < array.length; i++) {
           if (array[i] % 2 == 0) {
               System.out.println(array[i]);
           }
       }
    }


    //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.

    public float getAverageFromArray(int[] array) {
        float sum = 0f;
        for (int i = 0; i< array.length; i++) {
            sum = array[i] + sum;
        }
        float average  = (sum/(float)array.length);
        return average;
    }

    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
    // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isInArray(String[] array, String text) {
        for(int i = 0; i< array.length; i++) {
            if(array[i].equals(text)) {
                return true;
            }
        }
        return false;
    }

    //6.Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int isInArray(int[] array, int number) {
        for(int i = 0; i< array.length; i++) {
            if(array[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //7.Creati o metoda care sa afiseze urmatoarea grila, folosind un array:
    public void printModel() {
        String [][] modelGrid = new String[10][10];
        for(int row = 0; row < 10; row++) {
            for (int column = 0; column < 10; column++) {
                modelGrid[row][column] = "- ";
                System.out.print(modelGrid[row][column]);
            }
            System.out.println();
        }
    }

    //8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public void removeNumber(int[] array, int number) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                for(int j = i; j < array.length - 1; j++){
                    array[j] = array[j+1];
                }
                break;
            }
        }
        for(int i = 0; i < array.length-1; i++){
            System.out.println(array[i]);
        }
    }

    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int returnSmallNumber(int[] array) {
        int first = array.length;
        int second = array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < first) {
                second = first;
                first = array[i];

            } else if (array[i] < second && array[i] != first)
                second = array[i];
        }
        return second;
    }

    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public void copyArray() {
        int[] firstArray  = new int[]{1,2,3,4,5};
        int[] secondArray = new int[firstArray.length];
        for (int i=0; i<firstArray.length; i++) {
            secondArray[i] = firstArray[i];
            System.out.print(secondArray[i] + " ");
        }
    }
}
