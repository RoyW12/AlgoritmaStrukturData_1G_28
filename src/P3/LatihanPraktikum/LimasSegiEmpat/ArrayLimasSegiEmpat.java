package P3.LatihanPraktikum.LimasSegiEmpat;

import java.util.Scanner;

public class ArrayLimasSegiEmpat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Limas: ");
        int jumlahLimas = sc.nextInt();
        LimasSegiEmpat[] lms = new LimasSegiEmpat[jumlahLimas];
        for (int i = 0; i < lms.length; i++) {
            System.out.println("Limas ke-" + (i + 1));
            lms[i] = new LimasSegiEmpat();
            System.out.print("Sisi alas: ");
            lms[i].sisiAlas = sc.nextInt();
            sc.nextLine();
            System.out.print("Tinggi limas: ");
            lms[i].tinggiLimas = sc.nextInt();
            sc.nextLine();
            System.out.println("Luas Permukaan limas ke-" + (i + 1) + " = " + lms[i].luasPermukaanLimas());
            System.out.println("Volume: " + lms[i].volumeLimas());
        }
    }
}
