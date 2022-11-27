public class RepeatingArray {
    public static void main(String[] args) {

        int[] array = new int[100];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1) % 10 * 111;
            sum += array[i];
        }
        System.out.println(sum);
    }
}