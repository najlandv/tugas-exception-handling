// File: VirtualDemo.java
import java.util.InputMismatchException;
import java.util.Scanner;

public class VirtualDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.println("== Formulir Pemesanan ==");
                
                System.out.print("Masukkan No. Faktur   : ");
                String noFaktur = scanner.nextLine();

                System.out.print("Masukkan Nama Pelanggan : ");
                String namaPelanggan = scanner.nextLine();

                System.out.print("Masukkan Nama Barang    : ");
                String namaBarang = scanner.nextLine();

                System.out.print("Masukkan Harga Barang   : ");
                double hargaBarang = Double.parseDouble(scanner.nextLine());

                System.out.print("Masukkan Jumlah Beli    : ");
                int jumlahBeli = Integer.parseInt(scanner.nextLine());

                // Membuat objek Pemesanan dan menampilkan detail
                Pemesanan pesanan = new Pemesanan(noFaktur, namaPelanggan, namaBarang, hargaBarang, jumlahBeli);
                
                System.out.println("\n== Informasi Pemesanan ==");
                pesanan.tampilkanDetail();

                // Menampilkan total bayar di bawah jumlah beli
                System.out.println("Total Bayar   : " + pesanan.getTotalBayar());

                // Jika semua input valid, set flag inputValid menjadi true untuk keluar dari loop
                inputValid = true;

            } catch (InputMismatchException e) {
                System.out.println("Error: Pastikan input sesuai dengan format yang benar.");
                System.out.println("Silahkan ulangi pengisian sesuai dengan ketentuan.");
                // Membersihkan buffer setelah terjadi kesalahan inputMismatch
                scanner.nextLine();
            } catch (NumberFormatException e) {
                System.out.println("Error: Harga Barang dan Jumlah Beli harus berupa angka.");
                System.out.println("Silahkan ulangi pengisian sesuai dengan ketentuan.");
                // Membersihkan buffer setelah terjadi kesalahan inputMismatch
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
                // Membersihkan buffer setelah terjadi kesalahan umum
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
