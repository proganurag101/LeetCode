package SDET;

import java.util.Scanner;

public class AdjacentMaxDifference {
    public static int AdjacentDifference(int arr[]){
        int Diff = 0;
        int maxDiff = 0;
        for (int i=0;i<arr.length-1;i++){
            Diff = arr[i+1] - arr[i];
            if(Diff>maxDiff){
                maxDiff = Diff;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        System.out.println("No of elements in Array req.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(AdjacentDifference(arr));
    }
}
