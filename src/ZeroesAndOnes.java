import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ZeroesAndOnes {
    public static void swapValues(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void sortZeroAndOne(int arr[]){
        int n = arr.length;
        int left =0;
        int right = n-1;

        while (left<right){
            if(arr[left]==1 && arr[right]==0){
                swapValues(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }

    public static void printArray(int arr[]){
        System.out.print("Array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println(); // Add a newline for better formatting
    }


    public static void main(String[] args) {
        System.out.println("Enter the no. elements you want in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input zeroes and ones");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sortZeroAndOne(arr);
        printArray(arr);
        sc.close(); // Close the scanner
    }
}
