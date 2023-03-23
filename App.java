import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // TUGAS NOMOR 1
        Scanner input = new Scanner(System.in);

        System.out.println("1. menghitung biaya parkir");
        System.out.print("masukan jam masuk (0-23) : ");
        int jamMasuk = input.nextInt();

        System.out.print("masukan jam keluar (0-23) : ");
        int jamKeluar = input.nextInt();

        System.out.print("masukan biaya per jam : ");
        int biayaPerjam = input.nextInt();

        int lamaParkir = jamKeluar - jamMasuk;
        int biayaParkir = lamaParkir * biayaPerjam;

        System.out.println("Lama parkir: " + lamaParkir + " jam");
        System.out.println("Biaya parkir: " + biayaParkir + " rupiah");
        System.out.println("==========================");

        // NOMOR 2
       System.out.println("2. menghitung gaji dan lembur di perusahaan A");
       System.out.print("Masukan gaji : ");
       double gaji = input.nextDouble();

       System.out.print("Masukan jumlah jam lembur : ");
       int jamLembur = input.nextInt(); 

       System.out.print("Masukan upah lembur perjam : ");
       double upahLembur = input.nextDouble();

       double gajiLembur = jamLembur * upahLembur;
       double totalGaji = gaji + gajiLembur;
       System.out.println("Gaji yang diterima adalah " + totalGaji);
       System.out.println("==========================");

       // NOMOR 3
        System.out.println("3. menghitung lembar uang kertas");
        System.out.print("Nominal: ");
        int nominal = input.nextInt();

        int lembar50ribuan = nominal / 50000;
        nominal %= 50000;

        int lembar20ribuan = nominal / 20000;
        nominal %= 20000;

        int lembar5ribuan = nominal / 5000;
        nominal %= 5000;

        int lembar2ribuan = nominal / 2000;
        nominal %= 2000;

        int keping500an = nominal / 500;

        System.out.println("Maka Jumlah uang kertas:");
        System.out.println(lembar50ribuan + " lembar 50ribuan");
        System.out.println(lembar20ribuan + " lembar 20ribuan");
        System.out.println(lembar5ribuan + " lembar 5ribuan");
        System.out.println(lembar2ribuan + "lembar 2ribuan");
        System.out.println(lembar50ribuan + " lembar 50ribuan");
        System.out.println(keping500an + "lembar 20ribuan");

    }
}