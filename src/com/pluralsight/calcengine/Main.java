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
    }
}
