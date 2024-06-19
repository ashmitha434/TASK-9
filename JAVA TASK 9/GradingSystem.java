import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks scored by the student:");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100){
            System.out.println("Invalid Input");
        } else {
            char grade = calculateGrade(marks);
            System.out.println("Grade: " + grade);
        }
        scanner.close();
    }
    public static char calculateGrade(int marks) {
        if (marks >= 90 && marks <= 100){
            return 'A';
        } else if (marks >= 80 && marks <= 89) {
            return 'B';
        } else if (marks >= 70 && marks <= 79){
            return 'C';
        } else if (marks >= 60 && marks <= 69){
            return 'D'; 
        } else if (marks >= 50 && marks <= 59){
            return 'E';
        } else {
            return 'F';
        }
        
    }
    
}
