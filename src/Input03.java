import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        //Find and print the sum of three integers entered by the user
        for (int i = 0; i < 3; i++) {
            System.out.println("Input number " + (i + 1) );
            int scannerInput = scanner.nextInt();
            total += scannerInput;
        }
        System.out.println("Total: " + total);
        scanner.close();
        
        //Remember to close the Scanner
        
    }
}
