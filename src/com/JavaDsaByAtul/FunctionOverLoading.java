package com.JavaDsaByAtul;

public class FunctionOverLoading {
    public static void main(String[] args) {

        fun(34);
        fun("AtulKumar");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
