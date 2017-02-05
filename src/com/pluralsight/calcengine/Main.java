package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double[] leftVals = {100.0d, 25.0d, 225.d, 11.0d};
        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
        char[] opCodes = {'d', 'a', 's', 'm'};
        double[] results = new double[opCodes.length];

//        double var1 = 100.0d;
//        double val2 = 0.0d;
//        double result;
//        char opCode = 'd';

        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'd':
                    results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
                    break;
                case 'm':
                    results[i] = rightVals[i] * leftVals[i];
                    break;
                default:
                    System.out.println("Error - invalide code");
                    results[i] = 0.0d;
                    break;
            }
        }

        for (double theResult : results) {
            System.out.print("the result = ");
            System.out.println(theResult);
        }

        int kVal = 5;
        int factorial = 1;

        // with block statement
//        while(kVal > 1) {
//            factorial *= kVal;
//            kVal -= 1;
//        }

        // without block statement;
        while (kVal > 1)
            factorial *= kVal--;

        System.out.println("Factorial " + factorial);


        // do loop example
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while (iVal < 30);

        // for loop example

        for (int iValG = 1; iValG < 100; iValG++) {
            System.out.println(iValG);
        }

        // array example
        float[] theVals = {12.0f, 32.0f, 42.0f};

        float sum = 0.0f;

        for (float currentVal : theVals)
            sum += currentVal;

        System.out.println("SUM " + sum);

        int switchIVal = 10;
        switch (switchIVal % 2) {
            case 0:
                System.out.print(switchIVal);
                System.out.print(" is even");
                break;
            case 1:
                System.out.print(switchIVal);
                System.out.print(" is odd");
                break;
            default:
                System.out.println("oops it broke");
                break;
        }

    }
}
