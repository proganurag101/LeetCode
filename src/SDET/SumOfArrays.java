package SDET;

import java.util.Scanner;

public class SumOfArrays{

    public static int sumOfArray(int arr[]){
        int total =0 ;
        for (int i: arr){
            total += i;
        }
        return total;
    }

    public static void printArray(int arr[]){
        for (int i : arr){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of elements: ");

        int num = sc.nextInt();
        int arr[] = new int[num];
        for (int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfArray(arr));

    }

}