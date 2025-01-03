import java.util.Scanner;

public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));      
        
        //Edit these lines to advance the scanner
        sc.nextLine();
        System.out.println(sc.nextLine());

        
        
        //Does this line contain "BlueBumper"?
        String in = sc.findInLine("BlueBumper");
        System.out.println(in != null ? "Found: " + in : "Not found");
        //Store the next two numbers as xPosition and yPosition
        //Print these positions
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X coordinate:");
        int xPos = scanner.nextInt();
        System.out.println("Enter Y coordinate:");
        int yPos = scanner.nextInt();
        
        System.out.println("X: " + xPos + ", Y: " + yPos);
        sc.close();
    }    
}
