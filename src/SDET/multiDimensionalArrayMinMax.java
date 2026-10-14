package SDET;

import java.util.Scanner;

import static java.lang.Integer.*;

public class multiDimensionalArrayMinMax {
    public static void minMax(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        int max = MIN_VALUE;
        int min = MAX_VALUE;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Min: "+min + " Max: "+ max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{0,1,2,3,4,5,6},
                       {6,3,4,5,6,7,31}
        };
        minMax(arr);

    }
}
