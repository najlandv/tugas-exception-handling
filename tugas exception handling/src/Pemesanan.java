// File: Pemesanan.java
// Kelas Pemesanan sebagai child class yang menerapkan inheritance
// dan mengimplementasikan interface HitungTotal (polymorphism)
public class Pemesanan extends Barang implements HitungTotal {
    private String noFaktur;
    private String namaPelanggan;
    private int jumlahBeli;
    private double totalBayar;

    // Konstruktor untuk inisialisasi atribut Pemesanan dan memanggil konstruktor parent class
    public Pemesanan(String noFaktur, String namaPelanggan, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.jumlahBeli = jumlahBeli;

        // Hitung total bayar saat objek Pemesanan dibuat
        hitungTotalBayar();
    }

    // Implementasi metode dari interface HitungTotal
    @Override
    public double hitungTotalBayar() {
        totalBayar = hargaBarang * jumlahBeli;
        return totalBayar;
    }

    // Getter untuk totalBayar
    public double getTotalBayar() {
        return totalBayar;
    }

    // Metode untuk menampilkan detail pemesanan
    public void tampilkanDetail() {
        System.out.println("No. Faktur    : " + noFaktur);
        System.out.println("Pelanggan     : " + namaPelanggan);
        System.out.println("Barang        : " + namaBarang);
        System.out.println("Harga Barang  : " + hargaBarang);
        System.out.println("Jumlah Beli   : " + jumlahBeli);
    }
}
