import java.util.Scanner;

public class App {
    private static Fibbonacci fibbonacci;
    private static PascalTriangle pascalTriangle;
    private static ReverseArray reverseArray;
    private static SpecialSort specialSort;
    public static Scanner input;
    private static int number;

    private static void start() {
        input = new Scanner(System.in);
        System.out.print("What would you like to do? \n (1) - fibbonacci \n (2) - pascal triangle \n (3) - reverse array \n (4) - special sort \n");
        number = input.nextInt();
        switch (number) {
            case 1:
                fibbonacci.start();
                break;
            case 2:
                pascalTriangle.start();
                break;
            case 3:
                reverseArray.start();
                break;
            case 4:
                specialSort.start();
                break;
            default:
                System.out.print("Read this carefully!");
                System.exit(1);
        }
    }
    private static void init() {
         fibbonacci = new Fibbonacci();
         pascalTriangle = new PascalTriangle();
         reverseArray = new ReverseArray();
         specialSort = new SpecialSort();
    }

    public static void main(String[] args) {
        init();
        start();
    }
}
