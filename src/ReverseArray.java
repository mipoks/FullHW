
public class ReverseArray {
    public static void printArray (int[] mas, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(mas[i]);
        }
        System.out.println();
    }
    public static void reverseArray (int[] mas, int n) {
        int tmp;
        for (int i = 0; i < n / 2; i++) {
            tmp = mas[i];
            mas[i] = mas[n - i - 1];
            mas[n - i - 1] = tmp;
        }
    }

    public static void start() {
        int[] mas = new int[1000];
        System.out.println("Input number (0 < number < 1000). Then enter elements (int) of array");
        int n = App.input.nextInt();
        for (int i = 0; i < n; i++) {
            mas[i] = App.input.nextInt();
        }
        reverseArray(mas, n);
        printArray(mas, n);
    }
}