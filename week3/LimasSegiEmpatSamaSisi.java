package week3;

public class LimasSegiEmpatSamaSisi {

    public double panjangSisiAlas, tinggiLimas;

    public LimasSegiEmpatSamaSisi(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double getLuasPermukaan() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        double luasSisiTegak = 4 * (0.5 * panjangSisiAlas * tinggiLimas);
        return luasAlas + luasSisiTegak;
    }

    public double getVolume() {
        double luasAlas = panjangSisiAlas * panjangSisiAlas;
        return (1.0 / 3) * luasAlas * tinggiLimas;
    }
}
