package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
        double var1 = 100.0d;
        double val2 = 0.0d;
        double result;

        char opCode = 'd';

        if (opCode == 'a') {
            result = var1 + val2;
        } else if (opCode == 's') {
            result = var1 - val2;
        } else if (opCode == 'd') {
            result = val2 != 0.0d ? var1 / val2 : 0.0d;
        } else if (opCode == 'm') {
            result = var1 * val2;
        } else {
            System.out.println("Error - invalide code");
            result = 0.0d;
        }

        System.out.println(result);

        int kVal = 5;
        int factorial = 1;

        // with block statement
//        while(kVal > 1) {
//            factorial *= kVal;
//            kVal -= 1;
//        }

        // without block statement;
        while(kVal > 1)
            factorial *= kVal--;

        System.out.println("Factorial " + factorial);


        // do loop example
        int iVal = 5;
        do {
            System.out.print(iVal);
            System.out.print(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        } while(iVal < 30);

        // for loop example

        for (int iValG = 1; iValG < 100; iValG++) {
            System.out.println(iValG);
        }

        // array example
        float[] theVals = {12.0f, 32.0f, 42.0f};

        float sum = 0.0f;

        for(float currentVal: theVals)
            sum += currentVal;

        System.out.println("SUM " + sum);

        int switchIVal = 10;
        switch(switchIVal % 2) {
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
