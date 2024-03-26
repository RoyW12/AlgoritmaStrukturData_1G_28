package P4.Kuis1_Roy;

import java.util.Scanner;

public class MainObat {
    public static void main(String[] args) {
        Scanner roy = new Scanner(System.in);
        Obat[] obat = new Obat[5];

        for (int i = 0; i < obat.length; i++) {
            System.out.println("Obat ke-" + (i + 1));
            System.out.print("Nama Obat: ");
            String namaObat = roy.nextLine();
            System.out.print("Kategori obat: ");
            String kategoriObat = roy.nextLine();
            System.out.print("Stok Obat: ");
            int stok = roy.nextInt();
            System.out.print("Jumlah terjual: ");
            int jumlahTerjual = roy.nextInt();
            roy.nextLine();

            obat[i] = new Obat(namaObat, kategoriObat, stok, jumlahTerjual);

        }
        for (int i = 0; i < obat.length; i++) {
            obat[i].tampil();
        }
        for (int i = 0; i < obat.length; i++) {
            System.out.println("Sisa Obat " + obat[i].nama + " = " + obat[i].hitungSisa());
        }
        System.out.print("Cari obat paling laku berdasarkan jumlah penjualan: ");
        int jumlahPenjualan = roy.nextInt();
        Obat.cariObatPalingLaku(jumlahPenjualan, obat);

        System.out.println("Daftar obat setelah diurutkan");
        Obat.daftarObat(obat);
        for (Obat drugs : obat) {
            drugs.tampil();
            System.out.println();
        }
    }
}
