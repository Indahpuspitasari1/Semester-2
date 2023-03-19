import java.util.Arrays;
import java.util.Scanner;

public class ArrayNo2 {
    public static void main(String[] args) throws Exception{
        String[][] buah = {
            {"apel","35000"},
            {"jeruk","50000"},
            {"mangga","25000"},
            {"dukuh","15000"},
            {"semangka","20000"}
        };

        Scanner inputan = new Scanner(System.in);

        System.out.println("Menu : ");
        System.out.println("1. Beli Buah ");
        System.out.println("2. Struk Belanja");
        System.out.println("3. Keluar");

        System.out.print("Masukan pilihan : ");
        int pil = inputan.nextInt();

        if (pil == 1){
            for (int i=0; i < 5; i++){
                System.out.print(" "+(i + 1) + " ");
                System.out.println(Arrays.asList(buah[i]));
            }
                System.out.print("Masukan pilihan nomor Buah : ");
                int pilBuah = inputan.nextInt();

                int jenisBuah = 0, harga = 0;
                if(pilBuah == 1);
                    jenisBuah = 1;
                  //  harga += 
            
        
        }
           

    }
}
