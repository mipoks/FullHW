
public class SpecialSort {
    private int[]       mas;
    private boolean     inited = false;
    private int         n;
    private int[]       new_mas;

    public int[] actionWithMas(int[] mas, int n) {
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

    private void init() {
        mas = new int[1001];
        inited = true;
    }

    public void start() {
        if (inited == false) {
            init();
        }
        System.out.println("Input number (0 < number < 1000). Then enter elements (int) of array");
        n = App.input.nextInt();
        for (int i = 0; i < n; i++) {
            mas[i] = App.input.nextInt();
        }
        new_mas = actionWithMas(mas, n);
        System.out.println("After special sorting:");
        for (int i = 0; i < new_mas[new_mas.length - 1]; i++) {
            System.out.print(new_mas[i] + " ");
        }
    }

}
