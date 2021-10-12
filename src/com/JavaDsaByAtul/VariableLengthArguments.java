package com.JavaDsaByAtul;

import java.util.Arrays;

public class VariableLengthArguments {
    public static void main(String[] args) {

      fun(1, 2, 3, 4, 5, 6,34,23, 21);

      multiple(12, 34, "Atul", "Kumar", "Manjhi");
    }
    // Taking multiple arguments at a time with different data types
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void  fun(int ...v){

        System.out.println(Arrays.toString(v));

    }
}
