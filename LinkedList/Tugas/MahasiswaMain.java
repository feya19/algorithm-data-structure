package LinkedList.Tugas;

public class MahasiswaMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.addFirst(112, "Prita");
        singLL.print();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
        singLL.insertAfter(112, 113, "Yusuf");
        singLL.print();
        singLL.insertAt(3, 833, "Doni");
        singLL.print();
    }
}
