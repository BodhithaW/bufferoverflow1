import java.util.Scanner;

public class FixBufferOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] buffer = new char[5]; 

        System.out.print("Enter a string (max 5 characters): ");
        String input = scanner.nextLine(); 

        
        int length = Math.min(input.length(), buffer.length);

        for (int i = 0; i < length; i++) {
            buffer[i] = input.charAt(i);
        }

        System.out.println("Stored data: " + new String(buffer, 0, length));
        scanner.close();
    }
}
