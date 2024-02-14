package P1;

public class Fungsi28 {
    public static void main(String[] args) {
        double hargaAglonema = 75000;
        double hargaKeladi = 50000;
        double hargaAlocasia = 60000;
        double hargaMawar = 10000;
        int[][] flowerStock = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };/*
                                                                                                         * baris
                                                                                                         * menunjukkan
                                                                                                         * sebagai
                                                                                                         * cabang toko
                                                                                                         * tersebut,
                                                                                                         * kolom
                                                                                                         * menunjukkan
                                                                                                         * sebagai bunga
                                                                                                         * bunga yg
                                                                                                         * dijual
                                                                                                         */
        int algonemaRusak = 1, keladiRusak = 2, alocasiaRusak = 0, mawarRusak = 5;
        pendapatan(hargaAglonema, hargaKeladi, hargaAlocasia, hargaMawar, flowerStock);
        jumlahStock(flowerStock, 4, algonemaRusak, keladiRusak, alocasiaRusak, mawarRusak);

    }

    static void pendapatan(double hargaAglonema, double hargaKeladi, double hargaAlocasia, double hargaMawar,
            int[][] stock) {
        double[] pendapatan = new double[stock.length];
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock.length; j++) {
                double total;
                switch (j) {
                    case 0:
                        total = stock[i][j] * hargaAglonema;
                        pendapatan[i] += total;
                        break;
                    case 1:
                        total = stock[i][j] * hargaKeladi;
                        pendapatan[i] += total;
                        break;
                    case 2:
                        total = stock[i][j] * hargaAlocasia;
                        pendapatan[i] += total;
                        break;
                    case 3:
                        total = stock[i][j] * hargaMawar;
                        pendapatan[i] += total;
                        break;
                }
            }
            System.out.println("Pendapatan RoyalGarden cabang ke-" + (i + 1) + " = " + pendapatan[i]);
        }
    }

    static void jumlahStock(int[][] stock, int cabang, int algonemaRusak, int keladiRusak, int alocasiaRusak,
            int mawarRusak) {
        int stockAlgonema, stockKeladi, stockAlocasia, stockMawar;

        for (int i = 0; i < stock[cabang - 1].length; i++) {
            switch (i) {
                case 0:
                    stockAlgonema = (stock[cabang - 1][i] - algonemaRusak);
                    System.out.println("stock bunga algonema : " + stockAlgonema);
                    break;
                case 1:
                    stockKeladi = (stock[cabang - 1][i] - keladiRusak);
                    System.out.println("stock bunga Keladi : " + stockKeladi);
                    break;
                case 2:
                    stockAlocasia = (stock[cabang - 1][i] - alocasiaRusak);
                    System.out.println("stock bunga Alocasia : " + stockAlocasia);
                    break;
                case 3:
                    stockMawar = (stock[cabang - 1][i] - mawarRusak);
                    System.out.println("stock bunga Mawar : " + stockMawar);
                    break;
            }
        }
    }
}
