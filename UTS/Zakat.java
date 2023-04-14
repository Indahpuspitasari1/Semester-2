import java.util.*;

public class Zakat {
    private ArrayList<DataZakatFitri> dataWarga;

    public static void main(String[] args) {
        Zakat z = new Zakat();
        z.inputData();
        z.cetakData();
        z.hitungStatistik();
    }

    public void inputData() {
        dataWarga = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String jawaban;
        int number = 1;
        do {
            System.out.println("===== SOAL 1 =====");
            System.out.println("Data Warga ke " + number);
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Alamat : ");
            String alamat = sc.nextLine();
            System.out.println("Metode Pembayaran : ");
            System.out.println("1. Beras (2.5 Kg)");
            System.out.println("2. Uang (Rp 35.000)");
            System.out.print("Pilih metode pembayaran (1/2): ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            String metodePembayaran = "";
            if (pilihan == 1) {
                metodePembayaran = "Beras";
            } else if (pilihan == 2) {
                metodePembayaran = "Uang";
            } else {
                metodePembayaran = "Tidak Valid";
            }

            DataZakatFitri warga = new DataZakatFitri(nama, alamat, metodePembayaran);
            dataWarga.add(warga);
            System.out.print("Apakah Anda ingin menambahkan data warga lagi? (Y/N)");
            jawaban = sc.nextLine();
            number++;
        } while (jawaban.equalsIgnoreCase("Y"));
    }

    public void cetakData() {
        System.out.println("==============================================================");
        System.out.println("\tData Warga Yang Sudah Membayar Zakat");
        System.out.println("==============================================================");
        System.out.println("No\tNama\t\tAlamat\t\tMetode Pembayaran");
        System.out.println("==============================================================");
        int i = 1;
        for (DataZakatFitri warga : dataWarga) {
            System.out.println(i++ + "\t" + warga.getNama() + "\t\t" + warga.getAlamat() + "\t\t" + warga.getMetodePembayaran());
        }
    }
    public void hitungStatistik() {
    int jmlBeras = 0;
    int jmlUang = 0;
    int jmlWargaBeras = 0;
    int jmlWargaUang = 0;
    int jmlSedekah = 0;
    
    for (DataZakatFitri warga : dataWarga) {
        if (warga.getMetodePembayaran().equalsIgnoreCase("beras")) {
            jmlBeras += 2.5;
            jmlWargaBeras++;
        } else if (warga.getMetodePembayaran().equalsIgnoreCase("uang")) {
            jmlUang += 35000;
            jmlWargaUang++;
        }
        
        jmlSedekah += 10000;
    }
    
    System.out.println("==============================================================");
    System.out.println("\tNo 2 Statistik Zakat Fitri");
    System.out.println("==============================================================");
    System.out.println("Jumlah Warga yang membayar zakat Fitri dengan beras : " + jmlWargaBeras);
    System.out.println("Jumlah Warga yang membayar zakat Fitri dengan uang : " + jmlWargaUang);
    System.out.println("Jumlah beras zakat yang terkumpul : " + jmlBeras + " Kg");
    System.out.println("Jumlah uang zakat yang terkumpul : Rp " + jmlUang);
    System.out.println("Jumlah uang sedekah yang terkumpul : Rp " + jmlSedekah);
}
}
