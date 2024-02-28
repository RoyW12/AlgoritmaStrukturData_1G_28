package P3.LatihanPraktikum;

import java.util.Scanner;

import P3.LatihanPraktikum.Bola.Bola;
import P3.LatihanPraktikum.Kerucut.Kerucut;
import P3.LatihanPraktikum.LimasSegiEmpat.LimasSegiEmpat;

public class mainObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Kerucut: ");
        int jumlahKerucut = sc.nextInt();
        Kerucut[] krct = new Kerucut[jumlahKerucut];
        System.out.print("Jumlah Bola: ");
        int jumlahBola = sc.nextInt();
        Bola[] bola = new Bola[jumlahBola];
        System.out.print("Jumlah Limas: ");
        int jumlahLimas = sc.nextInt();
        LimasSegiEmpat[] lms = new LimasSegiEmpat[jumlahLimas];

        for (int i = 0; i < bola.length; i++) {
            System.out.println("Bola ke-" + (i + 1));
            bola[i] = new Bola();
            System.out.print("Jari-jari: ");
            bola[i].jariJari = sc.nextDouble();
            sc.nextLine();
            System.out.println("Luas Permukaan bola ke-" + (i + 1) + " = " + bola[i].hitungLuasPermukaanBola());
            System.out.println("Volume: " + bola[i].hitungVolumeBola());
        }
        for (int i = 0; i < krct.length; i++) {
            System.out.println("Kerucut ke-" + (i + 1));
            krct[i] = new Kerucut();
            System.out.print("Jari-jari: ");
            krct[i].jariJari = sc.nextDouble();
            sc.nextLine();
            System.out.print("Sisi miring: ");
            krct[i].sisiMiring = sc.nextInt();
            sc.nextLine();
            System.out.println("Luas Permukaan kerucut ke-" + (i + 1) + " = " + krct[i].hitungLuasPermukaanKerucut());
            System.out.println("Volume: " + krct[i].hitungVolumeKerucut());
        }

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
