import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {
    static Scanner scanner = new Scanner(System.in);
    public static int getInt(String message){
        int num = 0;
        System.out.print(message);
        while (true){
            try {
                num = scanner.nextInt();
                return num;
            } catch (InputMismatchException e){
                System.out.println("Error!!! Enter a valid number...");
                scanner.next();
            }
        }
    }
    public static double getDouble(String message){
        double num = 0;
        System.out.print(message);
        while (true){
            try {
                num = scanner.nextDouble();
                return num;
            } catch (InputMismatchException e){
                System.out.println("Error!!! Enter a valid number...");
                scanner.next();
            }
        }
    }
    public static String getString(String message){
        System.out.print(message);
        return scanner.nextLine();
    }
    public static String getServiceCode(String message){
        String input;
        System.out.print(message);
        while (true){
            try {
                input = scanner.nextLine().trim();
                return input;
            } catch (InputMismatchException e){
                System.out.println("Error!!! Enter a valid input...");
                scanner.next();
            }
        }
    }
}
