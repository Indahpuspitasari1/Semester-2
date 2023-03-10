import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // nomor 1
        System.out.println("1)");
        for (int i=1; i<=11; i++){
            if (i%2==1){
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");

        // nomor 2
        System.out.println("2)");
        for (int j = 20; j >=0; j -= 5){
            System.out.print(j +" ");
        }
        System.out.println(" ");

        // nomor 3
        System.out.println("3)");
        int a = 0, b = 1, c = 0;
        System.out.print("0 1 ");
        while (c <= 13){
            c = a + b;
            a = b;
            b = c;

            System.out.print(c+ " ");
        }
        System.out.println(" ");

        // nomor 4
        System.out.println("4)");
        int d = 1, e = 2, f = 3, g = 0;
        System.out.print("1 2 3 ");
        while (f <= 37){
            g = d + e + f;
            d = e;
            e = f;
            f = g;

            System.out.print(g+ " ");


        }
        System.out.println(" ");
        
        //Nomot 5
        System.out.println("5)");
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= i + 3; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        
        // Nomor 6
        		System.out.println("6)");
        for (int k = 3; k <= 5; k++){
            for (int l = 2; l <= 6; l++){
                if (k==3 && l<= 4){
                System.out.println(k + " x " + l + " = " + k*l);				}else if(k==4 && l>=3 && l<=5){
                	System.out.println(k + " x " + l + " = " + k*l);
                }else if(k==5 && l>=4&& l<=6){
                	System.out.println(k + " x " + l + " = " + k*l);
                }
                }
            }
}
}