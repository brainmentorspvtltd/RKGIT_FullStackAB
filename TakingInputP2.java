import java.io.IOException;
import java.util.Scanner;

public class TakingInputP2 {
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

        String nameArr[] = name.split(" ");
        String fullName = "";
        for(String n : nameArr) {
            fullName += String.valueOf(n.charAt(0)).toUpperCase() + n.substring(1).toLowerCase() + " ";
        }



        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("ID is : " + id);
        System.out.println("Name is : " + fullName);
        System.out.println("Age is : " + age);
        System.out.println("Salary is : " + salary);
        scanner.close();
    }
}
