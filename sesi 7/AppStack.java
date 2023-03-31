import java.util.Stack;
import java.util.Scanner;

public class AppStack {
    public static void main(String[] args)throws Exception {
        Stack<buku> bukuBuku = new Stack<buku>();
        Scanner input = new Scanner(System.in);

        String jawaban;
        int kategori;
        int number = 1;
        do {
            System.out.println("________________________________");
            System.out.println("Data Perpustakaan ke "+number);
            System.out.print("Masukan Judul Buku : ");
            String judul = input.nextLine();
            System.out.print("Masukan Nama Pengarang : ");
            String pengarang = input.nextLine();
            System.out.print("Masukan Nama Penerbit : ");
            String penerbit = input.nextLine();
            System.out.print("Masukan Tahun Terbit : ");
            int tahun = input.nextInt();
            System.out.print("Masukan Kategori (1-4) : ");
            kategori = input.nextInt();
            String keterangan;
            if (kategori == 1) {
                keterangan = "Teknik";
            } else if (kategori == 2) {
                keterangan = "Manajemen";
            } else if (kategori == 3) {
                keterangan = "Fiksi";
            } else{
                keterangan = "Lainnya";
            }
            input.nextLine(); 
            bukuBuku.add(new buku(judul, pengarang, penerbit, tahun, kategori, keterangan));
            System.out.println("Apakah anda ingin menambah data lagi ? (Y/N) : ");
            jawaban = input.nextLine();
            number++;
        } while (jawaban.equals("Y") || jawaban.equals("y"));
    
        System.out.println("=============================================");
        System.out.println("Daftar Buku Yang Tersedia");
        System.out.println("=============================================");
        System.out.println("No\tJudul\tPengarang\tPenerbit\tTahun");

        int Teknik = 0;
        int Manajemen = 0;
        int Fiksi = 0;
        int Lainnya = 0;
        int BukuBaru = 0;
        int BukuLawas = 0;
        int no=1;
        for(buku b:bukuBuku){
            System.out.println(no+"\t"+b.judul+"\t"+b.pengarang+"\t"+b.penerbit+"\t"+b.tahun+"\t"+b.keterangan);

            if (b.keterangan.equals("Teknik")) {
                Teknik++;
            } else if (b.keterangan.equals("Manajemen")) {
                Manajemen++;
            } else if (b.keterangan.equals("Fiksi")) {
                Fiksi++;
            } else{
                Lainnya++;
            }

            if (b.tahun <= 2000) {
                BukuLawas++;
            } else {
                BukuBaru++;
            }
    
        }

        System.out.println("=============================================");
        System.out.println("Jumlah Buku Yang Tersedia : "+bukuBuku.size());
        System.out.println("Buku Teknik : "+Teknik);
        System.out.println("Buku Manajemen : "+Manajemen);
        System.out.println("Buku Fiksi : "+Fiksi);
        System.out.println("Buku Lainnya : "+Lainnya);
        System.out.println("Buku Lawas : "+BukuLawas);
        System.out.println("Buku Baru : "+BukuBaru);

    }    
}
    

