package SDET;

import java.util.Scanner;



public class Swapping {
    public static void swapTemp(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a: "+ a + " b: "+b);

    }

    public static void swapWoTemp(int a,int b){   //7 , 2     4,8   9,10
        a = a - b ;
        b = a + b;
        a = b - a;

        System.out.println("a: "+ a + " b: "+b);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a: "+ a + " b: "+b);
        swapTemp(a,b);
        swapWoTemp(a,b);
    }
}
