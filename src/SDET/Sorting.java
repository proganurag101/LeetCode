package SDET;

public class Sorting {

    public static void SortAscending(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void sortDescending(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr [] = {2,35,2,3,534,43};
        SortAscending(arr);

        for( int i : arr){
            System.out.print(i+" ");
        }

        System.out.println();

        sortDescending(arr);
        for( int i : arr){
            System.out.print(i+" ");
        }
    }
}
