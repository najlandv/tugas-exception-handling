// File: Barang.java
// Kelas barang sebagai parent class
public class Barang {
    protected String namaBarang;
    protected double hargaBarang;

    // Konstruktor untuk inisialisasi namaBarang dan hargaBarang
    public Barang(String namaBarang, double hargaBarang) {
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Getter untuk namaBarang
    public String getNamaBarang() {
        return namaBarang;
    }

    // Getter untuk hargaBarang
    public double getHargaBarang() {
        return hargaBarang;
    }
}
