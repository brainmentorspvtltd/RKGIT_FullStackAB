import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter your name : ");
        // read() reads one byte at a time and
        // returns int type of data
        // int name = System.in.read();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt(); // 101\n
        // id - 101
        scanner.nextLine(); // \n
        
        System.out.println("Enter your name : ");
        // nextLine() - reads input till \n
        String name = scanner.nextLine();
        // String name = scanner.next();

        // name = "ram sharma"
        char firstChar = name.charAt(0);
        // firstchar = 'r'
        String firstLetter = String.valueOf(firstChar);
        // firstLetter = "r"
        firstLetter = firstLetter.toUpperCase();
        // firstLetter = "R"
        String remainingName = name.substring(1).toLowerCase();
        // remainingName = "am sharma"
        name = firstLetter + remainingName;
        // name = "Ram sharma"

        name = String.valueOf(name.charAt(0)).toUpperCase() + name.substring(1).toLowerCase();


        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("ID is : " + id);
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("Salary is : " + salary);
        scanner.close();
    }
}
