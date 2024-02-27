package P3.LatihanPraktikum.Kerucut;

public class Kerucut {
    public double phi = 3.14;
    public double jariJari;
    public int sisiMiring;

    public double hitungLuasPermukaanKerucut() {
        double luasPermukaan = (phi * jariJari * (double) sisiMiring) + (phi * jariJari * jariJari);
        return Math.floor(luasPermukaan * 10) / 10.0;
    }

    public double hitungVolumeKerucut() {
        double tinggiKerucut = Math.sqrt(sisiMiring * sisiMiring - jariJari / 2 * jariJari / 2);
        double volume = phi * jariJari * jariJari * tinggiKerucut / 3;
        return Math.floor(volume * 10) / 10.0;
    }
}
