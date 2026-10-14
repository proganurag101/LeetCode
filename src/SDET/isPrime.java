package SDET;

import java.util.Scanner;

public class isPrime {
    public static void isPrime(int n) {
        boolean flag = true;
        if (n <= 1) {
            flag = false;
        } else {
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            System.out.println("isPrime!");
        } else {
            System.out.println("Not Prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);

    }

}
