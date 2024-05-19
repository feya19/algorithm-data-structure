package DoubleLinkedList.Tugas2;


public class FilmList {
    Film head;
    int size;

    public FilmList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String title, double rating) {
        if (isEmpty()) {
            head = new Film(id, title, rating, null, null);
        } else {
            Film newFilm = new Film(id, title, rating, null, head);
            head.prev = newFilm;
            head = newFilm;
        }
        size++;
    }

    public void addLast(int id, String title, double rating) {
        if (isEmpty()) {
            addFirst(id, title, rating);
        } else {
            Film current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film newFilm = new Film(id, title, rating, current, null);
            current.next = newFilm;
            size++;
        }
    }

    public void add(int id, String title, double rating, int index) throws Exception  {
        if (isEmpty()) {
            addFirst(id, title, rating);
            return;
        } else if (index < 0 || index > size) {
            throw new Exception("nilai index di luar batas");
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Film node = new Film(id, title, rating, null, null);
                current.prev = node;
                head = node;
            } else {
                Film node = new Film(id, title, rating, current.prev, current);
                node.prev = current.prev;
                node.next = current;
                current.prev.next = node;
                current.prev = node;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Film current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception  {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if(index == 0) {
            removeFirst();
        } else {
            Film current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
        size--;
    }

    public Film searchById(int id) {
        Film current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortRatingDescending() {
        Film current = head;
        Film next = null;
        while (current != null) {
            next = current.next;
            while (next != null) {
                if (current.rating < next.rating) {
                    double temp = current.rating;
                    current.rating = next.rating;
                    next.rating = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }

    public void printList() {
        Film current = head;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}
