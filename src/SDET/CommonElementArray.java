package SDET;

import java.util.ArrayList;

public class CommonElementArray {

    public static ArrayList <Integer> commonElementInArray(int arr1[],int arr2[]){
        int n1= arr1.length;
        int n2 = arr2.length;
        int n3 = (n1<n2)?n1:n2;    //we can use Math.min(n1,n2);

        ArrayList<Integer> mylist = new ArrayList<>();
        System.out.println(n3);
        for(int i=0;i<n3;i++){
            if(arr1[i]==arr2[i]){
               mylist.add(arr1[i]);

            }
        }

        return mylist;
    }

    public static void printArray(ArrayList<Integer> list){
        for (int i : list){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,4,5,6,7,8,9};
        int arr2[] = {2,2,4,4,5,4,8};

        printArray(commonElementInArray(arr1,arr2));
    }
}
