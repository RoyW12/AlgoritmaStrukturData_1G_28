package P10;

public class Gudang27 {
    Barang27 tumpukan[];
    int size;
    int top;

    Gudang27(int kapasitas) {
        this.size = kapasitas;
        tumpukan = new Barang27[kapasitas];
        top = -1;

    }

    boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(Barang27 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang ");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    Barang27 ambilbarang() {
        if (!cekKosong()) {
            Barang27 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    Barang27 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang27 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong");
        }
    }

}
