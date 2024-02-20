package P2;

class Buku {
    String judul, pengarang;
    int halaman, stok, harga, terjual;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp : " + harga);
        System.out.println("Terjual: " + terjual);
        System.out.println("Harga total : " + hitungHargaTotal());
        System.out.println("Diskon: " + hitungDiskon());
        System.out.println("Harga Bayar : " + hitunghargabayar());
    }

    void terjual(int jml) {

        if (stok > 0) {
            stok -= jml;
            terjual = jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        int hargaTotal = terjual * harga;
        return hargaTotal;
    }

    int hitungDiskon() {

        if (hitungHargaTotal() > 150000) {
            double diskon = hitungHargaTotal() * 0.12;
            int diskonInt = (int) diskon;
            return diskonInt;

        } else if (hitungHargaTotal() > 75000 & hitungHargaTotal() < 150000) {
            double diskon = hitungHargaTotal() * 0.05;
            int diskonInt = (int) diskon;
            return diskonInt;
        } else {
            double diskon = hitungHargaTotal() * 0;
            int diskonInt = (int) diskon;
            return diskonInt;
        }
    }

    int hitunghargabayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

    public Buku() {

    }

    public Buku(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}
