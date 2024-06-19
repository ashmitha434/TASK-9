import java.util.Scanner;

public class StarPatternTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        printPattern(rows);

        scanner.close();
    }
    public static void printPattern(int numRows) {
        for (int i = 0; i < numRows; i++){
            if (i == numRows / 2 ){
                for (int j = 0; j < numRows / 2; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
            }
            System.out.println();
            }
        }
        
    }
    

