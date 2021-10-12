package com.JavaDsaByAtul;

// passing argument in method from main
public class FunctionAndMethodsPart3 {
    public static void main(String[] args) {

        int addition = sum3(20, 30);
        System.out.println(addition);

    }
    static int sum3(int num1, int num2){

        int sum = num1+num2;
        return sum;
    }
}
