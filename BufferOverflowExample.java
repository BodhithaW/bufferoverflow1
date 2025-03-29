import java.util.Scanner;

public class BufferOverflowExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] buffer = new char[5]; 

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); 

        
        for (int i = 0; i < input.length(); i++) {
            buffer[i] = input.charAt(i); 
        }

        System.out.println("Stored data: " + new String(buffer));
        scanner.close();
    }
}