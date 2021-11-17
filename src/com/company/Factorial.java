package com.company;

public class Factorial {

    public static int calcFactorial(int n){
        int total=1;
        for(int a=1; a<=n; a++){
            total*=a;
        }
        return total;
    }



    public static void main(String[] args) {
        System.out.println("calcFactorial");
        for(int a=1; a<=10; a++){
            System.out.println(calcFactorial(a));
        }
    }
}
