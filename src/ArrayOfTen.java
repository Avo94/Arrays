import java.util.Arrays;

public class ArrayOfTen {
    public static void main(String[] args) {

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i != 98) {
                array[i] = 10;
            } else continue;
        }
        System.out.println(Arrays.toString(array));
    }
}