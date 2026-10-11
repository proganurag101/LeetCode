import java.util.Scanner;

public class SquareArrayNonDecreasing {
    public static int [] squareArray(int arr[]){
        int n= arr.length;
        int left=0;
        int right=n-1;
        int ans[] = new int[n];
        int k=n-1; // we want to put values from end to start that biggest will be on the right.
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k--] = arr[left]*arr[left];   //initially k=0 as its post increment operator
                left++;
            }else{                 //if right is bigger or equal
                ans[k--] = arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter no. of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        int ans[]= squareArray(arr);
       printArray(ans);

    }
}
