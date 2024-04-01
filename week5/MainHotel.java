package week5;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();

        Hotel h1 = new Hotel("Crown", "Tulungagung", 487000, (byte) 5);
        Hotel h2 = new Hotel("THE 1O1", "Malang", 800000, (byte) 3);
        Hotel h3 = new Hotel("Narita", "Tulungagung", 225000, (byte) 4);
        Hotel h4 = new Hotel("Hotel Brawijaya", "Malang", 100000, (byte) 2);
        Hotel h5 = new Hotel("Istana", "Tulungagung", 150000, (byte) 1);

        
        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);
        
        System.out.println("Data sebelum diurutkan:");
        list.tampilAll();

        System.out.println("Data setelah bubble sort harga termurah hingga tertinggi:");
        list.bubbleSortHarga();
        list.tampilAll();
        System.out.println("Data setelah selection sort harga termurah hingga tertinggi:");
        list.bubbleSortHarga();
        list.tampilAll();
        
        System.out.println("Data setelah bubble sort bintang tertinggi hingga terendah:");
        list.bubbleSortBintang();
        list.tampilAll();
        System.out.println("Data setelah selection sort bintang tertinggi hingga terendah:");
        list.bubbleSortBintang();
        list.tampilAll();
    }
}