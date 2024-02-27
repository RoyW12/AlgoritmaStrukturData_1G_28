package P3.ArrayBalok;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public int hitungKeliling() {
        double tempSisiMiring = (Math.sqrt(alas * alas + tinggi * tinggi));
        int sisiMiring = (int) Math.round(tempSisiMiring);
        return sisiMiring + alas + tinggi;
    }
}
