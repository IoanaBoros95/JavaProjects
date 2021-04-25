package lab14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class LogicalOp {

    //1.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
    public void printList(List<String> myList) {
        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    //2.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addValueToList(List<Integer> l, Integer value){
        l.add(value);
    }

    //3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printListFromIndex(List<String> list, int index) {
        for(int i = index; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    //4.Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public void printDescendingList(List<String> list) {
        for (int i = list.size(); i-- > 0;) {
            System.out.println(list.get(i));
        }
    }

    //5.Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de tip intreg, si unul de tip String.
    // Metoda sa adauge parametrul de tip String in lista primita, iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
    public void addStringToList(List<String> list, int position, String value) {
        list.add(position, value);
    }

    //6.Scrieti o metoda Java, care sa primeasca doi parametrii.
    // Primul dintre ei va fi o Lista, iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public void addParameterToFirstPosition(List<String> list, String value) {
        for (int j = 2; j > 0; j--) {
            list.set(j, list.get(j - 1));
        }
        list.set(0, value);
    }

    //7.crieti o metoda Java care sa primeasca parametru o Lista, si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public void printValueAndIndex(List<String> myList) {
        for(int i = 0; i<myList.size();i++) {
            System.out.println("Pe pozitia " + i + " valoarea este " + myList.get(i));
        }
    }

    //8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public int getHighestNumber(List<Integer> list) {
        int x = 0;
        for(int i = 0; i< list.size();i++) {
            if(x < list.get(i)) {
                x = list.get(i);
            }
        }
        return x;
    }


    //Optional
    //1.Scrieti o metoda Java care sa schimbe pozitia a doua elemente intr-o Lista.
    public void changePosition(List<String> list) {
        Collections.swap(list, 2 , 1);
    }

    //2.Scrieti o metoda Java care sa primeasca o Lista si sa returneze o alta lista, care sa contina doar numerele pare din lista primita.
    public List<Integer> getEvenList(List<Integer> originalList) {
        List<Integer> secondList = new ArrayList<>();
        for (int i = 0; i< originalList.size();i++) {
            if(originalList.get(i) % 2 == 0) {
                secondList.add(originalList.get(i));
            }
        }
        return secondList;
    }

    //3.Scrieti o metoda Java care sa primeasca parametru o Lista nesortata, si sa returneze Lista sortata crescator.
    // Atentie, sortarea sa se faca programatic(adica logica sa fie scrisa de voi), si nu folosit librarie externa, precum Collection.sort().
    public List<Integer> getSortedList(List<Integer> list) {
        int count = 0;
        for(int i=0;i<list.size()-1;i++){
            int m = i;
            for(int j=i+1;j<list.size();j++){
                if(list.get(m) > list.get(j))
                    m = j;
            }
            count = list.get(i);
            list.set(i, list.get(m));
            list.set(m, count);
        }
        return list;
    }
}
