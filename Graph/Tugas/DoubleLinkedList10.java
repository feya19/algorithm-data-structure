package Graph.Tugas;

public class DoubleLinkedList10 {
    Node10 head;
    int size;
    
    public DoubleLinkedList10(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    
    public int size(){
        return size;
    }
    
    public void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node10(null, item, jarak, null);
        } else {
            Node10 newNode = new Node10(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index Di luar batas");
        } 
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }
    
    public void remove(int index) {
        Node10 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                } 
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }
    
    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        }
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }

    public void updateJarak(int index, int jarak) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index Di luar batas");
        }
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.jarak = jarak;
    }
}
