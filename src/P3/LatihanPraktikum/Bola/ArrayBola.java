package P3.LatihanPraktikum.Bola;

import java.util.Scanner;

public class ArrayBola {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah Bola: ");
        int jumlahBola = sc.nextInt();
        Bola[] bola = new Bola[jumlahBola];
        for (int i = 0; i < bola.length; i++) {
            System.out.println("Bola ke-" + (i + 1));
            bola[i] = new Bola();
            System.out.print("Jari-jari: ");
            bola[i].jariJari = sc.nextDouble();
            sc.nextLine();
            System.out.println("Luas Permukaan bola ke-" + (i + 1) + " = " + bola[i].hitungLuasPermukaanBola());
            System.out.println("Volume: " + bola[i].hitungVolumeBola());
        }
    }
}
