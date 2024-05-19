package LinkedList.Tugas;

public class SingleLinkedList {
    MahasiswaNode head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            MahasiswaNode tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print("\nNim: "+tmp.nim + " | Nama:"+ tmp.nama+ "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input, String nama) {
        MahasiswaNode ndInput = new MahasiswaNode(input, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }
    
    void addLast(int input, String nama) {
        MahasiswaNode ndInput = new MahasiswaNode(input, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        MahasiswaNode ndInput = new MahasiswaNode(nim, nama, null);
        MahasiswaNode temp = head;
    
        do {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                return;
            }
            temp = temp.next;
        } while (temp != null);
    }

    void insertAt(int index, int input, String nama) {
        if (index < 0) { System.out.println("Indeks harus lebih dari atau sama dengan 0"); 
        } else if (index == 0) {
            addFirst(input, nama); 
        } else { 
            MahasiswaNode temp = head;
            for (int i = 0; i < index - 1; i++) {
                 temp = temp.next; 
            } 
            temp.next = new MahasiswaNode(input, nama, temp.next); 
            if (temp.next.next == null) {
                tail = temp.next; 
            } 
        } 
    }

    String getFirst() {
        MahasiswaNode tmp = head;
        return "NIM: "+tmp.nim+ " | Nama: "+tmp.nama;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }
}
