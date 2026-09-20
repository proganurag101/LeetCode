package SDET;

import java.util.Scanner;

public class multiplyWOoperator{


    public static int mult(int n,int v){
        int tot=0;
        for (int i=0;i<v;i++){
            tot += n;
        }
        return  tot;
    }

    public static void main(String[] args) {
        System.out.println("which number you want to multiply: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("No. you want to multiply with!");
        int value = sc.nextInt();

        System.out.println(mult(number,value));

    }
}
