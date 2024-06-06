package JavaCollection.Praktikum3;

public class Mahasiswa implements Comparable<Mahasiswa> { 
    String nim, nama, notelp; 
         
    public Mahasiswa(){} 
         
    public Mahasiswa(String nim, String nama, String notelp){ 
        this.nim = nim; 
        this.nama = nama; 
        this.notelp = notelp; 
    } 
    
    public int compareTo(Mahasiswa other) {
        return this.nim.compareTo(other.nim);
    }

    public String toString(){ 
        return "Mahasiswa{" + "nim=" + nim + ", nama="+ nama +", notelp="+ notelp + '}'; 
    } 
} 
