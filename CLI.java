public class CLI {
    public static void main(String[] args) {
        // System.out.println("Welcome : " + args[0] + " " + args[1]);
        // System.out.println(args[0] + args[1]);

        // AutoBoxing
        // Wrapper Classes
        int fnum = Integer.parseInt(args[0]);
        int snum = Integer.parseInt(args[1]);
        int result = fnum + snum;
        System.out.println("Result is : " + result);
    }
}
