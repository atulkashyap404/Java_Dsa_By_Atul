package com.JavaDsaByAtul;

import java.util.Scanner;

public class FunctionAndMethods {
    public static void main(String[] args) {

        sum();
    }
    static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter the number 2: ");
        int num2=sc.nextInt();
        int sum = num1+num2;
        System.out.println(sum);
    }
}
