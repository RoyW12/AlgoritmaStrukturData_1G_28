package P1;

import java.util.Scanner;

public class Pemilihan28 {
    public static void main(String[] args) throws Exception {
        Scanner Roy = new Scanner(System.in);
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        String nilaiHuruf = null;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas    :");
        nilaiTugas = Roy.nextInt();
        System.out.print("Masukkan Nilai Kuis     :");
        nilaiKuis = Roy.nextInt();
        System.out.print("Masukkan Nilai UTS      :");
        nilaiUTS = Roy.nextInt();
        System.out.print("Masukkan Nilai UAS      :");
        nilaiUAS = Roy.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas > 100 || nilaiTugas < 0 || nilaiKuis > 100 || nilaiKuis < 0 || nilaiUTS > 100 || nilaiUTS < 0
                || nilaiUAS > 100 || nilaiUAS < 0) {
            System.out.println("nilai tidak valid");
        } else {
            nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";

            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";

            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";

            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";

            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";

            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";

            }
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }

    }
}
