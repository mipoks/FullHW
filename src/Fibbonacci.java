
public class Fibbonacci {
    private int[]       mas;
    private boolean     inited = false;
    private int         n;

    private void init() {
        mas = new int[1000];
        mas[1] = 1;
        mas[2] = 1;
        inited = true;
    }

    private void printArray (int[] mas, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    private int calcFibbonacci (int[] mas, int n) {
        if (mas[n] == 0) {
            mas[n] = calcFibbonacci(mas, n - 1) + calcFibbonacci(mas, n - 2);
            return mas[n];
        }
        else {
            return mas[n];
        }
    }

    public void start() {
        if (inited == false) {
            init();
        }
        System.out.println("Input number (number < 1000)");
        n = App.input.nextInt();
        calcFibbonacci(mas, n);
        printArray(mas, n);
    }

}
