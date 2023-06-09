import java.util.Scanner;

public class rekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai yang akan dipangkatkan: ");
        int x = scanner.nextInt();

        System.out.print("Masukkan pangkat: ");
        int y = scanner.nextInt();

        System.out.print("Masukkan nilai yang akan difaktorialkan: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan batas Fibonacci: ");
        int n = scanner.nextInt();

        int pangkatResult = pangkat(x, y);
        int faktorialResult = faktorial(a);
        int fibonacciResult = fibonacci(n);

        System.out.println("Hasil pangkat: " + pangkatResult);
        System.out.println("Hasil faktorial: " + faktorialResult);
        System.out.println("Hasil fibonacci: " + fibonacciResult);

        scanner.close();
    }

    public static int pangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * pangkat(x, y - 1);
        }
    }

    public static int faktorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        } else {
            return a * faktorial(a - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}