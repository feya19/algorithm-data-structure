package Graph.Praktikum1;

public class Node10 {
    int data, jarak;
    Node10 prev, next;
    
    public Node10(Node10 prev, int data, int jarak, Node10 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}