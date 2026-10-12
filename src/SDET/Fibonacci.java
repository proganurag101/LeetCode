package SDET;

public class Fibonacci {
    public static void createFibonacci(){

        int prev = 0;
        int curr = 1;
        int tot =  0;
        for (int i=0;i<6;i++){
            tot = prev + curr;
            System.out.println(tot);
            prev = curr;
            curr = tot;


        }
    }

    public static void main(String[] args) {
        createFibonacci();
    }
}
