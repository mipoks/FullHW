
public class Fibbonacci {
    public static void printArray (int[] mas, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }
    public static int calcfibbonacci (int[] mas, int n) {
        if (mas[n] == 0) {
            mas[n] = calcfibbonacci(mas, n - 1) + calcfibbonacci(mas, n - 2);
            return mas[n];
        }
        else {
            return mas[n];
        }
    }

    public static void start() {
        int[] mas = new int[1000];
        mas[1] = 1;
        mas[2] = 1;
        System.out.println("Input number (number < 1000)");
        int n = App.input.nextInt();
        calcfibbonacci(mas, n);
        printArray(mas, n);
    }
}
