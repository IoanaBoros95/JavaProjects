package lab13;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        //1
        System.out.println("Suma numerelor este:" +calc.sum(4,5));
        System.out.println("Suma numerelor este:" +calc.sum(4,56.7f));
        System.out.println("Suma numerelor este:" +calc.sum(4,51.2f,44.3f));
        System.out.println("Suma numerelor este:" +calc.sum(4,5,8,90));

        System.out.println("Rezultatul scaderii numerelor este:" +calc.decreased(20,4));
        System.out.println("Rezultatul scaderii numerelor este:" +calc.decreased(29.4f,4));
        System.out.println("Rezultatul scaderii numerelor este:" +calc.decreased(200,44.2f,6));
        System.out.println("Rezultatul scaderii numerelor este:" +calc.decreased(222,4,40,10));

        System.out.println("Rezultatul inmultirii numerelor este:"+ calc.multiplication(50,6));
        System.out.println("Rezultatul inmultirii numerelor este:"+ calc.multiplication(50,6.3f));
        System.out.println("Rezultatul inmultirii numerelor este:"+ calc.multiplication(50,6,2.2f));
        System.out.println("Rezultatul inmultirii numerelor este:"+ calc.multiplication(50,6,4,5));

        System.out.println("Rezultatul impartirii numerelor este:" +calc.division(80,2));
        System.out.println("Rezultatul impartirii numerelor este:" +calc.division(80,22.3f));
        System.out.println("Rezultatul impartirii numerelor este:" +calc.division(80,4,6.2f));
        System.out.println("Rezultatul impartirii numerelor este:" +calc.division(80,2,8,4));


        LogicalOp op = new LogicalOp();
        //2
        int[] myArray = new int[100];
        op.printArray(myArray);

        //3
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
                51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        op.printEventNumbers(array);

        //4
        int[] secondArray = {4, 6, 9};
        System.out.println(op.getAverageFromArray(secondArray));

        //5
        String[] myStringsList = new String[5];
        myStringsList[0] = "Ioana";
        myStringsList[1] = "Paul";
        myStringsList[2] = "Marius";
        myStringsList[3] = "Maria";
        myStringsList[4] = "Florina";

        System.out.println(op.isInArray(myStringsList, "Ioana"));

        //6
        int[] array1 = {1, 6, 9, 2};
        System.out.println(op.isInArray(array1, 9));

        //7
        op.printModel();

        //8
        int[] arr = {1, 2, 3, 4, 5};
        op.removeNumber(arr,3);

        //9
        int[] arr1 = {1, 6, 9, 2};
        System.out.println(op.returnSmallNumber(arr1));

        //10
        op.copyArray();
    }
}