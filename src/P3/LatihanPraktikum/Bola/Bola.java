package P3.LatihanPraktikum.Bola;

public class Bola {
    public double phi = 3.14;
    public double jariJari;

    public double hitungLuasPermukaanBola() {
        double volume = 4.0 * phi * jariJari * jariJari;
        return Math.floor(volume * 10) / 10.0;
    }

    public double hitungVolumeBola() {
        double luasPermukaan = hitungLuasPermukaanBola() * jariJari / 3;
        return Math.floor(luasPermukaan * 10) / 10.0;

    }
}
