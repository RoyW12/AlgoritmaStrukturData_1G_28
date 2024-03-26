package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Banyak Perusahaan: ");
        int jml = sc.nextInt();
        Sum sm[] = new Sum[jml];
        for (int i = 0; i < jml; i++) {
            System.out.println("Perusahaan ke " + (i + 1));
            System.out.print("Masukkan jumlah bulan: ");
            int elm = sc.nextInt();
            sm[i] = new Sum(elm);

            System.out.println("================================================================");
            for (int j = 0; j < sm[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
            System.out.println("================================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "
                            + sm[i].totalBF(sm[i].keuntungan));

            System.out.println("================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm[i].elemen + " bulan adalah = "
                    + Math.round(sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1) * 100.0) / 100.0);
        }

    }
}
