public class SpecialSort {
    public static int[] actionWithMas(int[] mas, int n) {
        int tmp = 0;
        int[] res_mas = new int[n / 2 + 1];
        for (int i = 1; i < n; i += 2) {
            if (mas[i] % 2 == 0) {
                res_mas[tmp] = mas[i];
                tmp++;
            }
        }
        res_mas[res_mas.length - 1] = tmp;
        return res_mas;
    }
    public static void start() {
        System.out.println("Input number (0 < number < 1000). Then enter elements (int) of array");
        int[] mas = new int[1001];
        int n = App.input.nextInt();
        int[] new_mas;
        new_mas = actionWithMas(mas, n);
        for (int i = 0; i < new_mas[new_mas.length - 1]; i++) {
            System.out.print(new_mas[i] + " ");
        }
    }
}
