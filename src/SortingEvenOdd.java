import java.util.Scanner;


public class SortingEvenOdd {
    public static void swapValues(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    public static void sortEvenOdd(int arr[]){
        int n = arr.length;
        int left=0;
        int right = n-1;
        while (left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                swapValues(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2==1){
                right--;
            }
        }
    }
    public static void printArray(int arr[]){
        System.out.print("Array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Enter the no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Input the elements!");
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        sortEvenOdd(arr);
        printArray(arr);
    }

}
