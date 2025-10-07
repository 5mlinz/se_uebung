import java.util.Scanner;

public class Greeting
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Name eingeben:");
        String name = scanner.nextLine();
        
        System.out.println("Hallo, " + name + "!");
    }
}