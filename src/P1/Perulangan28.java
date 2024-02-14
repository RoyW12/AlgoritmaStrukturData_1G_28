package P1;

import java.util.Scanner;

public class Perulangan28 {
    public static void main(String[] args) {
        long nim;
        Scanner Roy = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = Roy.nextLong();

        int n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print("*");
            } else if (i == 6 || i == 10) {
                System.out.print("*");
            } else {
                System.out.print(i);
            }
        }
    }
}
