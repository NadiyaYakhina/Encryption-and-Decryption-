// Build menu for encrypting and decrypting

import java.util.Scanner;

public class Main {

    public static void printLogo() {
        System.out.println("  _______ _   _ _______ ______ _____  ______ _______ ");
        System.out.println(" |__   __| \\ | |__   __|  ____|  __ \\|  ____|__   __|");
        System.out.println("    | |  |  \\| |  | |  | |__  | |__) | |__     | |   ");
        System.out.println("    | |  | . ` |  | |  |  __| |  _  /|  __|    | |   ");
        System.out.println("    | |  | |\\  |  | |  | |____| | \\ \\| |____   | |   ");
        System.out.println("    |_|  |_| \\_|  |_|  |______|_|  \\_\\______|  |_|   ");
        System.out.println("                                                    ");
    }

    public static void main(String args[]) {
        // Build menu for encrypting and decrypting in while true
        printLogo();



        boolean running = true;
        // Create a scanner
        Scanner sc = new Scanner(System.in);
        // Create a while true loop
        while (running) {
            // Print the menua
            System.out.println("A. Encrypt");
            System.out.println("B. Decrypt");
            System.out.println("C. Exit");
            System.out.print("Enter your choice: ");

            // Change the integer to char
            // Get the choice


    
            int choice = sc.next().charAt(0);

            // use switch case      
            switch (choice) {
                
                case 'A':
                    encrypt();
                    break;
                case 'B':
                    decrypt();
                    break;
                case 'C':
                    // Exit
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice");
                    break;
            }

        }
        // Prevent the memory leakage
        sc.close();

    }
    public static void decrypt(){
        int decryptionFactor = 10 - 7;

        int dig_1;
        int dig_2;
        int dig_3;
        int dig_4;
        int dig_5;
        int dig_6;
        int a;
        int temp;
        int decrypted;

        System.out.print("Enter a 6 digit number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        // Extract digits using %
        dig_1 = a % 1000000 / 100000;
        dig_2 = a % 100000 / 10000;
        dig_3 = a % 10000 / 1000;
        dig_4 = a % 1000 / 100;
        dig_5 = a % 100 / 10;
        dig_6 = a % 10;

        // Decrypt the digits
        dig_1 = (dig_1 + decryptionFactor) % 10;
        dig_2 = (dig_2 + decryptionFactor) % 10;
        dig_3 = (dig_3 + decryptionFactor) % 10;
        dig_4 = (dig_4 + decryptionFactor) % 10;
        dig_5 = (dig_5 + decryptionFactor) % 10;
        dig_6 = (dig_6 + decryptionFactor) % 10;

        // Construct Decrypted Number
        decrypted = dig_1 * 100000 + dig_2 * 10000 + dig_3 * 1000 + dig_4 * 100 + dig_5 * 10 + dig_6;
        System.out.print("Decrypted number is: ");
        System.out.println(decrypted);

        // Close the sc
        //sc.close();
    }
    public static void encrypt(){
        int encryptionFactor = 7;

        int dig_1;
        int dig_2;
        int dig_3;
        int dig_4;
        int dig_5;
        int dig_6;
        int a;
        int temp;
        int encrypted;

        System.out.print("Enter a 6 digit number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        // a = 123456
        
        // Extract digits using %
        dig_1 = a % 1000000 / 100000;
        dig_2 = a % 100000 / 10000;
        dig_3 = a % 10000 / 1000;
        dig_4 = a % 1000 / 100;
        dig_5 = a % 100 / 10; // 123456 % 100 = 56 => 56 / 10 = 5
        dig_6 = a % 10;   // => 123456 % 10 = 6

        // Encrypt the digits
        dig_1 = (dig_1 + encryptionFactor) % 10; // 1 => 1 + 7 = 8 
        dig_2 = (dig_2 + encryptionFactor) % 10; // 2
        dig_3 = (dig_3 + encryptionFactor) % 10; // 3
        dig_4 = (dig_4 + encryptionFactor) % 10;
        dig_5 = (dig_5 + encryptionFactor) % 10;
        dig_6 = (dig_6 + encryptionFactor) % 10;

        // Construct Encrypted Number
        encrypted = dig_1 * 100000 + dig_2 * 10000 + dig_3 * 1000 + dig_4 * 100 + dig_5 * 10 + dig_6;
        System.out.print("Encrypted number is: ");
        System.out.println(encrypted);

        // Close the sc
        //sc.close();
    }
}

