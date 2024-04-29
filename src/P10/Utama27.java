package P10;

import java.util.Scanner;

public class Utama27 {
    public static void main(String[] args) {
        Scanner roy27 = new Scanner(System.in);
        Gudang27 gudang = new Gudang27(7);
        boolean isBreak = false;
        while (!isBreak) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = roy27.nextInt();
            roy27.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = roy27.nextInt();
                    roy27.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = roy27.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = roy27.nextLine();
                    Barang27 barangBaru = new Barang27(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilbarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    isBreak = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
                    break;
            }
        }
    }
}
