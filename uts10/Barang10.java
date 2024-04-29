package uts10;

public class Barang10 {
    public int id10;
    public String name10;
    public int quantity10;
    public double price10;

    public Barang10(int id10, String name10, int quantity10, double price10) {
        this.id10 = id10;
        this.name10 = name10;
        this.quantity10 = quantity10;
        this.price10 = price10;
    }

    public String getAttributeStringValue(String attr10) {
        switch (attr10) {
            case "id":
                return String.valueOf(id10);
            case "name":
                return name10;
            case "quantity":
                return String.valueOf(quantity10);
            case "price":
                return String.valueOf(price10);
            default:
                return "";
        }
    }
    
    public void display() {
        System.out.println("-----------------------");
        System.out.println("Id\t: "+ id10);
        System.out.println("Nama\t: "+ name10);
        System.out.println("Jumlah\t: "+ quantity10);
        System.out.println("Harga\t: "+ price10);
    }
}

