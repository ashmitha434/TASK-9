import java.util.Scanner;

public class ReversedStringTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String reversedString = reverse(input);

        System.out.println("Reversed string:" + reversedString);


        scanner.close();
    }
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i>= 0; i--){
            reversed.append(str.charAt(i));
        }
return reversed.toString();
    }
    
      
}






   
    

 


