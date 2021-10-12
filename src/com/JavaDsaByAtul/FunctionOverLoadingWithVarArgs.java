package com.JavaDsaByAtul;

import java.util.Arrays;

public class FunctionOverLoadingWithVarArgs {
    public static void main(String[] args) {

        fun(1, 2, 3, 4, 5);

        fun("Atul", "Kumar", "Manjhi");  // you can run this as oper your choice

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));

    }
}
