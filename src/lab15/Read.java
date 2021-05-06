package lab15;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
    public int readInt(){
        int number = 0;
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextInt();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    //2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
    // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)
    public float readFloat(){
        float number = 0;
        boolean repeat = true;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextFloat();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public double readDouble(){
        double number = 0;
        boolean repeat = false;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextDouble();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    public long readLong(){
        long number = 0;
        boolean repeat = false;
        while(repeat){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                number = scanner.nextLong();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid value, please enter a number: ");
            }finally {
                System.out.println("Thank you for asking for help!");
            }
        }
        return number;
    }

    //3.In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
    // Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.

    public int[] getArray(int size){
        int[] array = new int[size];
        System.out.println("Populating the array with values.");
        for(int i = 0; i< size;i++){
            array[i] = readInt();
        }
        System.out.println("Array populated");
        return array;
    }

    //4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura. Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
    // (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
    public List<Integer> getList(){
        //Executa bucla pana cand se introduce o valoare gresita, care nu e numar,atunci codul intra in catch unde avem un break
        //care ne scoate din while.
        List<Integer> list = new ArrayList<>();
        while(true){
            try{
                System.out.print("Please enter a number: ");
                Scanner scanner =new Scanner(System.in);
                int number = scanner.nextInt();
                list.add(number);
            }catch (InputMismatchException e){
                System.out.println("An invalid value was entered.");
                break;
            }
        }
        return list;
    }
}
