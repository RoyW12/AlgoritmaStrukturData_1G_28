package P1;

import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner roy = new Scanner(System.in);
        String[] mataKuliah = new String[8];
        int[] bobotSKS = new int[mataKuliah.length];
        int[] nilaiAngka = new int[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];
        double IP;
        int totalSKS = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nama Mata Kuliah ke-" + (i + 1) + " : ");
            mataKuliah[i] = roy.nextLine();
            System.out.print("Masukkan bobot sks Mata Kuliah ke-" + (i + 1) + " : ");
            bobotSKS[i] = roy.nextInt();
            roy.nextLine();

        }
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiAngka[i] = roy.nextInt();
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1;
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0;
            }
        }
        double result, totalResult = 0;
        for (int i = 0; i < mataKuliah.length; i++) {
            result = bobotSKS[i] * nilaiSetara[i];
            totalResult += result;
            totalSKS += bobotSKS[i];
        }
        IP = totalResult / totalSKS;
        int decimalForm = 2;
        double pembulatanFaktor = Math.pow(10, decimalForm);
        double ipDecimal = Math.round(IP * pembulatanFaktor) / pembulatanFaktor;

        System.out.println("==============================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================");

        System.out.println(
                "+------+----------------------------------------+-------------+--------------+--------------+");
        System.out.println(
                "| No.  |       Mata Kuliah                      | Nilai Angka | Nilai huruf  |  Bobot Nilai |");
        System.out.println(
                "+------+----------------------------------------+-------------+--------------+--------------+");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("| %-4d | %-38s | %-11s | %-12s | %-12s |\n", (i + 1), mataKuliah[i],
                    nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        System.out.println(
                "+------+----------------------------------------+-------------+--------------+--------------+");
        System.out.println("==============================");
        System.out.println("IP: " + ipDecimal);
    }
}
