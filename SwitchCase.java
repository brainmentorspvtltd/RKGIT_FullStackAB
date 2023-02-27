import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter your choice : ");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for division");
        System.out.println("Press 4 for multiplication");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        
        System.out.println("Enter first num : ");
        int fnum = scanner.nextInt();

        System.out.println("Enter second num : ");
        int snum = scanner.nextInt();
        int result = 0;
        switch (choice) {
            case 1:
                result = fnum + snum;
                break;
            case 2:
                result = fnum - snum;
                break;
            default:
                break;
        }

    }
}
