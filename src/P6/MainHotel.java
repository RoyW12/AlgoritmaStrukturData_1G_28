package P6;

public class MainHotel {
    public static void main(String[] args) {
        HotelService ht = new HotelService();
        Hotel h1 = new Hotel("Surya Hotel", "Kediri", 300000, Byte.valueOf("3"));
        Hotel h2 = new Hotel("Victory Hotel", "Batu", 200000, Byte.valueOf("2"));
        Hotel h3 = new Hotel("Nirwana Hotel", "Malang", 150000, Byte.valueOf("4"));
        Hotel h4 = new Hotel("Ciputra Hotel", "Surabaya", 400000, Byte.valueOf("2"));
        Hotel h5 = new Hotel("Fave Hotel", "Denpasar", 500000, Byte.valueOf("5"));

        ht.tambah(h1);
        ht.tambah(h2);
        ht.tambah(h3);
        ht.tambah(h4);
        ht.tambah(h5);

        System.out.println("Sebelum di sorting");
        ht.tampilAll();

        System.out.println();
        System.out.println();

        // sorting berdasarkan Harga
        // ht.bubbleSortHarga();
        // System.out.println("Setelah di sorting menggunakan bubble sort berdasarkan
        // harga");
        // ht.tampilAll();

        // ht.selectionSortHarga();
        // System.out.println("Setelah di sorting menggunakan selection sort berdasarkan
        // harga");
        // ht.tampilAll();

        // // sorting berdasarkan bintang
        // ht.bubbleSortBintang();
        // System.out.println("Setelah di sorting menggunakan bubble sort berdasarkan
        // bintang");
        // ht.tampilAll();

        ht.selectionSortBintang();
        System.out.println("Setelah di sorting menggunakan berdasarkan bintang");
        ht.tampilAll();

    }
}
