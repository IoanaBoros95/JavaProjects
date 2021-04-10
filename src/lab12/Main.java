package lab12;

public class Main {
    public static void main(String[] args) {
       LogicalOp op = new LogicalOp();

        //FOR LOOP
        //1
        op.printToHundred(6);
        //2
        op.getDescending(-1);
        //3
        op.getCount(1,6);
        //4
        op.getIncreasingCounters(80,40);
        //5
        op.getEvenNumbers(1);
        //6
        op.getOddNumbers(1);
        //7
        System.out.println("Suma numerelor pana la 100 este:" +op.getSum(1,0));
        //8
        System.out.println("Media numerelor pana la 100 este:" +op.sumAndAverage(1, 0));
        //9
        op.printStars();

        //WHILE LOOP
        //1
        op.printToHundred2(1);

        //2
        op.getDescending2(-1);

        //3
        op.getCount2(4,20);

        //4
        op.getIncreasingCounters2(80,60);

        //5
        op.getEvenNumbers2(1);

        //6
        op.getOddNumbers2(1);

        //7
        op.sumAndAverage2();

        //8
        System.out.println("Media numerelor divizibile cu 7 este:" +op.getAverageDiv7(1,100));

        //9
        op.getFibonacci();

        //10
        op.printCozaLozaWoza(1);
    }
}
