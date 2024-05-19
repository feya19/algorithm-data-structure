package DoubleLinkedList.Tugas2;

public class Film {
    int id;
    String title;
    double rating;
    Film prev;
    Film next;

    public Film(int id, String title, double rating, Film prev, Film next) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }

    public void print() {
        System.out.println("ID: " + id + ", Title: " + title + ", Rating: " + rating);
    }
}