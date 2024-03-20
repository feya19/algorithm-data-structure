package week4;

public class Mobil {
    String merk;
    String tipe;
    int tahun;
    double top_acceleration;
    double top_power;

    public Mobil(String merk, String tipe, int tahun, double top_acceleration, double top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public int getTahun() {
        return tahun;
    }

    public double getTopAccel() {
        return top_acceleration;
    }

    public double getTopPower() {
        return top_power;
    }
}
