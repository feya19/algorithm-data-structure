package Tree.Praktikum2;

public class BinaryTreeArray10 {
    int[] data;
    int idxLast;

    public BinaryTreeArray10(int size) {
        this.data = new int[size];
        this.idxLast = -1;
    }

    public void add(int data) {
        if (idxLast == this.data.length - 1) {
            System.out.println("Tree is full");
            return;
        }
        idxLast++;
        this.data[idxLast] = data;
    }

    public void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
