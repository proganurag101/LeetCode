package SDET;

import java.util.Scanner;

public class PalindromReverse {
    public static void palindromCheck(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
            newStr += str.charAt(str.length()-i-1);
        }
        System.out.println(newStr);

        if(str.equals(newStr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        palindromCheck(str);

    }
}
