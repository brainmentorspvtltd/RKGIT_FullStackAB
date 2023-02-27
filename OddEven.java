public class OddEven {
    public static void main(String[] args) {
        int num = 12;
        // if(num % 2 == 0) {
        //     System.out.println("Even");
        // }
        // else {
        //     System.out.println("Odd");
        // }

        if((num & 1) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
