package week5;

public class HotelService {
    Hotel rooms[] = new Hotel[5];
    int idx;

    void tambah(Hotel h){
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAll(){
        for (Hotel h: rooms) {
            h.tampil();
            System.out.println("-----------------------");
        }
    }

    void bubbleSortHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }
    
    void bubbleSortBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].bintang > rooms[j - 1].bintang) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSortHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idMin = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[idMin].harga < rooms[j].harga) {
                    idMin = j;
                }
            }
            Hotel tmp = rooms[idMin];
            rooms[idMin] = rooms[i];
            rooms[i] = tmp;
        }
    }
    
    void selectionSortBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[idMax].bintang > rooms[j].bintang) {
                    idMax = j;
                }
            }
            Hotel tmp = rooms[idMax];
            rooms[idMax] = rooms[i];
            rooms[i] = tmp;
        }
    }
}
