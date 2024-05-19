package DoubleLinkedList.Tugas1;

public class Queue {
    Node head;
    Node tail;
    int size;

    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(String name, int no) {
        Node node = new Node(name, no);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void remove() {
        if (head == null) {
            System.out.println("Antrian Kosong");
            return;
        }
        Node node = head;
        head = head.next;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
        System.out.println(node.name + " telah selesai divaksinasi");
    }

    public int getSize() {
        return size;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.println("No : " + node.no +" | Name: " + node.name);
            node = node.next;
        }
    }
}
