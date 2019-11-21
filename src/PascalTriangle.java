
public class PascalTriangle {
    private long[] mas;
    private int h;
    private int len;
    private boolean inited = false;

    private long fact(long[] mas, int n) {
        if (n == 0)
            return 1;
        if (mas[n] == 0) {
            mas[n] = fact(mas, n - 1) * n;
            return mas[n];
        }
        else {
            return mas[n];
        }
    }

    private int calcLen (long tmp) {
        int len = 1;
        while (tmp > 0) {
            len++;
            tmp /= 10;
        }
        return len;
    }

    private void init() {
        inited = true;
        mas = new long[1000];
        mas[1] = 1;
    }

    private void printTriangle() {
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < (h - i) / 2; j++)
                System.out.printf("%" + len + "s", "");
            if ((h - i) % 2 == 1) {
                System.out.printf("%" + len / 2 + "s", "");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%" + len + "d", fact(mas, i) / fact(mas, j) / fact(mas, i - j));
            }
            System.out.println();
        }
    }

    public void start() {
        if (inited == false) {
            init();
        }
        System.out.println("Enter number (number <= 20):");
        h = App.input.nextInt();
        len = calcLen(fact(mas, h) / fact(mas, h / 2) / fact(mas, h - (h / 2)));
        printTriangle();
    }
}
