package lab11;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //1
        Calculator calc = new Calculator();

        System.out.println(calc.sum(2,3));
        System.out.println(calc.impartire(10,2));
        System.out.println(calc.rez1(5,8,6));
        System.out.println(calc.rez2(55,9,9));
        System.out.println(calc.rez3(20,-3,5,8f));
        System.out.println(calc.rez4(5,15,3,2,8,3));
        System.out.println(calc.sum(2,2));
        System.out.println(calc.decreased(10,6));
        System.out.println(calc.multiplication(10,5));
        System.out.println(calc.division(5,2));
        System.out.println(calc.rest(19,2));
        System.out.println(calc.aritmetic(5,9,12));
        System.out.println(calc.toCelsius(400));
        System.out.println(calc.distance(5));

        //3
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(20,50);
        System.out.println("The bigger number is: " + biggest);

        //4
        System.out.println(op.compareTexts("FastTrackIT","FastTrackit"));

        //5
        System.out.println(op.checkNumberAndText("FastTrackIT", 1));

        //6
        System.out.println(op.checkNumbers(3));

        //7
        System.out.println(op.verifyNumber(2));

        //8
        op.displayNumber(5);

        //9
        System.out.println(op.isNumberEven(2));

        //10
        System.out.println(op.isEligibleToVote(16));

        //11
        System.out.println(op.bigNumber(10, 20 , 5));
    }
}
