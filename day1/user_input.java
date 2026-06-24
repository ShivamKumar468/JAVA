import java.util.Scanner; // 1. Import the Scanner class

public class user_input {
    public static void main(String[] args) {
        // 2. Create a Scanner object to read from the console
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        // 3. Read a line of text from the user
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        // 4. Read an integer from the user
        int age = input.nextInt();
        
        // 5. Output the collected input
        System.out.println("Hello " + name + "! You are " + age + " years old.");
        
        // 6. Close the scanner to free up resources
        input.close();
    }
}

