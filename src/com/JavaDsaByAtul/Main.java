package com.JavaDsaByAtul;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println("Enter the number a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=a;
        if(b>max) {
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println("The large value in abc is :"+ max);
    }
}
