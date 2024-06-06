package JavaCollection.Praktikum3;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
 
public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();
     
    public void tambah(Mahasiswa... mahasiswa){
       mahasiswas.addAll(Arrays.asList(mahasiswa));
    }
     
    public void hapus(int index){
        mahasiswas.remove(index);
    }
    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }
    public void tampil(){
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(""+mhs.toString());
        });
    }
    
    public int linierSearch(String nim){
        for (int i = 0;i < mahasiswas.size();i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String nim) {
        Mahasiswa key = new Mahasiswa(nim, "", "");
        return Collections.binarySearch(mahasiswas, key);
    }

    public void sortingAscending() { 
        Collections.sort(mahasiswas, (m1, m2) -> m1.nim.compareTo(m2.nim)); 
    } 
     
    public void sortingDescending() { 
        Collections.sort(mahasiswas, (m1, m2) -> m2.nim.compareTo(m1.nim)); 
    } 

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "shannum", "021xx3");
        
        lm.tambah(m, m1,m2);
        lm.tampil();
        lm.update(
            lm.binarySearch("201235"),
            new Mahasiswa("201235", "akhleema lela", "021xx2")
        );
        System.out.println("");
        lm.tampil();

        lm.sortingAscending(); 
        System.out.println("\nSetelah Sorting Ascending:"); 
        lm.tampil(); 

        lm.sortingDescending(); 
        System.out.println("\nSetelah Sorting Descending:"); 
        lm.tampil();
    }
}
