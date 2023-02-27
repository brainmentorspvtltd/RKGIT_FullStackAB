public class Loops {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        int arr[] = {1,3,6,7};
        // for(int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        // ForEach
        for(int i : arr) {
            System.out.println(i);
        }

        String name = "Ram Sharma";
        char nameArr[] = name.toCharArray();
        for(char s : nameArr) {
            System.out.println(s);
        }

    }
}
