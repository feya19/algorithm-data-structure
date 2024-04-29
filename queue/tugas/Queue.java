package queue.tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        }
        return false;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: "+ antrian[front].nama + " | " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen paling belakang: "+ antrian[rear].nama + " | " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " | " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " | " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = dt;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli dt = new Pembeli();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            for (int j = 1; j <= size; j++) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Nama: "+ nama + " berada di antrian ke-"+ j);
                    break;
                }
                i = (i + 1) % max;
            }
        }
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            for (int j = 1; j <= size; j++) {
                System.out.println(j + ". " + antrian[i].nama);
                i = (i + 1) % max;
            }
            System.out.println("Jumlah antrian = " + size);
        }
    }
}