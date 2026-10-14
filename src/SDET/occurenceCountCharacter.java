package SDET;

import static java.lang.Integer.MIN_VALUE;

public class occurenceCountCharacter {
    public static void  characterCount(String str,char c){
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        String str ="avvcvbfsdfsdf";
        characterCount(str,'v');
    }
}
