import java.util.Scanner;

public class FrequencyArray {
    public static void frequencyArray(int freq[],int num){
        if(freq[num]>0){
            System.out.println("Number is present :) ");
        }else{
            System.out.println("Number is not present!");
        }

    }




    public static void main(String[] args) {
        System.out.println("State no. of elements you want in array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Insert the elements");
        for (int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        int freq[] = new int[100000];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }
        System.out.println("Enter no. of queries");
        int queries = sc.nextInt();

        while(queries>0){
            System.out.println("Enter the element you want to search");
            int num = sc.nextInt();
            frequencyArray(freq,num);
            queries--;
        }
        System.out.println("Thank you :)");

    }
}
