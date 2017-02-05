package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        double[] leftVals = {100.0d, 25.0d, 225.d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];


        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.d, 50.0d, 'd');
        equations[1] = create(25, 92.0d, 'a');
        equations[2] = create(225, 17.0d, 's');
        equations[3] = create(11, 3.0d, 'm');

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("the result = ");
            System.out.println(equation.getResult());
        }

//        int kVal = 5;
//        int factorial = 1;

        // with block statement
//        while(kVal > 1) {
//            factorial *= kVal;
//            kVal -= 1;
//        }

        // without block statement;
//        while (kVal > 1)
//            factorial *= kVal--;
//
//        System.out.println("Factorial " + factorial);


        // do loop example
//        int iVal = 5;
//        do {
//            System.out.print(iVal);
//            System.out.print(" * 2 = ");
//            iVal *= 2;
//            System.out.println(iVal);
//        } while (iVal < 30);

        // for loop example

//        for (int iValG = 1; iValG < 100; iValG++) {
//            System.out.println(iValG);
//        }

        // array example
//        float[] theVals = {12.0f, 32.0f, 42.0f};
//
//        float sum = 0.0f;
//
//        for (float currentVal : theVals)
//            sum += currentVal;
//
//        System.out.println("SUM " + sum);
//
//        int switchIVal = 10;
//        switch (switchIVal % 2) {
//            case 0:
//                System.out.print(switchIVal);
//                System.out.print(" is even");
//                break;
//            case 1:
//                System.out.print(switchIVal);
//                System.out.print(" is odd");
//                break;
//            default:
//                System.out.println("oops it broke");
//                break;
//        }

    }

    public static MathEquation create(double leftVal, double rightVal, char opCode) {
        MathEquation equation = new MathEquation();

        equation.setLeftVal(leftVal);
        equation.setRightVal(rightVal);
        equation.setOpCode(opCode);

        return equation;
    }
}
