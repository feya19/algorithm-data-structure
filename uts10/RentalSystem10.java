package uts10;

public class RentalSystem10 {
    public Barang10[] barangList10;
    public int idx10;

    public RentalSystem10() {
        barangList10 = new Barang10[10];
        idx10 = 0;
    }

    public void addBarang(Barang10 barang10) {
        if (idx10 < barangList10.length) {
            barangList10[idx10++] = barang10;
        } else {
            System.out.println("Kapasitas barang sudah penuh.");
        }
    }

    public void displayDataSort(String attr10, String order10) {
        if (order10.equals("ascending")) {
            sortBarangAsc(order10, attr10);
        } else {
            sortBarangDesc(order10, attr10);
        }

        for (int i = 0; i < idx10; i++) {
            barangList10[i].display();
        }
    }

    public void sortBarangAsc(String order, String attr) {
        for (int i = 0; i < idx10 - 1; i++) {
            for (int j = 0; j < idx10 - i - 1; j++) {
                if (barangList10[j].getAttributeStringValue(attr).compareTo(barangList10[j + 1].getAttributeStringValue(attr)) > 0) {
                    Barang10 temp10 = barangList10[j];
                    barangList10[j] = barangList10[j + 1];
                    barangList10[j + 1] = temp10;
                }
            }
        }
    }

    public void sortBarangDesc(String order, String attr) {
        for (int i = 0; i < idx10 - 1; i++) {
            for (int j = 0; j < idx10 - i - 1; j++) {
                if (barangList10[j].getAttributeStringValue(attr).compareTo(barangList10[j + 1].getAttributeStringValue(attr)) < 0) {
                    Barang10 temp10 = barangList10[j];
                    barangList10[j] = barangList10[j + 1];
                    barangList10[j + 1] = temp10;
                }
            }
        }
    }

    public Barang10[] search(String attr10, String value10) {
        int count10 = 0;
        for (int i = 0; i < idx10; i++) {
            if (barangList10[i].getAttributeStringValue(attr10).equalsIgnoreCase(value10)) {
                count10++;
            }
        }
        
        Barang10[] searchResult10 = new Barang10[count10];
        
        int indexResutl10 = 0;
        for (int i = 0; i < idx10; i++) {
            if (barangList10[i].getAttributeStringValue(attr10).equalsIgnoreCase(value10)) {
                searchResult10[indexResutl10++] = barangList10[i];
            }
        }
        
        return searchResult10;
    }

}
