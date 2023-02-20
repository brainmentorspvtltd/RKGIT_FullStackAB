public class DataTypes {
    public static void main(String[] args) {
        boolean flag = true;
        char n = 100;
        char n1 = 'R';
        short num = 23;
        int x = 2312;
        long l = 3412;
        float f = 34.5f;
        double d = 42.75;

        String name = "Ram";
        String name_2 = "Ram";

        // Compare value of two variables
        System.out.println(name.equals(name_2));
        // Compare reference/address of two variables
        System.out.println(name == name_2);

        String userName = new String("Ram");
        System.out.println(name.equals(userName));
        System.out.println(name == userName);

        int arr_1[] = new int[5];
        int arr_2[] = {32,2,6,7};
        int []arr_3 = {32,2,6,7};
        int[] arr_4 = {32,2,6,7};

        Integer x1 = 10;
        int i1 = x1;

    }
}
