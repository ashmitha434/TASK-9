import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)){
            System.out.println("The string \"" + input + "\" is a Palindrome.");


        } else{
            System.out.println("The string \"" + input +  "\" is  not a palindrome.");
        }
        scanner.close();
    }
        public static boolean isPalindrome(String str){
            int length = str. length();
            for (int i = 0; i < length / 2; i++){
                if (str.charAt(i) != str.charAt(length - i - 1)){
                    return false;
                }
            }
            return true;
        }
        

    }
    

