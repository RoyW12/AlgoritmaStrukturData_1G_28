package P3.LatihanPraktikum.Mahasiswa;

import java.util.Scanner;

public class ArrayMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rataIPK = 0;
        int indexMhsIpkTerbesar = 0;
        Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            mhs[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            mhs[i].nim = sc.nextLong();
            sc.nextLine();
            System.out.print("Masukkan jenis kelamin: ");
            mhs[i].jenisKelamin = sc.nextLine().toUpperCase();
            System.out.print("Masukkan IPK: ");
            mhs[i].ipk = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.println("nama            :  " + mhs[i].nama);
            System.out.println("nim             :  " + mhs[i].nim);
            System.out.println("Jenis kelamin   :  " + mhs[i].jenisKelamin);
            System.out.println("Nilai IPK       :  " + mhs[i].ipk);
        }
        for (int i = 0; i < mhs.length; i++) {
            rataIPK = mhs[i].hitungRataIPK(mhs);
        }
        System.out.println("Rata-rata ipk: " + rataIPK);

        for (int i = 0; i < mhs.length; i++) {
            indexMhsIpkTerbesar = mhs[i].ipkTerbesar(mhs);
        }
        System.out.println("Mahasiswa dengan IPK terbesar: ");
        System.out.println("Nama            : " + mhs[indexMhsIpkTerbesar].nama);
        System.out.println("Nim             : " + mhs[indexMhsIpkTerbesar].nim);
        System.out.println("Jenis Kelamin   : " + mhs[indexMhsIpkTerbesar].jenisKelamin);
        System.out.println("Ipk             : " + mhs[indexMhsIpkTerbesar].ipk);

    }
}
