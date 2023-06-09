import java.util.Scanner;

public class rekursif {
  public static int factorial(int n) {
    if (n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }

  public static double pangkat(double x, int n) {
    if (n == 0) {
      return 1.0;
    } else {
      return x * pangkat(x, n - 1);
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan bilangan untuk dihitung faktorial: ");
    int n = input.nextInt();
    int result1 = factorial(n);
    System.out.println("Factorial of " + n + " is " + result1);

    System.out.print("Masukkan jumlah bilangan dalam deret Fibonacci: ");
    int m = input.nextInt();
    for (int i = 0; i < m; i++) {
      System.out.print(fibonacci(i) + " ");
    }
    System.out.println();

    System.out.print("Masukkan bilangan yang akan dipangkatkan: ");
    double x = input.nextDouble();
    System.out.print("Masukkan pangkat bilangan: ");
    int p = input.nextInt();
    double result2 = pangkat(x, p);
    System.out.println(x + " pangkat " + p + " is " + result2);

    input.close();
  }
}