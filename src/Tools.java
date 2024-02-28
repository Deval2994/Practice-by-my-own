import java.util.Scanner;

public class Tools {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getInt(String message){
        System.out.print(message);
        return scanner.nextInt();
    }
}
