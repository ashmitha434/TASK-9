import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();

        printPattern(rows);

        scanner.close();    
}
public static void printPattern(int numRows) {
    int currentNum = 2;
    for (int i = 0; i< numRows; i++){
        for (int j = 0; j<= i; j++) {
            System.out.println(currentNum + "");
            currentNum++;
        }
        System.out.println();
    }
    
}

 
    }
