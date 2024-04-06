package P7;

public class PencarianBuku27 {
    Buku27 listBk[] = new Buku27[5];
    int idx;

    void tambah(Buku27 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku27 m : listBk) {
            m.TampilDataBuku();
        }
    }

    // public int FindSeqSearch(int cari) {
    // int posisi = -1;
    // for (int i = 0; i < listBk.length; i++) {
    // if (listBk[i].kodeBuku == cari) {
    // posisi = i;
    // break;
    // }
    // }
    // return posisi;
    // }

    void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);

        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }

    void TampilPosisiJudul(String x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void TampilDataJudul(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBk[pos].pengarang);
            System.out.println("Stock\t : " + listBk[pos].stock);

        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }

    // public Buku27 FindBuku(int cari) {
    // for (int i = 0; i < listBk.length; i++) {
    // if (listBk[i].kodeBuku == cari) {
    // return listBk[i];
    // }
    // }
    // return listBk[-1];
    // }

    // int FindBinarySearch(int cari, int left, int right) {
    // int mid;
    // if (right >= left) {
    // mid = (right + left) / 2;
    // if (cari == listBk[mid].kodeBuku) {
    // return mid;

    // } else if (listBk[mid].kodeBuku < cari) {
    // return FindBinarySearch(cari, left, mid - 1);
    // } else {
    // return FindBinarySearch(cari, mid + 1, right);
    // }
    // }
    // return -1;
    // }

    int FindBinarySearchString(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            int kodeBukuInt = Integer.parseInt(listBk[mid].kodeBuku);
            if (cari == kodeBukuInt) {
                return mid;

            } else if (kodeBukuInt < cari) {
                return FindBinarySearchString(cari, left, mid - 1);
            } else {
                return FindBinarySearchString(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public int FindSeqSearchString(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            int kodeBukuInt = Integer.parseInt(listBk[i].kodeBuku);
            if (kodeBukuInt == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int FindSeqSearchBookTitle(String cariJudul) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            boolean result = listBk[i].judulBuku.equals(cariJudul);
            if (result) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    int FindBinarySearchBookTitle(String cariJudul, int left, int right) {
        bubbleSortBookTitle();
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            int result = cariJudul.compareTo(listBk[mid].judulBuku);
            if (result == 0) {
                return mid;

            } else if (result < 0) {
                return FindBinarySearchBookTitle(cariJudul, left, mid - 1);
            } else {
                return FindBinarySearchBookTitle(cariJudul, mid + 1, right);
            }
        }
        return -1;
    }

    void bubbleSortBookTitle() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 1; j < listBk.length - i; j++) {
                if (listBk[j].kodeBuku.compareTo(listBk[j - 1].kodeBuku) > 0) {
                    Buku27 tmp = listBk[j];
                    listBk[j] = listBk[j - 1];
                    listBk[j - 1] = tmp;
                }
            }
        }
    }
}
