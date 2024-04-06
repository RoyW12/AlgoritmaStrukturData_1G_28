package P7;

import java.util.Scanner;

public class BukuMain27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku27 data = new PencarianBuku27();
        int jumBuku = 5;

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------");
            System.out.print("Kode Buku \t      : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku \t     : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t   : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t      : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t          : ");
            int stock = s.nextInt();
            s.nextLine();

            Buku27 m = new Buku27(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);

        }
        System.out.println("-----------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        // System.out.println("___________________________________");
        // System.out.println("___________________________________");
        // System.out.println("Pencarian Data Berdasarkan Kode Buku");
        // System.out.println("Masukkan kode buku yang dicari: ");
        // System.out.print("Kode Buku: ");
        // int cari = s.nextInt();
        // System.out.println("Menggunakan sequencial search");
        // int posisi = data.FindSeqSearchString(cari);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

        // System.out.println("=================================");
        // System.out.println("Menggunakan binary Search");
        // posisi = data.FindBinarySearchString(cari, 0, jumBuku - 1);
        // data.TampilPosisi(cari, posisi);
        // data.TampilData(cari, posisi);

        System.out.println("-----------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("___________________________________");
        System.out.println("___________________________________");
        System.out.println("Pencarian Data Berdasarkan Judul");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Judul Buku: ");
        String cariJudul = s1.nextLine();
        System.out.println("Menggunakan sequencial search");
        int posisiJudul = data.FindSeqSearchBookTitle(cariJudul);
        data.TampilPosisiJudul(cariJudul, posisiJudul);
        data.TampilDataJudul(cariJudul, posisiJudul);

        System.out.println("=================================");
        System.out.println("Menggunakan binary Search");
        posisiJudul = data.FindBinarySearchBookTitle(cariJudul, 0, jumBuku - 1);
        data.TampilPosisiJudul(cariJudul, posisiJudul);
        data.TampilDataJudul(cariJudul, posisiJudul);

    }
}
