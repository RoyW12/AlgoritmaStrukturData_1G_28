package P3.LatihanPraktikum.Kerucut;

import java.util.Scanner;

public class ArrayKerucut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Kerucut: ");
        int jumlahKerucut = sc.nextInt();
        Kerucut[] krct = new Kerucut[jumlahKerucut];
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
    }
}
