import java.util.Scanner;



public class Main {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int arr[],int start,int end){

        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void rotateInPlace(int arr[],int k){
        int n = arr.length;
        k = k%n; // to take out exact no of rotations.
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        printArray(arr);
    }



    public static void printArray(int arr[]){
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many elements you want to insert?");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        rotateInPlace(arr,101);



    }
}