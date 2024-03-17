package week3;

public class Kerucut {
    public double jariJari, sisiMiring;

    public Kerucut(double jariJari, double sisiMiring) {
        this.jariJari = jariJari;
        this.sisiMiring = sisiMiring;
    }

    public double getVolume() {
        double sisiMiring2 = Math.pow(sisiMiring, 2);
        double luas = Math.pow(jariJari, 2);
        double tinggi = Math.sqrt(sisiMiring2 - jariJari);
        return (1.0 / 3) * Math.PI * luas * tinggi;
    }

    public double getLuasPermukaan() {
        return Math.PI * jariJari * (jariJari + sisiMiring);
    }
}

