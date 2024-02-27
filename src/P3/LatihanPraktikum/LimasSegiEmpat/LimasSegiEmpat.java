package P3.LatihanPraktikum.LimasSegiEmpat;

public class LimasSegiEmpat {
    public int sisiAlas;
    public int tinggiLimas;

    public double volumeLimas() {
        double volume = sisiAlas * sisiAlas * tinggiLimas / 3;
        return Math.floor(volume * 10) / 10.0;

    }

    public double luasPermukaanLimas() {
        double tingiSisiTegak = Math.sqrt(tinggiLimas * tinggiLimas + (sisiAlas / 2) * (sisiAlas / 2));
        double luasSisiTegak = tingiSisiTegak * sisiAlas / 2;
        double luasPermukaan = (sisiAlas * sisiAlas) + (luasSisiTegak * 4);
        return Math.floor(luasPermukaan * 10) / 10.0;

    }
}
