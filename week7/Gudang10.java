package week7;

public class Gudang10 {
    int size, top;
    Barang10[] tumpukan;

    public Gudang10(int kapasitas) {
        this.size = kapasitas;
        this.tumpukan = new Barang10[size];
        this.top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang10 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+ brg.nama +" berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang10 ambilBarang() {
        if (!cekKosong()) {
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+ delete.nama +" diambil dari Gudang.");
            System.out.println("Kode unik dalam biner:  "+ konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang10 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang10 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+ barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
    
    public Barang10 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang10 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: "+ barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang10 cariBarang(String search) {
        if (!cekKosong()) {
            for (int i = top; i >= 0 ; i--) {
                String kode = String.valueOf(tumpukan[i].kode);
                if (tumpukan[i].nama.equalsIgnoreCase(search) || kode.equals(search)) {
                    System.out.println("Barang ditemukan: ");
                    System.out.println("Kode:\t"+ tumpukan[i].kode);
                    System.out.println("Nama:\t"+ tumpukan[i].nama);
                    System.out.println("Kategori:\t"+ tumpukan[i].kategori);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang tidak ditemukan.");
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
        return null;
    }

    public void tampilkanBarang() {
        if (!cekKosong()) { 
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0 ; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi10 stack = new StackKonversi10();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
