public class DataZakatFitri {
    private String nama;
    private String alamat;
    private String metodePembayaran;

    public DataZakatFitri(String nama, String alamat, String metodePembayaran) {
        this.nama = nama;
        this.alamat = alamat;
        this.metodePembayaran = metodePembayaran;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
}