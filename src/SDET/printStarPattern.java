package SDET;

public class printStarPattern {

    public static void printPattern(){
        int row = 3;
        int col = 4;

        for (int i=0;i<=row;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printPattern();
    }
}
