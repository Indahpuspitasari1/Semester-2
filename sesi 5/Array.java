import java.util.Scanner;
import java.util.stream.*;

public class Array {
    public static void main(String[] args) throws Exception{
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukan jumlah data : ");
        int n = inputan.nextInt();
    
    {
        //int[] Mahasiswa= new int[n];
        String[] Nama= new String[n];
        int[] Nilai= new int[n];

        for(int i = 0; i < Nama.length; i++){
            System.out.println("_______________________________");
            System.out.println("Mahasiswa ke  : " + (i+1));

            System.out.print("Masukan nama  : ");
            Nama[i]= inputan.next();
            System.out.print("Masukan nilai  : ");
            Nilai[i]= inputan.nextInt();
        }
        System.out.println("==================================");
        System.out.println("No\tNama\tNilai\tKet");
        System.out.println("==================================");

        for(int i = 0; i < Nama.length; i++){
            String Ket = Nilai[i] >= 70 ? ("lulus") : ("Tidak lulus");
            System.out.println((i+1)+"\t"+Nama[i]+"\t" + Nilai[i]+"\t" + Ket);
    }
        System.out.println("==================================");
        double totalNilai =IntStream.of(Nilai).sum();

        System.out.println("Jumlah = \t" + totalNilai );
        System.out.println("Rata rata = \t" + (totalNilai/n) );
}
}
        
}