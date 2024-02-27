package P3.LatihanPraktikum.Mahasiswa;

public class Mahasiswa {
    public String nama;
    public long nim;
    public String jenisKelamin;
    public double ipk;

    public double hitungRataIPK(Mahasiswa[] mhs) {
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : mhs) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk / mhs.length;
    }

    public int ipkTerbesar(Mahasiswa[] mhs) {

        int indexIpkTerbesar = 0;
        for (int i = 0; i < mhs.length; i++) {
            if (mhs[i].ipk > mhs[indexIpkTerbesar].ipk) {
                indexIpkTerbesar = i;
            }
        }
        return indexIpkTerbesar;
    }
}
