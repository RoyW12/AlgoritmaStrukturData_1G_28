package P4.Kuis1_Roy;

public class Obat {
    String nama;
    String kategori;
    int stok;
    int jumlah;

    Obat() {

    }

    Obat(String nama, String kategori, int stok, int jumlah) {
        this.nama = nama;
        this.kategori = kategori;
        this.stok = stok;
        this.jumlah = jumlah;
    }

    public void tampil() {
        System.out.println("Nama obat       : " + nama);
        System.out.println("Kategori obat   : " + kategori);
        System.out.println("stok            : " + stok);
        System.out.println("Jumlah          : " + jumlah);
    }

    public int hitungSisa() {
        int sisaObat;
        sisaObat = this.stok - this.jumlah;
        this.stok = sisaObat;
        return sisaObat;
    }

    public static void cariObatPalingLaku(int jumlahLaku, Obat[] obat) {
        for (int i = 0; i < obat.length; i++) {
            if (obat[i].jumlah >= jumlahLaku) {
                System.out.println("Obat ke-" + (i + 1));
                System.out.println("Nama Obat: " + obat[i].nama);
                System.out.println("Kategori obat   : " + obat[i].kategori);
                System.out.println("stok            : " + obat[i].stok);
                System.out.println("Jumlah          : " + obat[i].jumlah);
            }
        }
    }

    public static void daftarObat(Obat[] obat) {
        int n = obat.length;
        Obat temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (obat[j].stok > obat[j + 1].stok) {
                    temp = obat[j];
                    obat[j] = obat[j + 1];
                    obat[j + 1] = temp;
                }
            }
        }
    }

}
