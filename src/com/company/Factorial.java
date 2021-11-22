package com.company;

public class Factorial {

    public static long calcFactorial(int n){
        long total=1;
        for(int a=1; a<=n; a++){
            total*=a;
        }
        return total;
    }

    public static double calcE(){
        double e=1;
        double olde= 0;
        int a=1;
        while(e-olde>.001){
            olde=e;
            e+=1.0/calcFactorial(a);
            a++;
        }
       return e;
    }

    public static double calcEx(int x) {
        double e = 1;
        double olde = 0;
        int a = 1;
        while (e-olde > .001) {
            olde = e;
            e += (Math.pow(x, a)) / calcFactorial(a);
            a++;
        }
        return e;
    }
    public static void main(String[] args) {
        System.out.println("calcFactorial");
        for (int a = 1; a <= 20; a++) {
            System.out.println(calcFactorial(a));
        }
        System.out.println("Calc E");
        System.out.println(calcE());

        System.out.println("Calc Ex");
        for (int z = 1; z <= 5; z++) {
            System.out.println(calcEx(z));
        }
    }
}
//calcFactorial
//        1
//        2
//        6
//        24
//        120
//        720
//        5040
//        40320
//        362880
//        3628800
//        39916800
//        479001600
//        6227020800
//        87178291200
//        1307674368000
//        20922789888000
//        355687428096000
//        6402373705728000
//        121645100408832000
//        2432902008176640000
//        Calc E
//        2.7182539682539684
//        Calc Ex
//        2.7182539682539684
//        7.388994708994708
//        20.08546859390609
//        54.5978829056501
//        148.4129510721643