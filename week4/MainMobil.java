package week4;

public class MainMobil {
    public static Mobil findMaxTopAccel(Mobil[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low];
        }

        int mid = (low + high) / 2;
        Mobil leftMax = findMaxTopAccel(mobil, low, mid);
        Mobil rightMax = findMaxTopAccel(mobil, mid + 1, high);

        if (leftMax.getTopAccel() > rightMax.getTopAccel()) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public static Mobil findMinTopAccel(Mobil[] mobil, int low, int high) {
        if (low == high) {
            return mobil[low];
        }

        int mid = (low + high) / 2;
        Mobil leftMin = findMinTopAccel(mobil, low, mid);
        Mobil rightMin = findMinTopAccel(mobil, mid + 1, high);

        if (leftMin.getTopAccel() < rightMin.getTopAccel()) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    public static double calculateAvgTopPower(Mobil[] mobil) {
        double totalPower = 0.0;
        for (Mobil car : mobil) {
            totalPower += car.getTopPower();
        }
        return totalPower / mobil.length;
    }

    public static void main(String[] args) {
        Mobil[] mobil = {
            new Mobil("BMW", "M2 Coupe", 2016, 68.61, 728),
            new Mobil("Ford", "Fiesta ST", 2014, 37.21, 575),
            new Mobil("Nissan", "370Z", 2009, 43.60, 657),
            new Mobil("Subaru", "BRZ", 2014, 40.58, 609),
            new Mobil("Subaru", "Impreza WRX STI", 2013, 62.55, 703),
            new Mobil("Toyota", "AE86 Trueno", 1986, 37.00, 553),
            new Mobil("Toyota", "86/GT86", 2014, 41.80, 609),
            new Mobil("Volkswagen", "Golf GTI", 2014, 41.80, 631)
        };

        Mobil fastestAccelCar = findMaxTopAccel(mobil, 0, mobil.length - 1);
        System.out.println("Mobil dengan top acceleration tertinggi: " + fastestAccelCar.merk + " - " + fastestAccelCar.tipe);

        Mobil slowestAccelCar = findMinTopAccel(mobil, 0, mobil.length - 1);
        System.out.println("Mobil dengan top acceleration terendah: " + slowestAccelCar.merk + " - " + slowestAccelCar.tipe);

        double avgTopPower = calculateAvgTopPower(mobil);
        System.out.println("Rata-rata top power: " + avgTopPower);
    }
}
