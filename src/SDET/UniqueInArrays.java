package SDET;

import java.util.ArrayList;

public class UniqueInArrays {
    public static ArrayList<Integer> findUnique(int arr[]){
        ArrayList <Integer> uniqueList = new ArrayList<>();
        for (int c : arr){

            if(!uniqueList.contains(c)){
                uniqueList.add(c);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        int arr [] = {3,4,6,7,8,9,3,9,3,3,6,7,89,0,0,0,0,0};
        //cool thing arraylist can be printedDirectly.
        System.out.println(findUnique(arr));
    }
}
